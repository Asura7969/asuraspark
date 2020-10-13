package org.asuraspark.datasource

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Row, SQLContext, SaveMode, SparkSession}
import org.apache.spark.sql.sources.{BaseRelation, Filter, InsertableRelation, PrunedFilteredScan}
import org.apache.spark.sql.types.{DataType, IntegerType, StringType, StructField, StructType}

case class CsvRelation(path:String, hasHead:Boolean = true, column:Map[String,DataType])(@transient val sparkSession: SparkSession)
  extends BaseRelation
    with PrunedFilteredScan
    with InsertableRelation{

  override def sqlContext: SQLContext = sparkSession.sqlContext

  override def schema: StructType = {
    if(null == column || column.isEmpty) throw new IllegalArgumentException("column is null ...")
    StructType(column.map(kv => StructField(kv._1, kv._2, nullable = true)).toSeq)
  }

  override def buildScan(requiredColumns: Array[String], filters: Array[Filter]): RDD[Row] = {
    null
  }

  override def insert(data: DataFrame, overwrite: Boolean): Unit = {
    data.write
      .mode(if (overwrite) SaveMode.Overwrite else SaveMode.Append).csv(path)
  }
}
