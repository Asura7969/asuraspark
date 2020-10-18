package org.apache.spark.sql.hive.io;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat;
import org.apache.hadoop.hive.serde2.avro.AvroGenericRecordWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CombineAvroFileInputFormat extends CombineFileInputFormat<NullWritable, AvroGenericRecordWritable> {

    private static final Logger LOG = LoggerFactory.getLogger(CombineAvroFileInputFormat.class);

    public RecordReader<NullWritable, AvroGenericRecordWritable> createRecordReader(
            InputSplit split, TaskAttemptContext context) throws IOException {

        return new CombineFileRecordReader<NullWritable,AvroGenericRecordWritable>(
                (CombineFileSplit)split, context, AvroRecordReaderWrapper.class);
    }

    private static class AvroRecordReaderWrapper
            extends CombineFileRecordReaderWrapper<NullWritable, AvroGenericRecordWritable> {
        // this constructor signature is required by CombineFileRecordReader
        public AvroRecordReaderWrapper(CombineFileSplit split,
                                      TaskAttemptContext context, Integer idx)
                throws IOException, InterruptedException {

            super(new AvroFileInputFormat(), split, context, idx);
        }
    }
    private static class AvroFileInputFormat extends FileInputFormat<NullWritable, AvroGenericRecordWritable> {
        public RecordReader<NullWritable, AvroGenericRecordWritable> createRecordReader(InputSplit split, TaskAttemptContext context) throws IOException, InterruptedException {
            AvroContainerInputFormat avroInputFormat = new AvroContainerInputFormat();
            Configuration conf = context.getConfiguration();
            return (RecordReader)avroInputFormat.getRecordReader((org.apache.hadoop.mapred.InputSplit) split, (JobConf) conf, null);
        }
    }
}
