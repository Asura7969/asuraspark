package org.asuraspark.sql.udf.complexudf

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DataType, DataTypes}
import org.asuraspark.sql.model.StudyEntity
import scala.collection.JavaConverters._
import org.apache.spark.sql.functions.split
import org.apache.spark.sql.functions.{col,expr,sum}
/**
 * @description Spark UDF1 返回复杂结构
 * @author gongwenzhou@hellobike.com
 * @created 2020/9/15 10:59 下午
 **/
object ComplexStruct {
  def main(args: Array[String]): Unit = {

    val arrayStringDataType = DataType.fromJson(DataTypes.createArrayType(DataTypes.StringType).json)
    val mapTypeJson = DataTypes.createMapType(DataTypes.StringType, DataTypes.FloatType).json
    val mapStringFloatDataType = DataType.fromJson(mapTypeJson)

    val structFieldList = Seq(
      // name字段， 类型为String DataType
      DataTypes.createStructField("name", DataTypes.StringType, true),
      // scores字段，类型为Map DataType
      DataTypes.createStructField("scores", mapStringFloatDataType, true),
      // friends字段， 类型为 Array DataType
      DataTypes.createStructField("friends", arrayStringDataType, true)
    )

    val studyTypeJsonStr = DataTypes.createStructType(structFieldList.asJava).json
    // 最后组装成struct DataType
    val studyDataType = DataType.fromJson(studyTypeJsonStr)

    val spark = SparkSession.builder()
        .master("local[*]")
        .appName("Complex Struct example")
        .getOrCreate()

    // UDF 注册
    spark.udf.register("structFilterUdf", StudyEntity.structFilterUdf, studyDataType)
    // 数据处理
    val studyDs = spark.read.text("/Users/gongwenzhou/IdeaProjects/asuraspark/asuraspark-sql/src/main/scala/org/asuraspark/sql/udf/resource/study_test_data.txt")
        .withColumn("split_col", split(col("value"), "\t"))
        .selectExpr("structFilterUdf(value) as study")
        .selectExpr("study.name as name", "study.scores as scores", "study.friends as friends")

    studyDs.show(20, 0)
  }
}
