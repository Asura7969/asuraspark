package org.asuraspark.hdfs.io.input.parquet;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat;
import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import java.io.IOException;

public class ParquetFileInputFormat extends FileInputFormat<NullWritable, ArrayWritable> {
    public RecordReader<NullWritable, ArrayWritable> createRecordReader(InputSplit split, TaskAttemptContext context)
            throws IOException, InterruptedException {
        MapredParquetInputFormat mapredParquetInputFormat = new MapredParquetInputFormat();
        Configuration conf = context.getConfiguration();
        return (RecordReader<NullWritable, ArrayWritable>) (mapredParquetInputFormat.getRecordReader((org.apache.hadoop.mapred.InputSplit) split, (JobConf) conf, null));
    }
}
