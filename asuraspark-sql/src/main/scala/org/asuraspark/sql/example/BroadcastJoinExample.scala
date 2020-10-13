package org.asuraspark.sql.example

import org.apache.spark.scheduler.{SparkListener, SparkListenerEvent}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.execution.joins.{BroadcastHashJoinExec, BroadcastNestedLoopJoinExec, SortMergeJoinExec}
//import org.apache.spark.sql.execution.ui.SparkListenerSQLAdaptiveExecutionUpdate
import org.apache.spark.sql.functions.{broadcast, soundex}
import org.apache.spark.sql.internal.SQLConf.{ADAPTIVE_EXECUTION_ENABLED, AUTO_BROADCASTJOIN_THRESHOLD,SHUFFLE_PARTITIONS}

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
      .config(ADAPTIVE_EXECUTION_ENABLED.key,"true")
      .config(AUTO_BROADCASTJOIN_THRESHOLD.key,"-1")
        .config(SHUFFLE_PARTITIONS.key,2)
      .getOrCreate()

    val larger = spark.range(200).as('id)
    val small = spark.range(100).as('id)

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

//    val joinResultDF = spark.sql(
//      """
//        |
//        |select /*+ BROADCAST(small) */ *
//        |FROM larger JOIN small
//        |ON larger.id = small.id
//        |
//        |""".stripMargin)

    val joinResultDF = spark.sql(
      """
        |
        |select *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |
        |""".stripMargin)
    val plan = joinResultDF.queryExecution.executedPlan

    println(plan.toString())

    joinResultDF.queryExecution.debug.codegen()




    joinResultDF.show(100)

    Thread.sleep(86400000L)

  }

}
