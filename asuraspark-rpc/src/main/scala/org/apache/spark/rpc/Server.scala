package org.apache.spark.rpc

import org.apache.spark.{SecurityManager, SparkConf}


class HelloEndpoint(override val rpcEnv: RpcEnv) extends RpcEndpoint {
  override def onStart(): Unit = {
    println("start hello endpoint")
  }

  override def receiveAndReply(context: RpcCallContext): PartialFunction[Any, Unit] = {
    case SayHello(msg) => {
      println(s"receive $msg")
      context.reply(s"hello, $msg")
    }
  }

  override def onStop(): Unit = {
    println("stop hello endpoint")
  }
}

case class SayHello(msg: String)

object HelloEndpoint {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    val manager = new SecurityManager(conf)
    // 创建server模式的RpcEnv
    val rpcEnv: RpcEnv = RpcEnv.create("hello-server", "localhost", 5432, conf, manager)
    // 实例化HelloEndpoint
    val helloEndpoint: RpcEndpoint = new HelloEndpoint(rpcEnv)
    // 在RpcEnv注册helloEndpoint
    rpcEnv.setupEndpoint("hello-service", helloEndpoint)
    // 等待线程rpcEnv运行完
    rpcEnv.awaitTermination()
  }
}