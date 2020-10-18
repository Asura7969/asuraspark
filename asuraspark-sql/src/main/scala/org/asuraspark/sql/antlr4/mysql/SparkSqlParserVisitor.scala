package org.asuraspark.sql.antlr4.mysql

import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.catalyst.analysis.UnresolvedRelation
import org.apache.spark.sql.catalyst.parser.ParseException
import org.apache.spark.sql.catalyst.parser.ParserUtils.{checkDuplicateKeys, string, stringWithoutUnescape, withOrigin}
import org.apache.spark.sql.catalyst.parser.SqlBaseParser.PartitionSpecContext
import org.asuraspark.sql.antlr4.SparkParserParser.{ConstantContext, PartitionSpecContext, StringLiteralContext, TableIdentifierContext}
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.internal.SQLConf
import org.asuraspark.sql.antlr4.{SparkParserBaseVisitor, SparkParserParser}

import scala.collection.JavaConverters.asScalaBufferConverter

class SparkSqlParserVisitor(conf: SQLConf) extends SparkParserBaseVisitor[AnyRef]{
  override def visitSingleStatement(ctx: SparkParserParser.SingleStatementContext): LogicalPlan = withOrigin(ctx){
    visit(ctx.statement).asInstanceOf[LogicalPlan]
  }

  /**
   * 解析merge语法的logicplan
   * @param ctx the parse tree
   **/
  override def visitMergeTable(
      ctx: SparkParserParser.MergeTableContext): LogicalPlan = withOrigin(ctx){
    MergeTableCommand(
      table = visitTableIdentifier(ctx.tableIdentifier),
      partition = Option(ctx.partitionSpec).map(visitNonOptionalPartitionSpec)
    )
//    val tableIdent: TableIdentifier = visitTableIdentifier(ctx.tableIdentifier)
//    val partitionKeys = Option(ctx.partitionSpec).map(visitPartitionSpec).getOrElse(Map.empty)
//
//    val dynamicPartitionKeys: Map[String, Option[String]] = partitionKeys.filter(_._2.isEmpty)
//    if (ctx.EXISTS != null && dynamicPartitionKeys.nonEmpty) {
//      throw new ParseException(s"Dynamic partitions do not support IF NOT EXISTS. Specified " +
//        "partitions with value: " + dynamicPartitionKeys.keys.mkString("[", ",", "]"), ctx)
//    }
//    MergeTable(UnresolvedRelation(tableIdent), partitionKeys)
  }

  override def visitPartitionSpec(
     ctx: SparkParserParser.PartitionSpecContext): Map[String, Option[String]] = withOrigin(ctx) {
    val parts = ctx.partitionVal.asScala.map { pVal =>
      val name = pVal.identifier.getText
      val value = Option(pVal.constant).map(visitStringConstant)
      name -> value
    }
    // Before calling `toMap`, we check duplicated keys to avoid silently ignore partition values
    // in partition spec like PARTITION(a='1', b='2', a='3'). The real semantical check for
    // partition columns will be done in analyzer.
    checkDuplicateKeys(parts, ctx)
    parts.toMap
  }

  override def visitTableIdentifier(
     ctx: SparkParserParser.TableIdentifierContext): TableIdentifier = withOrigin(ctx) {
    TableIdentifier(ctx.table.getText, Option(ctx.db).map(_.getText))
  }

  protected def visitStringConstant(ctx: SparkParserParser.ConstantContext): String = withOrigin(ctx) {
    ctx match {
      case s: SparkParserParser.StringLiteralContext => createString(s)
      case o => o.getText
    }
  }

  private def createString(ctx: SparkParserParser.StringLiteralContext): String = {
    if (conf.escapedStringLiterals) {
      ctx.STRING().asScala.map(stringWithoutUnescape).mkString
    } else {
      ctx.STRING().asScala.map(string).mkString
    }
  }

  protected def visitNonOptionalPartitionSpec(
      ctx: SparkParserParser.PartitionSpecContext): Map[String, String] = withOrigin(ctx) {
    visitPartitionSpec(ctx).map {
      case (key, None) => throw new ParseException(s"Found an empty partition key '$key'.", ctx)
      case (key, Some(value)) => key -> value
    }
  }
}
