package org.asuraspark.sql.example

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.internal.SQLConf.{ADAPTIVE_EXECUTION_ENABLED, AUTO_BROADCASTJOIN_THRESHOLD,SHUFFLE_PARTITIONS}

/**
 * @description join
 * @author asura7969
 * @created 2020/10/01 15:31 下午
 */
object JoinExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[*]")
      .appName("broadcast join example")
      .config(ADAPTIVE_EXECUTION_ENABLED.key,"true")
      .config(AUTO_BROADCASTJOIN_THRESHOLD.key,"-1")
//        .config(SHUFFLE_PARTITIONS.key,2)
      .getOrCreate()

    // BHJ
    broadcastJoin(spark)
    // SMJ
    sortMergeJoin(spark)
    // SHJ
    shuffleHashJoin(spark)
    // shuffle-and-replicate nested loop join
    shuffleReplicateNLJoin(spark)
    // 同时指定多个join
    moreJoin(spark)

//    Thread.sleep(86400000L)

    spark.stop()

  }

  def moreJoin(spark:SparkSession): Unit ={
    val larger = spark.range(200).as('id)
    val small = spark.range(100).as('id)

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

    val join1 =
      """
        |select /*+ SHUFFLE_REPLICATE_NL(small) */ *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    spark.sql(join1).show()
  }

  def shuffleReplicateNLJoin(spark:SparkSession): Unit ={
    val larger = spark.range(200).as('id)
    val small = spark.range(100).as('id)

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

    val join1 =
      """
        |select /*+ BROADCAST(small),MERGE(small, larger) */ *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    spark.sql(join1).show()
  }

  def shuffleHashJoin(spark:SparkSession): Unit ={
    val larger = spark.range(200).as('id)
    val small = spark.range(100).as('id)

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

    val join1 =
      """
        |select /*+ SHUFFLE_HASH(small) */ *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    spark.sql(join1).show()
  }

  def sortMergeJoin(spark:SparkSession): Unit ={
    val larger = spark.range(200).as('id)
    val small = spark.range(100).as('id)

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

    val join1 =
      """
        |select /*+ SHUFFLE_MERGE(small) */ *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    val join2 =
      """
        |select /*+ MERGEJOIN(small) */ *
        |FROM larger LEFT JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    val join3 =
      """
        |select /*+ MERGE(small) */ *
        |FROM larger RIGHT JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    spark.sql(join1).show()
    spark.sql(join2).show()
    spark.sql(join3).show()
  }

  def broadcastJoin(spark:SparkSession): Unit ={
    val larger = spark.range(200).as('id)
    val small = spark.range(100).as('id)

    larger.createOrReplaceTempView("larger")
    small.createOrReplaceTempView("small")

    val join1 =
      """
        |select /*+ BROADCAST(small) */ *
        |FROM larger JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    val join2 =
      """
        |select /*+ BROADCASTJOIN(small) */ *
        |FROM larger LEFT JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    val join3 =
      """
        |select /*+ MAPJOIN(small) */ *
        |FROM larger RIGHT JOIN small
        |ON larger.id = small.id
        |""".stripMargin

    spark.sql(join1).show()
    spark.sql(join2).show()
    spark.sql(join3).show()

//    val plan = spark.sql(join1).queryExecution.executedPlan
//    println(plan.toString())
//    spark.sql(join1).queryExecution.debug.codegen()
  }

}
