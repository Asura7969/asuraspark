package org.apache.spark

import org.apache.spark.scheduler.SparkListenerEvent
import org.apache.spark.sql.SparkSession

object CustomizeUtils {

  def postEventToListenerBus(sparkSession:SparkSession, event:SparkListenerEvent) = {
    sparkSession.sparkContext.listenerBus.post(event)
  }

}
