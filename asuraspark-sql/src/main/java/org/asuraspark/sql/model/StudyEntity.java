package org.asuraspark.sql.model;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.api.java.UDF1;

import java.io.Serializable;
import java.util.*;

/**
 * @author asura7969
 * @description 自定义类
 * @created 2020/9/15 11:06 下午
 **/
@Setter
@Getter
public class StudyEntity {
    private String name;
    private Map<String, Float> scores;
    private List<String> friends;

    /**
     * UDF: use Row class to return struct type
     */
    public static UDF1<String, Row> structFilterUdf = new UDF1<String, Row>() {
        @Override
        public Row call(String s) throws Exception {
            StudyEntity parse = StudyEntity.parse(s);
            return RowFactory.create(parse.getName(), parse.getScores(), parse.getFriends());
        }
    };

    /**
     * 这种方法运行时报错：toString()的内容无法转换成struct
     */
    public static UDF1<String, StudyEntity> parseStudyEntityUdf = new UDF1<String, StudyEntity>() {
        @Override
        public StudyEntity call(String s) throws Exception {
            return StudyEntity.parse(s);
        }
    };

    public static StudyEntity parse(String s) {
        if (StringUtils.isEmpty(s)) {
            return null;
        }
        StudyEntity studyEntity = new StudyEntity();
        String[] fields = s.split("\t", -1);
        if (fields.length < 3) {
            return null;
        }
        // name
        studyEntity.setName(fields[0]);
        // scores
        Map<String, Float> scores = new HashMap<>();
        for (String score : fields[1].split(",", -1)) {
            String[] courseAndScore = score.split(":", -1);
            scores.put(courseAndScore[0], Float.valueOf(courseAndScore[1]));
        }
        studyEntity.setScores(scores);
        // friends
        String[] friendStrs = fields[2].split(",", -1);
        List<String> friends = new ArrayList<>();
        Collections.addAll(friends, friendStrs);
        studyEntity.setFriends(friends);
        return studyEntity;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
