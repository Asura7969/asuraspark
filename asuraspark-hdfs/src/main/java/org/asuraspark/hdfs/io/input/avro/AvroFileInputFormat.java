package org.asuraspark.hdfs.io.input.avro;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat;
import org.apache.hadoop.hive.serde2.avro.AvroGenericRecordWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import java.io.IOException;

public class AvroFileInputFormat extends FileInputFormat<NullWritable, AvroGenericRecordWritable> {
    public RecordReader<NullWritable, AvroGenericRecordWritable> createRecordReader(InputSplit split, TaskAttemptContext context) throws IOException, InterruptedException {
        AvroContainerInputFormat avroInputFormat = new AvroContainerInputFormat();
        Configuration conf = context.getConfiguration();
        return (RecordReader)avroInputFormat.getRecordReader((org.apache.hadoop.mapred.InputSplit) split, (JobConf) conf, null);
    }
}
