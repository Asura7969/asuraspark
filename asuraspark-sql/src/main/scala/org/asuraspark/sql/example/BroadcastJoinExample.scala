package org.asuraspark.sql.example

import org.apache.spark.scheduler.{SparkListener, SparkListenerEvent}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.execution.joins.{BroadcastHashJoinExec, BroadcastNestedLoopJoinExec, SortMergeJoinExec}
//import org.apache.spark.sql.execution.ui.SparkListenerSQLAdaptiveExecutionUpdate
import org.apache.spark.sql.functions.{broadcast, soundex}
import org.apache.spark.sql.internal.SQLConf.{ADAPTIVE_EXECUTION_ENABLED, AUTO_BROADCASTJOIN_THRESHOLD}

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
//      .config(AUTO_BROADCASTJOIN_THRESHOLD.key,"100MB")
      .getOrCreate()

    var finalPlanCnt = 0
//    val listener = new SparkListener {
//      override def onOtherEvent(event: SparkListenerEvent): Unit = {
//        event match {
//          case SparkListenerSQLAdaptiveExecutionUpdate(_, _, sparkPlanInfo) =>
//            if (sparkPlanInfo.simpleString.startsWith(
//              "AdaptiveSparkPlan isFinalPlan=true")) {
//              finalPlanCnt += 1
//            }
//          case _ => // ignore other events
//        }
//      }
//    }
//    spark.sparkContext.addSparkListener(listener)



    // 模拟 bradcast join OOM
    val larger = spark.range(20000000).as('id)
//    val larger = spark.range(200).as('id)
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

//    val joinResultDF = spark.sql(
//      """
//        |
//        |select *
//        |FROM larger JOIN small
//        |ON larger.id = small.id
//        |
//        |""".stripMargin)


    val plan = joinResultDF.queryExecution.executedPlan

    println(plan.toString())

    val operators = plan.collect{
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
