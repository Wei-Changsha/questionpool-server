package com.example.question_pool.dao;

import com.example.question_pool.entity.Test;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author wei
 */
@Mapper
@Repository
public interface TestMapper {

    @Delete("delete from test where tst_no=#{tstNo}")
    int deleteByPrimaryKey(Integer tstNo);

    @Insert("insert into test (tst_name,tst_time,tst_type,tst_dif,tst_num,tst_score,tst_detail) values" +
            "(#{tstName},#{tstTime},#{tstType},#{tstDif},#{tstNum},#{tstScore},#{tstDetail})")
    int insert(Test record);

    int insertSelective(Test record);

    @Select("select tst_no,tst_name,tst_time,tst_type,tst_dif,tst_num,tst_score,tst_detail" +
            " from test where tst_no=#{tstNo}")
    @Results(id = "testMap", value = {
            @Result(column = "tst_no", property = "tstNo"),
            @Result(column = "tst_name", property = "tstName"),
            @Result(column = "tst_time",property = "tstTime"),
            @Result(column = "tst_type",property = "tstType"),
            @Result(column = "tst_dif",property = "tstDif"),
            @Result(column = "tst_num", property = "tstNum"),
            @Result(column = "tst_score",property = "tstScore"),
            @Result(column = "tst_detail",property = "tstDetail"),
    }
    )
    Test selectByPrimaryKey(Integer tstNo);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKeyWithBLOBs(Test record);

    int updateByPrimaryKey(Test record);
}