package org.asuraspark.sql.antlr4.mysql

import org.apache.spark.SparkContext
import org.apache.spark.sql.catalyst.encoders.RowEncoder
import org.apache.spark.sql.catalyst.expressions.Expression
import org.apache.spark.sql.execution.{QueryExecution, SparkSqlParser}
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.sql.{Dataset, Encoder, SparkSession}

/**
 * https://blog.csdn.net/u012477420/article/details/78309426
 */
object SparkParserFactory {
  var sparkContext:SparkContext = null

  def parserSql(sparkSession:SparkSession, sql:String): Dataset[_] ={
    sparkContext = sparkSession.sparkContext
    sparkSession.experimental.extraStrategies = MergeTableStrategy :: Nil

//    val parser = new SparkSqlParser(sparkSession)
    val parser = SparkSession.getActiveSession.map(_.sessionState.sqlParser).get
    val plan = parser.parsePlan(sql)
    if(plan!=null){
      val execution = sparkSession.sessionState.executePlan(plan)
      execution.assertAnalyzed()
      val clazz = classOf[Dataset[_]]
      val constructor = clazz.getDeclaredConstructor(classOf[SparkSession], classOf[QueryExecution], classOf[Encoder[_]])
      val dataSet = constructor.newInstance(sparkSession, execution, RowEncoder.apply(execution.analyzed.schema))
      return dataSet
    }
    null
  }

}
