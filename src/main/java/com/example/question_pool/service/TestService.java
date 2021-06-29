package com.example.question_pool.service;

import com.example.question_pool.entity.Test;

public interface TestService {
    int deleteByPrimaryKey(Integer tstNo);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer tstNo);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}
