package org.asuraspark.hdfs.idempotent

import java.io.File

import org.apache.commons.io.FileUtils
import org.apache.spark.sql.{SaveMode, SparkSession}

/**
 * @description
 * @author gongwenzhou@hellobike.com
 * @created 2020/10/13 3:17 下午
 **/
object IdempotentFileJob {

  val outputDir = "/Users/gongwenzhou/IdeaProjects/asuraspark/asuraspark-hdfs/src/main/resources/output";

  def main(args: Array[String]): Unit = {

    System.setProperty("JOB_ID","file_committer_test")

    val sparkSession: SparkSession = SparkSession.builder()
        .appName("Spark SQL custom file commit protocol")
        .master("local[*]")
        .config("spark.sql.sources.commitProtocolClass",
          "org.asuraspark.hdfs.idempotent.IdempotentFileSinkCommitProtocol")
        .getOrCreate()

    import sparkSession.implicits._

    val dataset = Seq(
      (1, "a"), (1, "a"), (1, "a"), (2, "b"), (2, "b"), (3, "c"), (3, "c")
    ).toDF("nr", "letter")
    dataset.printSchema()
    dataset.write.option("timestampFormat", "yyyy/MM/dd HH:mm:ss ZZ").mode(SaveMode.Append).json(outputDir)
    import scala.collection.JavaConverters._
    val allFiles = FileUtils.listFiles(new File(outputDir), Array("json"), false).asScala

    sparkSession.stop()
  }

}
