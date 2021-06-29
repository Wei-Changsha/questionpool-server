package com.example.question_pool.controller;

import com.example.question_pool.entity.Test;
import com.example.question_pool.service.TestProService;
import com.example.question_pool.service.TestService;
import com.example.question_pool.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wei
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    private TestProService testProService;

    @RequestMapping(value = "/test/addTset", method = RequestMethod.POST)
    public int createTest(@RequestBody Test test) {
        int x = testService.insert(test);
        System.out.println("插入成功：" + x);
        return x;
    }

    @RequestMapping(value = "/test/getOneTest/{tstNo}", method = RequestMethod.GET)
    public String getTest(@PathVariable("tstNo") Integer tstNo) {
        Message message = new Message();
        if(testService.selectByPrimaryKey(tstNo) == null) {
            message.setObject(null);
            message.addFailMsg("获取数据失败");
        } else {
            Message m = new Message();
            m.setObject(testService.selectByPrimaryKey(tstNo));
            message.setObject(m.toJson());
            message.addSuccessMsg("成功");
        }
        return message.toJson();
    }

    @RequestMapping(value = "/test/delete/{tstId}",method = RequestMethod.DELETE)
    public String deleteTest(@PathVariable Integer tstId) {
        Message message = new Message();
        //删除test表
        testService.deleteByPrimaryKey(tstId);
        //从test_pro表中删除试卷对应的所有试题序列
        testProService.deleteByTestNo(tstId);
        message.addSuccessMsg("success");
        return message.toJson();
    }
}
