package org.asuraspark.hdfs.io.input.orc;

import org.apache.hadoop.hive.ql.io.orc.*;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class CombineOrcFileInputFormat
        extends CombineFileInputFormat<NullWritable, OrcStruct> {

    private static final Logger LOG = LoggerFactory.getLogger(CombineOrcFileInputFormat.class);

    public RecordReader<NullWritable, OrcStruct> createRecordReader(InputSplit split, TaskAttemptContext context)
            throws IOException {

        return new CombineFileRecordReader<NullWritable,OrcStruct>(
                (CombineFileSplit)split, context, CombineOrcFileInputFormat.ORCRecordReaderWrapper.class);
    }


    private static class ORCRecordReaderWrapper
            extends CombineFileRecordReaderWrapper<NullWritable,OrcStruct> {
        // this constructor signature is required by CombineFileRecordReader
        public ORCRecordReaderWrapper(CombineFileSplit split,
                                       TaskAttemptContext context, Integer idx)
                throws IOException, InterruptedException {

            super(new ORCInputFormat(), split, context, idx);
        }
    }
}
