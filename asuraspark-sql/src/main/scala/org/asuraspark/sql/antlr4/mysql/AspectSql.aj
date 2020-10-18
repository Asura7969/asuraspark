package org.asuraspark.sql.antlr4.mysql;

import org.apache.commons.lang3.StringUtils;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
import org.asuraspark.sql.antlr4.mysql.SparkParserFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect AspectSql {

    private static final Logger logger = LoggerFactory.getLogger(AspectSql.class);

    public pointcut sparkSqlMethod(String sql): execution(public Dataset org.apache.spark.sql.SparkSession.sql(java.lang.String)) && args(sql) ;

    Dataset around(String sql): sparkSqlMethod(sql){
        try{
            logger.info("parser sql:"+sql);
//            SparkSession sparkSession = (SparkSession)thisJoinPoint.getThis();
//            Dataset dataset = SparkParserFactory.parserSql(sparkSession, sql);
//            if(dataset!=null){
//                return dataset;
//            }else{
//                logger.info("parser failed, execute as SparkSession.sql");
//                return proceed(sql);
//            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public pointcut getCreateMethod(): execution(public org.apache.spark.sql.SparkSession getOrCreate());

    SparkSession around(): getCreateMethod(){
        SparkSession sparkSession = proceed();
        String jarPath = sparkSession.sparkContext().getConf().get("spark.merge.jar.path");
        if(StringUtils.isNotEmpty(jarPath)){
            sparkSession.sparkContext().addJar(jarPath);
        }
//        sparkSession.experimental.extraStrategies = MergeTableStrategy :: Nil

        return sparkSession;
    }
}