package org.apache.spark.sql.hive.execution

import java.net.URI
import java.util.UUID

import org.apache.hadoop.fs.{FileSystem, Path}
import org.apache.hadoop.hive.ql.io.orc.OrcStruct
import org.apache.hadoop.hive.serde2.avro.AvroGenericRecordWritable
import org.apache.hadoop.io.{ArrayWritable, LongWritable, NullWritable, Text}
import org.apache.hadoop.mapred.lib.CombineTextInputFormat
import org.apache.spark.SparkException
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SaveMode
import org.apache.spark.sql.catalog.Table
import org.apache.spark.sql.catalyst.{InternalRow, TableIdentifier}
import org.apache.spark.sql.catalyst.catalog.CatalogTypes.TablePartitionSpec
import org.apache.spark.sql.catalyst.expressions.Attribute
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.execution.SparkPlan
import org.apache.spark.sql.execution.command.LoadDataCommand
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.hive.HiveExternalCatalog
import org.apache.spark.sql.hive.io.{CombineAvroFileInputFormat, CombineOrcFileInputFormat, CombineParquetFileInputFormat}

import scala.collection.mutable.ArrayBuffer

case class MergeTablePlan(
   plan: LogicalPlan,
   out: Seq[Attribute],
   table: TableIdentifier,
   partitionSpec: Option[TablePartitionSpec]) extends SparkPlan {

  override protected def doExecute(): RDD[InternalRow] = {
    val sparkSession = sqlContext.newSession().sparkSession
    val tableInfo = sparkSession.catalog.listTables(table.table).collect()
    if(!tableInfo.isEmpty){
//      tableInfo.length match {
//        case zero if zero == 0 =>
//          throw new SparkException(s"No table information: ${table.table}")
//        case more if more > 1 =>
//          throw new SparkException(
//            s"There are multiple tables, unable to determine which table to operate: " +
//              s"${tableInfo.mkString(",")}")
//      }
//      val localTable = tableInfo.head


    } else {
      val hiveClient = sparkSession.sharedState.externalCatalog
        .unwrapped.asInstanceOf[HiveExternalCatalog].client

      val catalogTable = hiveClient.getTable(table.database.getOrElse("default"), table.table)
      val provider = catalogTable.provider.getOrElse("default")

      val tablePartitions =
        hiveClient.getPartitions(table.database.getOrElse("default"), table.table, partitionSpec)

      val newHadoopConf = sparkSession.sessionState.newHadoopConf()
      val defaultFSConf = newHadoopConf.get("fs.defaultFS")
      val defaultFS = if (defaultFSConf == null) new URI("") else new URI(defaultFSConf)
      val blockSize = newHadoopConf.getLong("dfs.block.size", 128)

      tablePartitions.foreach(p => {

        val curFS = FileSystem.get(p.location, newHadoopConf)

        val fileIter = curFS.listFiles(null, false)

        val fileInfo = new ArrayBuffer[Long]()
        while (fileIter.hasNext) {
          val fileStatus = fileIter.next()
          if(fileStatus.isDirectory){
            throw new RuntimeException("Does not support nested partitions!")
          }
          fileInfo.append(fileStatus.getLen)
        }
        val totalSizeByCurPartition = fileInfo.sum
        val parallelism = {
          val value = totalSizeByCurPartition / blockSize
          if(value < 1) 1 else value
        }.toInt

        val uriPath = new Path(s"/user/${System.getProperty("user.name")}/")
        val tmpPath = LoadDataCommand.makeQualified(defaultFS, uriPath,
          new Path(p.location.getPath + s"-${UUID.randomUUID().toString.replaceAll("-","")}-merge-table-tmp"))
        val srcPath = new Path(p.location)

        // 先写暂存目录,写成功后删除原来目录文件,重命名暂存目录
        val read = sparkSession.read

        val sc = sparkSession.sparkContext
//        provider match {
//          case "json" =>
//            read.json(srcPath.toString).repartition(parallelism)
//              .write.mode(SaveMode.Overwrite).json(tmpPath.toString)
//          case "csv" =>
//            read.csv(srcPath.toString).repartition(parallelism)
//              .write.mode(SaveMode.Overwrite).csv(tmpPath.toString)
//          case "parquet" =>
//            read.parquet(srcPath.toString).repartition(parallelism)
//              .write.mode(SaveMode.Overwrite).parquet(tmpPath.toString)
//          case "orc" =>
//            read.orc(srcPath.toString).repartition(parallelism)
//              .write.mode(SaveMode.Overwrite).orc(tmpPath.toString)
//        }

        // spark 读优化
        provider match {
          case "json" || "csv" =>
            sc.newAPIHadoopFile(srcPath.toString,
              classOf[CombineTextInputFormat],
              classOf[LongWritable],
              classOf[Text])
              .saveAsTextFile(tmpPath.toString)
          case "parquet" =>
            sc.newAPIHadoopFile(srcPath.toString,
              classOf[CombineParquetFileInputFormat],
              classOf[NullWritable],
              classOf[ArrayWritable])
              .saveAsTextFile(tmpPath.toString)
          case "orc" =>
            sc.newAPIHadoopFile(srcPath.toString,
              classOf[CombineOrcFileInputFormat],
              classOf[NullWritable],
              classOf[OrcStruct])
              .saveAsTextFile(tmpPath.toString)
          case "avro" =>
            sc.newAPIHadoopFile(srcPath.toString,
              classOf[CombineAvroFileInputFormat],
              classOf[NullWritable],
              classOf[AvroGenericRecordWritable])
              .saveAsTextFile(tmpPath.toString)
          case e: String =>
            throw new RuntimeException(s"Not support file type: ${e}")
        }

        curFS.delete(srcPath)
        curFS.rename(tmpPath, srcPath)
        log.info(s"merge partition successfully: ${p.simpleString}")
      })
      log.info(s"merge table successfully: ${table.table}")
    }
    sparkContext.emptyRDD
  }

  override def children: Seq[SparkPlan] = {
    Seq.empty
  }
  override def output: Seq[Attribute] = {
    Seq.empty
  }

}
