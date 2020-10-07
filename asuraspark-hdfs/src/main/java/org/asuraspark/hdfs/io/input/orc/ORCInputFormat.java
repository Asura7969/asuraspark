package org.asuraspark.hdfs.io.input.orc;

import org.apache.hadoop.hive.ql.io.orc.*;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import java.io.IOException;

public class ORCInputFormat extends FileInputFormat<NullWritable, OrcStruct> {

    public RecordReader<NullWritable, OrcStruct> createRecordReader(InputSplit split, TaskAttemptContext context)
            throws IOException, InterruptedException {

        OrcNewInputFormat orcNewInputFormat = new OrcNewInputFormat();
        return orcNewInputFormat.createRecordReader(split, context);
    }
}
