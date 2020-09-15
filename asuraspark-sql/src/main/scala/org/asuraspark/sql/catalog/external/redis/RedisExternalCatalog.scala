package org.asuraspark.sql.catalog.external.redis

import java.lang.reflect.InvocationTargetException

import org.apache.spark.SparkConf
import org.apache.spark.internal.Logging
import org.apache.spark.sql.catalyst.analysis.{NoSuchDatabaseException, TableAlreadyExistsException}
import org.apache.spark.sql.{AnalysisException, SparkSession}
import org.apache.spark.sql.catalyst.catalog.CatalogTypes.TablePartitionSpec
import org.apache.spark.sql.catalyst.catalog.{CatalogDatabase, CatalogFunction, CatalogStatistics, CatalogTable, CatalogTablePartition, CatalogTypes, ExternalCatalog}
import org.apache.spark.sql.catalyst.expressions.Expression
import org.apache.spark.sql.types.StructType
import org.asuraspark.sql.catalog.external.redis.conf.RedisConf
import org.asuraspark.sql.catalog.external.redis.exception.{NotSupportException, RedisException}
import org.asuraspark.sql.catalog.external.redis.utils.RedisUtils
import redis.clients.jedis.{Jedis, JedisPool}

import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.util.control.NonFatal

class RedisExternalCatalog (sparkSession: SparkSession) extends ExternalCatalog with Logging {

  val REDIS_MAX_INDEX:Int = 32

  import CatalogTypes.TablePartitionSpec

  private val catalog = sparkSession.catalog

  lazy val client:JedisPool = {
    RedisUtils.newClient(sparkSession.sparkContext.getConf)
  }

  lazy val redisConf:RedisConf = {
    RedisUtils.getRedisConf(sparkSession.sparkContext.getConf)
  }

  private val clientExceptions = Set(classOf[RedisException].getCanonicalName)

  private def isClientException(e: Throwable): Boolean = {
    var temp: Class[_] = e.getClass
    var found = false
    while (temp != null && !found) {
      found = clientExceptions.contains(temp.getCanonicalName)
      temp = temp.getSuperclass
    }
    found
  }


  private def afterCloseResource[T](body: => T): T = synchronized {
    try {
      body
    } finally {

    }
  }

  private def withClient[T](body: => T): T = synchronized {
    try {
      body
    } catch {
      case NonFatal(exception) if isClientException(exception) =>
        val e = exception match {
          // Since we are using shim, the exceptions thrown by the underlying method of
          // Method.invoke() are wrapped by InvocationTargetException
          case i: InvocationTargetException => i.getCause
          case o => o
        }
        throw new RedisException(
          e.getClass.getCanonicalName + ": " + e.getMessage, Some(e))
    }
  }

  override def createDatabase(dbDefinition: CatalogDatabase, ignoreIfExists: Boolean): Unit =
    throw new NotSupportException("Not Support!")

  override def dropDatabase(db: String, ignoreIfNotExists: Boolean, cascade: Boolean): Unit =
    throw new NotSupportException("Not Support!")

  override def alterDatabase(dbDefinition: CatalogDatabase): Unit =
    throw new NotSupportException("Not Support!")

  override def getDatabase(db: String): CatalogDatabase =
    throw new NotSupportException("Not Support!")

  override def databaseExists(db: String): Boolean = {
    if(db.toInt <= REDIS_MAX_INDEX) true else throw new NoSuchDatabaseException(db)
  }

  override def listDatabases(): Seq[String] = {
    (0 to REDIS_MAX_INDEX).map(db => db.toString)
  }

  override def listDatabases(pattern: String): Seq[String] =
    throw new NotSupportException("Not Support!")

  override def setCurrentDatabase(db: String): Unit = {
    val resource = client.getResource
    try{
      withClient(resource.select(db.toInt))
    } finally {
      resource.close()
    }
  }

  override def createTable(tableDefinition: CatalogTable, ignoreIfExists: Boolean): Unit = {
    if(redisConf.otherRedisConf.operateRedis){
      val resource = client.getResource
      try{
        withClient{
          val db = tableDefinition.identifier.database.get
          requireDbExists(db)
          val table = tableDefinition.identifier.table
          if(ignoreIfExists) resource.hset(table,null,null)
          else {
            if(resource.exists(table)) throw new TableAlreadyExistsException(db = db, table = table)
            else resource.hset(table,null,null)
          }
        }
      } finally {
        resource.close()
      }
    }
  }

  override def dropTable(db: String, table: String, ignoreIfNotExists: Boolean, purge: Boolean): Unit = {
    if(redisConf.otherRedisConf.operateRedis){
      val resource = client.getResource
      try{
        withClient(resource.del(db))
      } finally {
        resource.close()
      }
    }
  }

  override def renameTable(db: String, oldName: String, newName: String): Unit = {
    if(redisConf.otherRedisConf.operateRedis){
      val resource = client.getResource
      try{
        withClient(resource.rename(oldName,newName))
      } finally {
        resource.close()
      }
    }
  }

  override def alterTable(tableDefinition: CatalogTable): Unit = {
    assert(tableDefinition.identifier.database.isDefined)
    val db = tableDefinition.identifier.database.get
    requireTableExists(db, tableDefinition.identifier.table)
    val updatedProperties = tableDefinition.properties.filter(kv => kv._1 != "comment")
    val newTableDefinition = tableDefinition.copy(properties = updatedProperties)
//    catalog(db).tables(tableDefinition.identifier.table).table = newTableDefinition
  }

  override def alterTableDataSchema(db: String, table: String, newDataSchema: StructType): Unit = ???

  override def alterTableStats(db: String, table: String, stats: Option[CatalogStatistics]): Unit = ???

  override def getTable(db: String, table: String): CatalogTable = ???

  override def tableExists(db: String, table: String): Boolean = {
    val resource = client.getResource
    try {
      setCurrentDatabase(db)
      withClient(resource.exists(table))
    } finally {
      resource.close()
    }
  }

  override def listTables(db: String): Seq[String] = {
    val resource = client.getResource
    try{
      setCurrentDatabase(db)
      withClient(resource.keys("*").asScala.toSeq)
    } finally {
      resource.close()
    }
  }

  override def listTables(db: String, pattern: String): Seq[String] = {
    val resource = client.getResource
    try{
      setCurrentDatabase(db)
      withClient(resource.keys(pattern).asScala.toSeq)
    } finally {
      resource.close()
    }
  }

  override def loadTable(db: String, table: String, loadPath: String, isOverwrite: Boolean, isSrcLocal: Boolean): Unit = ???

  override def loadPartition(db: String, table: String, loadPath: String, partition: TablePartitionSpec, isOverwrite: Boolean, inheritTableSpecs: Boolean, isSrcLocal: Boolean): Unit = ???

  override def loadDynamicPartitions(db: String, table: String, loadPath: String, partition: TablePartitionSpec, replace: Boolean, numDP: Int): Unit = ???

  override def createPartitions(db: String, table: String, parts: Seq[CatalogTablePartition], ignoreIfExists: Boolean): Unit = ???

  override def dropPartitions(db: String, table: String, parts: Seq[TablePartitionSpec], ignoreIfNotExists: Boolean, purge: Boolean, retainData: Boolean): Unit = ???

  override def renamePartitions(db: String, table: String, specs: Seq[TablePartitionSpec], newSpecs: Seq[TablePartitionSpec]): Unit = ???

  override def alterPartitions(db: String, table: String, parts: Seq[CatalogTablePartition]): Unit = ???

  override def getPartition(db: String, table: String, spec: TablePartitionSpec): CatalogTablePartition = ???

  override def getPartitionOption(db: String, table: String, spec: TablePartitionSpec): Option[CatalogTablePartition] = ???

  override def listPartitionNames(db: String, table: String, partialSpec: Option[TablePartitionSpec]): Seq[String] = ???

  override def listPartitions(db: String, table: String, partialSpec: Option[TablePartitionSpec]): Seq[CatalogTablePartition] = ???

  override def listPartitionsByFilter(db: String, table: String, predicates: Seq[Expression], defaultTimeZoneId: String): Seq[CatalogTablePartition] = ???

  override def createFunction(db: String, funcDefinition: CatalogFunction): Unit =
    throw new NotSupportException("Not Support!")

  override def dropFunction(db: String, funcName: String): Unit =
    throw new NotSupportException("Not Support!")

  override def alterFunction(db: String, funcDefinition: CatalogFunction): Unit =
    throw new NotSupportException("Not Support!")

  override def renameFunction(db: String, oldName: String, newName: String): Unit =
    throw new NotSupportException("Not Support!")

  override def getFunction(db: String, funcName: String): CatalogFunction =
    throw new NotSupportException("Not Support!")

  override def functionExists(db: String, funcName: String): Boolean =
    throw new NotSupportException("Not Support!")

  override def listFunctions(db: String, pattern: String): Seq[String] =
    throw new NotSupportException("Not Support!")
}
