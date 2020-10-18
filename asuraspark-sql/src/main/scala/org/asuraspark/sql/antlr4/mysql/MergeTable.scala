package org.asuraspark.sql.antlr4.mysql

import org.apache.spark.sql.{AnalysisException, Row, SparkSession}
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.catalyst.catalog.CatalogTableType
import org.apache.spark.sql.catalyst.catalog.CatalogTypes.TablePartitionSpec
import org.apache.spark.sql.catalyst.expressions.Attribute
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.execution.command.{DDLUtils, RunnableCommand}

case class MergeTable(
    table: LogicalPlan,
    partition: Map[String, Option[String]],
    overwrite: Boolean = true,
    ignoreIfExists: Boolean = true) extends LogicalPlan {

  override def output: Seq[Attribute] = Seq.empty
  override def children: Seq[LogicalPlan] = table :: Nil
}

/**
 * A command that merge table.
 *
 * The syntax of this command is:
 * {{{
 *  MERGE TABLE [IF NOT EXISTS] tablename
 *  [PARTITION (partcol1=val1, partcol2=val2 ...)]
 * }}}
 */
case class MergeTableCommand(
   table: TableIdentifier,
   partition: Option[TablePartitionSpec]) extends RunnableCommand {
  override def run(sparkSession: SparkSession): Seq[Row] = {
    val catalog = sparkSession.sessionState.catalog
    if (!catalog.tableExists(table) && !sparkSession.catalog.tableExists(table.table)) {
      throw new RuntimeException(s"Table does not exits: ${table.table}")
    }
    val localTable = sparkSession.catalog.getTable(table.table)
    if(Option(localTable).isDefined){
//      if (localTable.isTemporary) {
//        throw new RuntimeException(
//          s"Target table in MERGE TABLE cannot be a view: ${localTable.database}.${localTable.name}")
//      }
    } else {
      val targetTable = Option(catalog.getTableMetadata(table))
      if(targetTable.isDefined){
        val tableIdentwithDB = targetTable.get.identifier.quotedString
        if (targetTable.get.tableType == CatalogTableType.VIEW) {
          throw new RuntimeException(s"Target table in MERGE TABLE cannot be a view: $tableIdentwithDB")
        }
      }
    }
    Seq.empty[Row]
  }
}