package org.asuraspark.sql.catalog

import java.net.URI

import org.apache.spark.scheduler.{SparkListener, SparkListenerStageCompleted}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.catalyst.catalog.{CatalogDatabase, CatalogTable}

object CatalogExample {
  def main(args: Array[String]) {

    val sparkSession = SparkSession.builder.
        master("local")
        .appName("example")
        .getOrCreate()

    sparkSession.sparkContext.setLogLevel("ERROR")

    sparkSession.sqlContext.sparkContext.addSparkListener(new SparkListener {
      override def onStageCompleted(stageCompleted: SparkListenerStageCompleted): Unit = {
        super.onStageCompleted(stageCompleted)
        stageCompleted.stageInfo.taskMetrics
      }
    })
//    sparkSession.sqlContext.sparkContext.removeSparkListener()

    val df = sparkSession.read.csv("asuraspark-sql/src/main/resources/sales.csv")
    df.createTempView("sales")

    //interacting with catalogue

    val catalog = sparkSession.catalog

    //print the databases

    catalog.listDatabases().select("name").show()

    // print all the tables

    catalog.listTables().show(false)

    // is cached
    println(catalog.isCached("sales"))
    df.cache()
    println(catalog.isCached("sales"))

    // drop the table
    catalog.dropTempView("sales")
    catalog.listTables().select("name").show()

    // list functions
//    catalog.listFunctions().select("name","description","className","isTemporary").show(1000,truncate = false)
  }
}
