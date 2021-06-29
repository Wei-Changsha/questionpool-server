package com.example.question_pool;

import com.example.question_pool.dao.ProblemMapper;
import com.example.question_pool.dao.TestMapper;
import com.example.question_pool.dao.TestProMapper;
import com.example.question_pool.entity.Problem;

import com.example.question_pool.entity.TestPro;
import com.example.question_pool.util.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QuestionpoolApplicationTests {

    @Autowired
    ProblemMapper problemMapper;
    @Autowired
    TestMapper testMapper;
    @Autowired
    TestProMapper testProMapper;

    @Test
    void myTest() {
        TestPro testPro = new TestPro(3,7);
        int x = testProMapper.insert(testPro);//插入1条 test-pro 记录
        //int x  = testProMapper.deleteByPrimaryKey(1);
        //int x = testProMapper.deleteByProNo(16);//根据pro删除记录
        //int x = testProMapper.deleteByTestNo(2);//根据tstNo删除记录
        //TestPro testPro1 = testProMapper.selectByPrimaryKey(4);//根据卷组获取题目
        //List<TestPro> list = testProMapper.selectByTstNo(3);
        //testProMapper.insert()
        System.out.println("ttttttt seletc one test");
        //System.out.println("lllist" + list);

    }

    @Test
    void getTest() {
        testMapper.selectByPrimaryKey(1);
//        System.out.println("ttttttt get one test");
//        System.out.println(testMapper.selectByPrimaryKey(1));
    }

    @Test
    void createTest() {
         com.example.question_pool.entity.Test test = new com.example.question_pool.entity.Test();
         test.setTstName("试卷2");
         Message message = new Message();
         message.setObject(problemMapper.selectAllProblems());

         test.setTstDetail(message.toJson());
         test.setTstDif((float)0.7);
         testMapper.insert(test);
         System.out.println("tttttttest");

    }

    @Test
    void updatePro() {
        Problem p = problemMapper.selectByPrimaryKey(16);
        p.setProKeyw("Math update");
        problemMapper.updateByPrimaryKey(p);

    }

    @Test
    void find() {
        problemMapper.selectByPrimaryKey(16);
        System.out.println("xxx");
    }
    @Test void delete() {
        problemMapper.deleteByPrimaryKey(14);

    }

    @Test
    void addPro() {
        Problem problem = new Problem();
        problem.setProDetail("2+3=");
        problem.setProAnsno("5");
        problem.setChaNo("1");
        problem.setChaTitle("填空题");
        problem.setProDif((float)0.2);
        problem.setProKeyw("加法计算");
        problem.setProType("算术");
        problem.setChaMpoint("加法");
        int insert = problemMapper.insert(problem);
        System.out.println("no = " + insert);
    }

}
