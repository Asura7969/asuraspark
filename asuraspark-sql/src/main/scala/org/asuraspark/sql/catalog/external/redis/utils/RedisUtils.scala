//package org.asuraspark.sql.catalog.external.redis.utils
//
//import org.apache.spark.SparkConf
//import org.apache.spark.internal.Logging
//import org.asuraspark.sql.catalog.SparkConfUtil
//import org.asuraspark.sql.catalog.external.redis.conf.RedisConf
//import redis.clients.jedis.{JedisPool, JedisPoolConfig}
//
//object RedisUtils extends Logging{
//
//  def newClient(conf: SparkConf): JedisPool ={
//    val redisConf = getRedisConf(conf)
//    val config = new JedisPoolConfig()
//    config.setMaxIdle(5)
//    config.setMaxWaitMillis(1000 * 100)
//    config.setTestOnBorrow(true)
//    new JedisPool(
//      config, redisConf.redisAddress,
//      redisConf.redisPort, redisConf.redisTimeOut,
//      redisConf.redisPassword, redisConf.redisIndex)
//  }
//
//  def getRedisConf(conf: SparkConf): RedisConf ={
//    SparkConfUtil.getSQLPropertiesBySuffix(conf, "asuraspark.redis")
//  }
//
//}
