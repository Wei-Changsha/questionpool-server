package com.example.question_pool.service.impl;

import com.example.question_pool.dao.ProblemMapper;
import com.example.question_pool.entity.Problem;
import com.example.question_pool.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wei
 */
@Service
public class ProServiceImpl implements ProService {

    @Autowired
    private ProblemMapper problemMapper;

    @Override
    public int deleteByPrimaryKey(Integer proNo) {
        return problemMapper.deleteByPrimaryKey(proNo);
    }

    @Override
    public int insert(Problem record) {
        return problemMapper.insert(record);
    }

    @Override
    public Problem selectByPrimaryKey(Integer proNo) {
        return problemMapper.selectByPrimaryKey(proNo);
    }

    @Override
    public List<Problem> selectAllProblems() {
        return problemMapper.selectAllProblems();
    }

    @Override
    public int updateByPrimaryKey(Problem record) {
        return problemMapper.updateByPrimaryKey(record);
    }
}
