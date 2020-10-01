package org.asuraspark.sql.rule

//import org.apache.spark.CustomizeUtils
import org.apache.spark.scheduler.SparkListenerEvent
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.catalyst.catalog.{CatalogTable, HiveTableRelation}
import org.apache.spark.sql.catalyst.planning.PhysicalOperation
import org.apache.spark.sql.catalyst.plans.logical.{InsertIntoTable, LogicalPlan}
import org.apache.spark.sql.catalyst.rules.Rule
import org.apache.spark.sql.execution.command.{CreateDataSourceTableCommand, CreateTableCommand}
import org.apache.spark.sql.execution.datasources.CreateTable
import org.apache.spark.sql.hive.execution.InsertIntoHiveTable

import scala.collection.mutable

class DependencyCollectRule(sparkSession: SparkSession) extends Rule[LogicalPlan] {
  override def apply(plan: LogicalPlan): LogicalPlan = {
    if (sparkSession.sparkContext.getConf.getBoolean("spark.collectDependencies", defaultValue = true)) {
      val readTables = mutable.HashSet[String]()
      val writeTables = mutable.HashSet[String]()
      plan transformDown {
        case a@InsertIntoHiveTable(table: CatalogTable,_,_,_,_,_) =>
          writeTables += s"${fillBlankDatabase(table)}.${table.identifier.table}"
          a
        case i@InsertIntoTable(table: HiveTableRelation, _, _, _, _) =>
          writeTables += s"${table.tableMeta.database}.${table.tableMeta.identifier.table}"
          i
        case r@CreateDataSourceTableCommand(table: CatalogTable, _) =>
          writeTables += s"${fillBlankDatabase(table)}.${table.identifier.table}"
          r
        case c@CreateTable(table: CatalogTable, _, _) =>
          writeTables += s"${fillBlankDatabase(table)}.${table.identifier.table}"
          c
        case d@CreateTableCommand(table: CatalogTable, _) =>
          writeTables += s"${fillBlankDatabase(table)}.${table.identifier.table}"
          d
        case p@PhysicalOperation(_, _, table: HiveTableRelation) =>
          readTables += s"${table.tableMeta.database}.${table.tableMeta.identifier.table}"
          p
      }
      if (readTables.nonEmpty || writeTables.nonEmpty) {
        logInfo(String.format("\n src table -> %s \n target table -> %s", readTables.mkString(","), writeTables.mkString(",")))
//        CustomizeUtils.postEventToListenerBus(sparkSession, DependencyEvent(readTables, writeTables))
      }
    }
    plan
  }

  private def fillBlankDatabase(table: CatalogTable): String = {
    var database = sparkSession.sessionState.catalog.getCurrentDatabase
    if (table.database.nonEmpty) database = table.database
    database
  }

  case class DependencyEvent(readTables: mutable.HashSet[String], writeTables:mutable.HashSet[String]) extends SparkListenerEvent

}

object DependencyCollectRule{
  def apply(sparkSession: SparkSession): DependencyCollectRule = new DependencyCollectRule(sparkSession)
}
