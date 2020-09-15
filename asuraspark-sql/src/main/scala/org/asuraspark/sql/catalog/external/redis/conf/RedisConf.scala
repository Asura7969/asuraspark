package org.asuraspark.sql.catalog.external.redis.conf

class RedisConf(var key:String, var redisAddress:String = "localhost",
                var redisPassword:String, var redisPort:Int = 6379,
                var redisIndex:Int = 0, var redisTimeOut:Int = 10000,
                var otherRedisConf: OtherRedisConf = new OtherRedisConf) {

  override def toString =
    s"""
       |redis.address : $redisAddress
       |redis.password : $redisPassword
       |redis.port : $redisPort
       |redis.index : $redisIndex
       |redis.key : $key
       |${otherRedisConf.toString}
       |""".stripMargin
}

class OtherRedisConf{
  var operateRedis = false
  def this(operateRedis: Boolean){
    this()
    this.operateRedis = true
  }

  override def toString =
    s"""
       |redis.operateRedis : $operateRedis
       |""".stripMargin
}