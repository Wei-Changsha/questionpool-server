package com.example.question_pool.controller;

import com.example.question_pool.entity.Problem;
import com.example.question_pool.entity.TestPro;
import com.example.question_pool.service.TestProService;
import com.example.question_pool.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wei
 */
@RestController
public class TestProController {

    @Autowired
    private TestProService testProService;

    @RequestMapping(value = "/test/add/test_pro/{tstNo}&", method = RequestMethod.POST)
    public String addProTpTest(@PathVariable("tstNo") Integer tstNo, @RequestBody Problem problem) {
        Message message = new Message();
        TestPro testPro = new TestPro();
        testPro.setTstNo(tstNo);
        testPro.setProNo(problem.getProNo());
        message.setObject(testProService.insert(testPro));
        message.addSuccessMsg("success");
        return message.toJson();
    }

    @RequestMapping(value = "/test/getProList/{tstNo}", method = RequestMethod.GET)
    public String getTestProList(@PathVariable("tstNo") Integer tstNo) {
        Message message = new Message();
        List<TestPro> list = testProService.selectByTstNo(tstNo);
        if ( list == null || list.size() == 0 ) {
            message.addFailMsg("试卷试题为空");
        } else {
            message.setObject(list);
            message.addSuccessMsg("success");
        }
        return message.toJson();
    }

    @RequestMapping(value = "/test/getProBykey/{tstNo}", method = RequestMethod.GET)
    public TestPro getTestPro(@PathVariable("tstNo") Integer tstNo) {
        Message message = new Message();
        TestPro testPro = testProService.selectByPrimaryKey(tstNo);
        if ( testPro == null  ) {
            message.addFailMsg("false");
        } else {
            message.setObject(testPro);
            message.addSuccessMsg("success");
        }
        //return message.toJson();
        return testPro;
    }
    @RequestMapping(value = "/delete/byProNo/{proNo}", method = RequestMethod.DELETE)
    public String deleteByPro(@PathVariable Integer proNo) {
        Message message = new Message();
        testProService.deleteByProNo(proNo);
        message.addSuccessMsg("success");
        return message.toJson();
    }
}
