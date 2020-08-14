package org.asuraspark.sql.optimization

import org.apache.spark.internal.Logging
import org.apache.spark.sql.{SparkSession, SparkSessionExtensions}
import org.apache.spark.sql.catalyst.{FunctionIdentifier, TableIdentifier}
import org.apache.spark.sql.catalyst.analysis.UnresolvedStar
import org.apache.spark.sql.catalyst.expressions.{EqualTo, Expression, Literal, Multiply}
import org.apache.spark.sql.catalyst.parser.ParserInterface
import org.apache.spark.sql.catalyst.plans.logical.{Filter, LogicalPlan, Project}
import org.apache.spark.sql.catalyst.rules.Rule
import org.apache.spark.sql.types.{DataType, Decimal, StructType}

object CustomOptimization {

  /**
   * 任何数值类型 * 1 都直接返回该数值
   */
  object MultiplyOptimizationRule extends Rule[LogicalPlan] with Logging{
    def apply(plan: LogicalPlan): LogicalPlan = plan transformAllExpressions {

      case Multiply(left,right) if right.isInstanceOf[Literal] &&
          right.asInstanceOf[Literal].value.isInstanceOf[Double] &&
          right.asInstanceOf[Literal].value.asInstanceOf[Double] == 1.0 =>
        logInfo(s"right == 1, return left")
        left

      case Multiply(left,right) if left.isInstanceOf[Literal] &&
          left.asInstanceOf[Literal].value.isInstanceOf[Double] &&
          left.asInstanceOf[Literal].value.asInstanceOf[Double] == 1.0 =>
        logInfo(s"left == 1, return right")
        right

    }
  }

  def main(args: Array[String]) {

    type ParserBuilder = (SparkSession, ParserInterface) => ParserInterface
    type ExtensionsBuilder = SparkSessionExtensions => Unit
    val parserBuilder: ParserBuilder = (_, parser) => new StrictParser(parser)
    val extBuilder: ExtensionsBuilder = { e => e.injectParser(parserBuilder)}

    val sparkSession = SparkSession.builder.
        master("local")
        .appName("example")
        .withExtensions(extBuilder)
        .getOrCreate()


    val df = sparkSession.read.option("header","true")
        .csv("asuraspark-sql/src/main/resources/sales.csv")

    df.createTempView("sales")

    val multipliedDF = df.selectExpr("amountPaid * 1")
    println(multipliedDF.queryExecution.optimizedPlan.numberedTreeString)

    // 添加自定义优化
    sparkSession.experimental.extraOptimizations = Seq(MultiplyOptimizationRule)
    val multipliedDFWithOptimization = df.selectExpr("amountPaid * 1")
//    val multipliedDFWithOptimization = df.selectExpr("1 * amountPaid")

    println("after optimization")

    println(multipliedDFWithOptimization.queryExecution.optimizedPlan.numberedTreeString)
    multipliedDFWithOptimization.show(10)

//    df.selectExpr("transactionId,customerId,itemId,amountPaid").where("amountPaid == 500").show(1)
    sparkSession.sql("select transactionId,customerId,itemId,amountPaid from sales where amountPaid <> 500").show(10)

    val starSelectDf = sparkSession.sql("select * from sales")
    starSelectDf.show(5)

  }
}

/**
 * 查询列不能为 *
 * @param parser
 */
class StrictParser(parser:ParserInterface) extends ParserInterface{
  override def parsePlan(sqlText: String): LogicalPlan = {
    val logicalPlan = parser.parsePlan(sqlText)
    logicalPlan transform {
      case project @ Project(projectList, _) =>
        projectList.foreach{
          // 遍历需要查询的列名
          name =>
            if(name.isInstanceOf[UnresolvedStar]){
              throw new RuntimeException("You must specify your project column set," +
                  " * is not allowed.")
            }
        }
        project
      case filter @ Filter(expression,_) =>
        println("9999999999999999")
        println(expression.sql)
//        expression.asInstanceOf[EqualTo].symbol
        filter
    }
    logicalPlan
  }

  override def parseExpression(sqlText: String): Expression =
    parser.parseExpression(sqlText)

  override def parseTableIdentifier(sqlText: String): TableIdentifier =
    parser.parseTableIdentifier(sqlText)

  override def parseFunctionIdentifier(sqlText: String): FunctionIdentifier =
    parser.parseFunctionIdentifier(sqlText)

  //    override def parseMultipartIdentifier(sqlText: String): Seq[String] =
  //      parser.parseMultipartIdentifier(sqlText)

  override def parseTableSchema(sqlText: String): StructType =
    parser.parseTableSchema(sqlText)

  override def parseDataType(sqlText: String): DataType =
    parser.parseDataType(sqlText)

  //    override def parseRawDataType(sqlText: String): DataType =
  //      parser.parseRawDataType(sqlText)
}

//class MyExtensions extends (SparkSessionExtensions => Unit) with Logging {
//  def apply(extensions: SparkSessionExtensions): Unit = {
//    logInfo("进入MyExtensions扩展点")
//    extensions.injectResolutionRule(MyRule)
//
//    type ParserBuilder = (SparkSession, ParserInterface) => ParserInterface
//    type ExtensionsBuilder = SparkSessionExtensions => Unit
//    val parserBuilder: ParserBuilder = (_, parser) => new StrictParser(parser)
//    val extBuilder: ExtensionsBuilder = { e => e.injectParser(parserBuilder)}
//    extensions.injectParser(parserBuilder)
//
//  }
//}