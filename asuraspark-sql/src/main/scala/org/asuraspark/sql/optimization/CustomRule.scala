package org.asuraspark.sql.optimization

import org.apache.spark.sql.{SparkSession, SparkSessionExtensions, Strategy}
import org.apache.spark.sql.execution.{ProjectExec, RangeExec, SparkPlan, SparkStrategy}
import org.apache.spark.sql.catalyst.expressions.{Alias, EqualTo}
import org.apache.spark.sql.catalyst.parser.{CatalystSqlParser, ParserInterface}
import org.apache.spark.sql.catalyst.plans.Inner
import org.apache.spark.sql.catalyst.plans.logical.{Join, LogicalPlan, Range}
import org.apache.spark.sql.internal.StaticSQLConf.SPARK_SESSION_EXTENSIONS

/**
 * @description 添加自定义规则
 * @author asura7969
 * @created 2020/9/22 9:55 上午
 *         https://www.turbofei.wang/spark/2018/08/01/spark-sql-catalyst
 **/
object CustomRule {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
        .master("local[*]")
        .appName("Custom Rule example")
        .getOrCreate()

    println(s"defaultParallelism : ${spark.sparkContext.defaultParallelism}")

    val tableA = spark.range(20000000).as('a)

    val tableB = spark.range(10000000).as('b)
    val result = tableA.join(tableB,Seq("id"))
        .groupBy()
        .count()
    result.show()

    // all
    println(result.queryExecution.toString())

    // logical plan
//    println(result.queryExecution.logical.toString)

    // optimized logical plan
//    println(result.queryExecution.optimizedPlan.toString)

    // executed / physical plan
//    println(result.queryExecution.executedPlan.toString())


    spark.experimental.extraStrategies = IntervalJoin :: Nil

    val result2 = tableA.join(tableB,Seq("id"))
        .groupBy()
        .count()

    result2.show()

    println("add custom rule ...")

    println(result2.queryExecution.toString())

    Thread.sleep(1000)
//    println()
    println(s"tableA output : ${tableA.queryExecution.sparkPlan.output}")
    println(s"tableB output : ${tableB.queryExecution.sparkPlan.output}")
//    println(s"result2 allAttributes : ${result2.queryExecution.sparkPlan.allAttributes.attrs}")
//    println(s"result2 containsChild : ${result2.queryExecution.sparkPlan.containsChild}")
//    println(s"result2 analyzed allAttributes : ${result2.queryExecution.analyzed.allAttributes.attrs}")

  }
}
// 判断两个range的start 和 end，来求区间的交集
case object IntervalJoin extends Strategy with Serializable {
  def apply(plan: LogicalPlan): Seq[SparkPlan] =
    plan match {
      case Join(Range(start1, end1, 1, part1, Seq(o1), false),
      Range(start2, end2, 1, part2, Seq(o2), false),
      Inner, Some(EqualTo(e1, e2)))
        if ((o1 semanticEquals e1) && (o2 semanticEquals e2)) ||
            ((o1 semanticEquals e2) && (o2 semanticEquals e1)) =>
        if ((end2 >= start1) && (start2 <= end1)) {
          val start = math.max(start1, start2)
          val end = math.min(end1, end2)
          val part = math.max(part1.getOrElse(200), part2.getOrElse(200))
          val result = RangeExec(Range(start, end, 1, Some(part), o1 :: Nil, false))
          val twoColumns = ProjectExec(
            Alias(o1, o1.name)(exprId = o1.exprId) :: Nil,
            result)
          twoColumns :: Nil
        }
        else {
          Nil
        }
      case _ => Nil
  }
}

