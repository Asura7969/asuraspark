package org.apache.spark.sql.hive.io;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.ql.io.orc.OrcStruct;
import org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat;
import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CombineParquetFileInputFormat extends CombineFileInputFormat<NullWritable, ArrayWritable> {

    private static final Logger LOG = LoggerFactory.getLogger(CombineParquetFileInputFormat.class);

    public RecordReader<NullWritable, ArrayWritable> createRecordReader(InputSplit split, TaskAttemptContext context) throws IOException {
        return new CombineFileRecordReader<NullWritable, ArrayWritable>(
                (CombineFileSplit)split, context, CombineParquetFileInputFormat.ParquetRecordReaderWrapper.class);
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

    private static class ParquetFileInputFormat extends FileInputFormat<NullWritable, ArrayWritable> {
        public RecordReader<NullWritable, ArrayWritable> createRecordReader(InputSplit split, TaskAttemptContext context)
                throws IOException, InterruptedException {
            MapredParquetInputFormat mapredParquetInputFormat = new MapredParquetInputFormat();
            Configuration conf = context.getConfiguration();
            return (RecordReader<NullWritable, ArrayWritable>) (mapredParquetInputFormat.getRecordReader((org.apache.hadoop.mapred.InputSplit) split, (JobConf) conf, null));
        }
    }
}
