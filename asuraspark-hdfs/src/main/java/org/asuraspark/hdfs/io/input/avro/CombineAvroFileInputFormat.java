package org.asuraspark.hdfs.io.input.avro;

import org.apache.hadoop.hive.serde2.avro.AvroGenericRecordWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.CombineFileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReader;
import org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReaderWrapper;
import org.apache.hadoop.mapreduce.lib.input.CombineFileSplit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CombineAvroFileInputFormat extends CombineFileInputFormat<NullWritable, AvroGenericRecordWritable> {

    private static final Logger LOG = LoggerFactory.getLogger(CombineAvroFileInputFormat.class);

    public RecordReader<NullWritable, AvroGenericRecordWritable> createRecordReader(
            InputSplit split, TaskAttemptContext context) throws IOException {

        return new CombineFileRecordReader<NullWritable,AvroGenericRecordWritable>(
                (CombineFileSplit)split, context, CombineAvroFileInputFormat.AvroRecordReaderWrapper.class);
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
}
