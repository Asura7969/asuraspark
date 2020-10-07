package org.asuraspark.hdfs.job

import org.apache.hadoop.io.{LongWritable, Text}
import org.apache.hadoop.mapred.lib.CombineTextInputFormat
//import org.apache.hadoop.mapreduce.lib.input.CombineTextInputFormat
import org.apache.spark.SparkConf
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.sql.SparkSession

object SparkInHdfs {
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

    val sc = spark.sparkContext

    // 原始读法
//    val lines = sc.textFile("hdfs:///dir/")

    // 优化读法
    val lines = sc.newAPIHadoopFile(
      "hdfs:///dir/",
      classOf[CombineTextInputFormat],
      classOf[LongWritable],
      classOf[Text]
//      "org.apache.hadoop.mapreduce.lib.input.CombineTextInputFormat",
//      "org.apache.hadoop.io.LongWritable",
//      "org.apache.hadoop.io.Text"
    ).map(s => s._1)


  }



}
