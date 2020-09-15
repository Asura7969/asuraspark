package org.asuraspark.sql.udf.sample

import org.apache.hadoop.hive.ql.exec.UDF

/**
 * @description 计算字符串长度
 * @author asura7969
 * @created 2020/9/15 6:53 下午
 *
 * 注册UDF
 *    CREATE [ OR REPLACE ] [ TEMPORARY ] FUNCTION [ IF NOT EXISTS ] function_name AS class_name [ resource_locations ]
 *    CREATE OR REPLACE FUNCTION strlen_udf_int  AS 'org.asuraspark.sql.udf.sample.StringLengthUdf'  USING JAR 'file:///search/work/bigdata/sparkudf/jars/sparkudf-1.0-SNAPSHOT-jar-with-dependencies.jar';
 **/
class StringLengthUdf extends UDF with Serializable{
  def evaluate(str:String):Int = {
    if(null == str) 0 else str.length
  }
}

class StringContainUdf extends UDF with Serializable{
  /**
   * @param srcString 原字符串
   * @param targetString  目标字符串
   * @return
   */
  def evaluate(srcString:String, targetString:String):Boolean = {
    if(null == srcString || null == targetString){
      false
    } else srcString.contains(targetString)
  }
}
