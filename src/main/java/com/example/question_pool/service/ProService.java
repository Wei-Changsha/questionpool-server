package com.example.question_pool.service;

import com.example.question_pool.entity.Problem;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author wei
 */
public interface ProService {

    int deleteByPrimaryKey(Integer proNo);

    int insert(Problem record);


    //int insertSelective(Problem record);

    Problem selectByPrimaryKey(Integer proNo);

    List<Problem> selectAllProblems();

    //int updateByPrimaryKeySelective(Problem record);

    //int updateByPrimaryKeyWithBLOBs(Problem record);

    int updateByPrimaryKey(Problem record);
}
