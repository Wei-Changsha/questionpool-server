package com.example.question_pool.service.impl;

import com.example.question_pool.dao.TestProMapper;
import com.example.question_pool.entity.TestPro;
import com.example.question_pool.service.TestProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestProServiceImpl implements TestProService {
    @Autowired
    private TestProMapper testProMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return testProMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByTestNo(Integer tstNo) {
        return testProMapper.deleteByTestNo(tstNo);
    }

    @Override
    public int deleteByProNo(Integer proNo) {
        return testProMapper.deleteByProNo(proNo);
    }

    @Override
    public int insert(TestPro record) {
        return testProMapper.insert(record);
    }

    @Override
    public int insertSelective(TestPro record) {
        return testProMapper.insertSelective(record);
    }

    @Override
    public TestPro selectByPrimaryKey(Integer id) {
        return testProMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TestPro> selectByTstNo(Integer tstNo) {
        return testProMapper.selectByTstNo(tstNo);
    }

    @Override
    public int updateByPrimaryKeySelective(TestPro record) {
        return testProMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestPro record) {
        return testProMapper.updateByPrimaryKey(record);
    }
}
