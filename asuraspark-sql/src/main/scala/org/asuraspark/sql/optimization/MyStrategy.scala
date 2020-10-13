package org.asuraspark.sql.optimization

import org.apache.spark.sql.catalyst.plans.Inner
import org.apache.spark.sql.catalyst.plans.logical.{Join, LogicalPlan, Range}
import org.apache.spark.sql.execution.{ProjectExec, RangeExec, SparkPlan}
import org.apache.spark.sql.catalyst.expressions.{Alias, EqualTo}
import org.apache.spark.sql.{SparkSession, Strategy}

/**
 * https://www.iteblog.com/archives/2571.html
 * @description 添加自定义规则
 * @author asura7969
 * @created 2020/10/13 22:42
 **/
object MyStrategy {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[2]")
      .appName("Add Strategy Spark")
      .getOrCreate()

    val tableA = spark.range(10000000).as('a)
    val tableB = spark.range(20000000).as('b)
    import spark.implicits._
    val result = tableA.join(tableB, $"a.id" === $"b.id").groupBy().count()
    println(result.queryExecution.executedPlan)
    // took 6.670734 s
    /**
     * *(6) HashAggregate(keys=[], functions=[count(1)], output=[count#15L])
     * +- Exchange SinglePartition
     *    +- *(5) HashAggregate(keys=[], functions=[partial_count(1)], output=[count#18L])
     *       +- *(5) Project
     *          +- *(5) SortMergeJoin [id#0L], [id#3L], Inner
     *             :- *(2) Sort [id#0L ASC NULLS FIRST], false, 0
     *             :  +- Exchange hashpartitioning(id#0L, 200)
     *             :     +- *(1) Range (0, 10000000, step=1, splits=2)
     *             +- *(4) Sort [id#3L ASC NULLS FIRST], false, 0
     *                +- Exchange hashpartitioning(id#3L, 200)
     *                   +- *(3) Range (0, 20000000, step=1, splits=2)
     */
    result.show()

    spark.experimental.extraStrategies = IntervalJoin :: Nil
    val newResult = tableA.join(tableB, $"a.id" === $"b.id").groupBy().count()
    println(newResult.queryExecution.executedPlan)
    // took 0.100776 s
    /**
     * *(2) HashAggregate(keys=[], functions=[count(1)], output=[count#32L])
     * +- Exchange SinglePartition
     *    +- *(1) HashAggregate(keys=[], functions=[partial_count(1)], output=[count#35L])
     *       +- *(1) Project
     *          +- *(1) Project [id#0L AS id#0L]
     *             +- *(1) Range (0, 10000000, step=1, splits=2)
     */
    newResult.show()
  }

}

/**
 * 取两个集合的交集,针对某些情况去除不必要的join
 */
case object IntervalJoin extends Strategy with Serializable {
  def apply(plan: LogicalPlan): Seq[SparkPlan] = plan match {
    case Join(Range(start1, end1, 1, part1, Seq(o1), false), // mathces tableA
    Range(start2, end2, 1, part2, Seq(o2), false), // matches tableB
    Inner, Some(EqualTo(e1, e2))) // matches the Join
      if ((o1 semanticEquals e1) && (o2 semanticEquals e2)) ||
        ((o1 semanticEquals e2) && (o2 semanticEquals e1)) =>
      /// matches cases like:
      // tableA: start1----------------------------end1
      // tableB: ...------------------end2
      if (((end2 >= start1) && (end2 <= end1)) || (start1 <= start2) && (start2 <= end1)) {
        // 交集的起点
        val start = math.max(start1, start2)
        // 交集的终点
        val end = math.min(end1, end2)
        val part = math.max(part1.getOrElse(200), part2.getOrElse(200))
        // 创建新的交集范围
        val result = RangeExec(Range(start, end, 1, Some(part), o1 :: Nil, isStreaming = false))
        val twoColumns = ProjectExec(Alias(o1, o1.name)(exprId = o1.exprId) :: Nil, result)
        twoColumns :: Nil
      } else {
        Nil
      }
    case _ => Nil
  }
}
