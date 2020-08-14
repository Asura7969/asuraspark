package org.asuraspark.sql

import org.apache.spark.SparkConf
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.sql.SparkSession

object AdaptiveSql {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setMaster("local[*]")
    //    sparkConf.set("spark.default.parallelism","4")
    sparkConf.set("spark.sql.shuffle.partitions", "4")

    sparkConf.setAppName(this.getClass.getCanonicalName)
    val spark = SparkSession
      .builder()
      .appName(this.getClass.getCanonicalName)
      .config(sparkConf)
      .getOrCreate()

    def createTable(spark: SparkSession): Unit = {

      import spark.implicits._
      val testData = spark.sparkContext.parallelize(
        (1 to 100).map(i => TestData(i, i.toString))).toDF()

      testData.createOrReplaceTempView("testData")

      val testData2 = spark.sparkContext.parallelize(
        TestData2(1, 1) ::
          TestData2(1, 2) ::
          TestData2(2, 1) ::
          TestData2(2, 2) ::
          TestData2(3, 1) ::
          TestData2(3, 2) :: Nil, 2).toDF()
      testData2.createOrReplaceTempView("testData2")
      testData2.show()
    }

    def changeMerge2Broadcast(spark: SparkSession): Unit = {
      val query = "SELECT * FROM testData join testData2 ON testData.key = testData2.a  where value = '1'"

      spark.sql(query).explain()
      val conf = SQLConf.get
      conf.setConfString(SQLConf.ADAPTIVE_EXECUTION_ENABLED.key, "true")
//      conf.setConfString(SQLConf.ADAPTIVE_EXECUTION_FORCE_APPLY.key, "true")
      conf.setConfString(SQLConf.AUTO_BROADCASTJOIN_THRESHOLD.key, "80")
//      conf.setConfString(SQLConf.ADAPTIVE_EXECUTION_LOG_LEVEL.key, "ERROR")
      val df2 = spark.sql(query)

      df2.collect()
      df2.show()
    }


    createTable(spark)
//    changeMerge2Broadcast(spark)
  }



}

case class TestData(data:Int, dataStr:String)
case class TestData2(x:Int, y:Int)