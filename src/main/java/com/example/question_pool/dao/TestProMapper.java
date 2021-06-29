package com.example.question_pool.dao;

import com.example.question_pool.entity.TestPro;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestProMapper {

    @Delete("delete from test_pro where id=#{id}")
    int deleteByPrimaryKey(Integer id);

    @Delete("delete from test_pro where tst_no=#{tstNo}")
    int deleteByTestNo(Integer tstNo);

    @Delete("delete from test_pro where pro_no=#{proNo}")
    int deleteByProNo(Integer proNo);

    @Insert("insert into test_pro (tst_no,pro_no) " +
            "values (#{tstNo},#{proNo})")
    int insert(TestPro record);

    int insertSelective(TestPro record);

    @Select("select id,tst_no,pro_no" +
            " from test_pro where id=#{id}")
    @Results(id = "testProMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "tst_no", property = "tstNo"),
            @Result(column = "pro_no",property = "proNo"),
    }
    )
    TestPro selectByPrimaryKey(Integer id);

    @Select("select id,tst_no,pro_no" +
            " from test_pro where tst_no=#{tstNo}")
    @ResultMap(value = "testProMap")
    List<TestPro> selectByTstNo(Integer tstNo);

    //List<TestPro> selectAll()

    int updateByPrimaryKeySelective(TestPro record);

    int updateByPrimaryKey(TestPro record);
}