package com.example.question_pool.service;

import com.example.question_pool.entity.TestPro;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestProService {
    int deleteByPrimaryKey(Integer id);
    int deleteByTestNo(Integer tstNo);
    int deleteByProNo(Integer proNo);

    int insert(TestPro record);

    int insertSelective(TestPro record);

    TestPro selectByPrimaryKey(Integer id);
    List<TestPro> selectByTstNo(Integer tstNo);

    int updateByPrimaryKeySelective(TestPro record);

    int updateByPrimaryKey(TestPro record);
}
