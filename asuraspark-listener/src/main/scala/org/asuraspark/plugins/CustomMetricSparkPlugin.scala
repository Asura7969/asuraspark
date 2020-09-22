package org.asuraspark.plugins

import java.util

import com.codahale.metrics.Counter
import org.apache.commons.digester.plugins.PluginContext
import org.apache.spark.ExecutorPlugin

// TODO: 需要3.0.0 版本支持 SparkPlugin 插件
/**
 * @description
 * @author asura7969
 * @created 2020/9/17 7:03 下午
 **/
class CustomMetricSparkPlugin {
  val value = new Counter
}
// https://github.com/phatak-dev/spark-3.0-examples

//class CustomMetricSparkPlugin extends SparkPlugin{
//
//  override def driverPlugin(): DriverPlugin = null
//  override def executorPlugin(): ExecutorPlugin = new ExecutorPlugin {
//    override def init(ctx: PluginContext, extraConf: util.Map[String, String]): Unit = {
//      val metricRegistry = ctx.metricRegistry()
//      metricRegistry.register("evenMetrics",CustomMetricSparkPlugin.value)
//    }
//  }
//}
