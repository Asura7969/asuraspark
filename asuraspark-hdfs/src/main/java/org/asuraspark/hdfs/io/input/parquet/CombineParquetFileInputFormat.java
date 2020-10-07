package org.asuraspark.hdfs.io.input.parquet;

import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.CombineFileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReaderWrapper;
import org.apache.hadoop.mapreduce.lib.input.CombineFileSplit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CombineParquetFileInputFormat extends CombineFileInputFormat<NullWritable, ArrayWritable> {

    private static final Logger LOG = LoggerFactory.getLogger(CombineParquetFileInputFormat.class);

    public RecordReader<NullWritable, ArrayWritable> createRecordReader(InputSplit split, TaskAttemptContext context) throws IOException {
        return null;
    }

    private static class ParquetRecordReaderWrapper
            extends CombineFileRecordReaderWrapper<NullWritable, ArrayWritable> {
        // this constructor signature is required by CombineFileRecordReader
        public ParquetRecordReaderWrapper(CombineFileSplit split,
                                       TaskAttemptContext context, Integer idx)
                throws IOException, InterruptedException {

            super(new ParquetFileInputFormat(), split, context, idx);
        }
    }
}
