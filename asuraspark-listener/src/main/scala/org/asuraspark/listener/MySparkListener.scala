package org.asuraspark.listener

import org.apache.spark.SparkContext
import org.apache.spark.scheduler.{SparkListener, SparkListenerStageCompleted, SparkListenerTaskEnd}

import scala.collection._

/**
 * @description
 * @author gongwenzhou@hellobike.com
 * @created 2020/9/16 4:43 下午
 **/
trait StageCompletedEventConsumer {
  def execute(executorRunTime:Long, executorCPUTime:Long)
}

class StageCompletedManager extends SparkListener{
  var consumerMap:mutable.Map[String,StageCompletedEventConsumer] = mutable.Map[String,StageCompletedEventConsumer]()

  def addEventConsumer(sparkContext: SparkContext, id:String, consumer: StageCompletedEventConsumer): Unit ={
    consumerMap += (id -> consumer)
  }

  def removeEventConsumer(id:String): Unit ={
    consumerMap -= id
  }

  override def onStageCompleted(stageCompleted: SparkListenerStageCompleted): Unit = {
    for((id,consumer) <- consumerMap){
      if(null != id){
        consumer.execute(stageCompleted.stageInfo.taskMetrics.executorRunTime,
          stageCompleted.stageInfo.taskMetrics.executorCpuTime)
      }
    }
  }
}

trait RecordsLoadedEventConsumer{
  def execute(recordsRead:Long)
}
class RecordsLoadedManager extends SparkListener{
  var consumerMap:mutable.Map[String,RecordsLoadedEventConsumer] = mutable.Map[String,RecordsLoadedEventConsumer]()

  def addEventConsumer(sparkContext: SparkContext, id:String, consumer: RecordsLoadedEventConsumer): Unit ={
    consumerMap += (id -> consumer)
  }

  def removeEventConsumer(id:String): Unit ={
    consumerMap -= id
  }

  override def onTaskEnd(taskEnd: SparkListenerTaskEnd): Unit = {
    val recordsRead = taskEnd.taskMetrics.inputMetrics.recordsRead
    for((id,consumer) <- consumerMap){
      if(null != id){
        consumer.execute(recordsRead)
      }
    }
  }
}

trait RecordsWrittenEventConsumer{
  def execute(recordsWritten:Long)
}
class RecordsWrittenManager extends SparkListener{
  var consumerMap:mutable.Map[String,RecordsWrittenEventConsumer] = mutable.Map[String,RecordsWrittenEventConsumer]()

  def addEventConsumer(sparkContext: SparkContext, id:String, consumer: RecordsWrittenEventConsumer): Unit ={
    consumerMap += (id -> consumer)
  }

  def removeEventConsumer(id:String): Unit ={
    consumerMap -= id
  }

  override def onTaskEnd(taskEnd: SparkListenerTaskEnd): Unit = {
    val recordsWritten = taskEnd.taskMetrics.outputMetrics.recordsWritten
    for((id,consumer) <- consumerMap){
      if(null != id){
        consumer.execute(recordsWritten)
      }
    }
  }
}


class MySparkListener {

}
