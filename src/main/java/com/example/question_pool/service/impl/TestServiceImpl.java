package com.example.question_pool.service.impl;

import com.example.question_pool.dao.TestMapper;
import com.example.question_pool.entity.Test;
import com.example.question_pool.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wei
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public int deleteByPrimaryKey(Integer tstNo) {
        return testMapper.deleteByPrimaryKey(tstNo);
    }

    @Override
    public int insert(Test record) {
        return testMapper.insert(record);
    }

    @Override
    public int insertSelective(Test record) {
        return testMapper.insertSelective(record);
    }

    @Override
    public Test selectByPrimaryKey(Integer tstNo) {
        return testMapper.selectByPrimaryKey(tstNo);
    }

    @Override
    public int updateByPrimaryKeySelective(Test record) {
        return testMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Test record) {
        return testMapper.updateByPrimaryKey(record);
    }
}
