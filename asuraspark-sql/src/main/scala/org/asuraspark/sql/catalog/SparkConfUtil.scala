package org.asuraspark.sql.catalog

import java.util.Properties

import org.apache.spark.SparkConf
import org.asuraspark.sql.catalog.external.redis.conf.RedisConf

object SparkConfUtil {
  /**
   * Extract `spark.sql.*` properties from the conf and return them as a [[Properties]].
   */
  def getSQLProperties(sparkConf: SparkConf): Properties = {
    val properties = new Properties
    sparkConf.getAll.foreach { case (key, value) =>
      if (key.startsWith("spark.sql")) {
        properties.setProperty(key, value)
      }
    }
    properties
  }


  def getSQLPropertiesBySuffix(sparkConf: SparkConf, suffix:String): RedisConf = {
    val redisConf = new RedisConf("",null,"",6379,0,1000)
    sparkConf.getAll.foreach { case (key, value) =>
      if (key.startsWith(s"spark.sql.$suffix")) {
        key match{
          case k if k.endsWith(".key") => redisConf.key = sparkConf.get(s"spark.sql.$suffix.key")
          case k if k.endsWith(".address") => redisConf.redisAddress = sparkConf.get(s"spark.sql.$suffix.address")
          case k if k.endsWith(".port") => redisConf.redisPort = sparkConf.getInt(s"spark.sql.$suffix.port", 6379)
          case k if k.endsWith(".index") => redisConf.redisIndex = sparkConf.getInt(s"spark.sql.$suffix.index", 0)
        }
      }
    }
    redisConf
  }
}
