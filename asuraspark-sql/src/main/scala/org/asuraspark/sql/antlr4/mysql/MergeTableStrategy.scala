package org.asuraspark.sql.antlr4.mysql

import org.apache.spark.sql.Strategy
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.execution.SparkPlan
import org.apache.spark.sql.hive.execution.MergeTablePlan

object MergeTableStrategy extends Strategy with Serializable{

  override def apply(plan: LogicalPlan): Seq[SparkPlan] = plan match {
    case m:MergeTableCommand =>
      // MergeTablePlan实现的是物理执行计划即physicplan，
      // 内部的实现原理是读取parquet文件，转换成rdd，映射成dataframe，最后写入目标路径。
      MergeTablePlan(plan, plan.output, m.table, m.partition) :: Nil
    case _ => Nil
  }
}


