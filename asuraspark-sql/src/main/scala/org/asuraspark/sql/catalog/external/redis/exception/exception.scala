package org.asuraspark.sql.catalog.external.redis.exception

class RedisException(val msg:String,
                     val cause: Option[Throwable] = None) extends Exception with Serializable{

}

class NotSupportException(val msg:String,
                     val cause: Option[Throwable] = None) extends Exception with Serializable{

}
