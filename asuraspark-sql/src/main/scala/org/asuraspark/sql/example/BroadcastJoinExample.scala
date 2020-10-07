package org.asuraspark.sql.example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.execution.joins.{BroadcastHashJoinExec, BroadcastNestedLoopJoinExec, SortMergeJoinExec}
import org.apache.spark.sql.functions.{broadcast, soundex}

import scala.util.{Failure, Try}

/**
 * @description broadcast join
 * @author asura7969
 * @created 2020/10/01 15:31 下午
 */
object BroadcastJoinExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[*]")
      .appName("broadcast join example")
      .getOrCreate()

    // 模拟 bradcast join OOM
    val larger = spark.range(20000000).as('id)
    val small = spark.range(100000000).as('id)

//    val broadcastJoinDF = larger.join(broadcast(small), Seq("id"))
//    broadcastJoinDF.show(100)
//    println(broadcastJoinDF.queryExecution.toString())

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

    val joinResultDF = spark.sql(
      """
        |
        |select /*+ BROADCAST(small) */ *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |
        |""".stripMargin)


    val physical = joinResultDF.queryExecution.sparkPlan

    println(physical.toString())

    val operators = physical.collect{
      case j: BroadcastHashJoinExec => j
      case j: BroadcastNestedLoopJoinExec => j
      case a => a
    }

    val joinType = operators.head;
    if (joinType.getClass == classOf[BroadcastHashJoinExec] ||
      joinType.getClass == classOf[BroadcastNestedLoopJoinExec]) {
//      val broadcastJoin = joinType.asInstanceOf[BroadcastHashJoinExec]
//      broadcastJoin.prepare()
//
//      physical.prepare()
//      println("broadcast join 发生OOM,需要转化为 SMJ")
//      Try{
//        joinType.prepare()
//      } match {
//        case Failure(ex) =>
//          if(ex.isInstanceOf[OutOfMemoryError]){
//            ex.getSuppressed.contains(t => t.getClass.isInstanceOf[OutOfMemoryError])
//            println("broadcast join 发生OOM,需要转化为 SMJ")
//          }
//      }
    }


    joinResultDF.show(100)

  }

}
