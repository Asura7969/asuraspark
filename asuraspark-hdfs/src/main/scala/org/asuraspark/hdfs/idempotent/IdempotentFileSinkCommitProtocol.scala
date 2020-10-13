package org.asuraspark.hdfs.idempotent

import org.apache.spark.internal.io.HadoopMapReduceCommitProtocol

/**
 * @description 幂等提交
 * @author gongwenzhou@hellobike.com
 * @created 2020/10/13 3:16 下午
 **/
class IdempotentFileSinkCommitProtocol(jobId: String, path: String,
                                        dynamicPartitionOverwrite: Boolean = false)
    extends HadoopMapReduceCommitProtocol(jobId = System.getProperty("JOB_ID"), path, dynamicPartitionOverwrite) {

}
