package com.example.question_pool.controller;

import com.example.question_pool.entity.Problem;
import com.example.question_pool.service.ProService;
import com.example.question_pool.util.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wei
 */
@RestController
public class ProController {
    @Autowired
    private ProService proService;

    @RequestMapping(value = "/pro/addPro", method = RequestMethod.POST)
    public String addPro(@RequestBody Problem problem) {
        Message message = new Message();
        message.setObject(proService.insert(problem));
        message.addSuccessMsg("添加成功");
        return message.toJson();
    }

    @RequestMapping(value = "/pro/delete/delPro={proNo}", method = RequestMethod.DELETE)
    public String deletePro(@PathVariable Integer proNo) {
        Message message = new Message();
        if(proService.selectByPrimaryKey(proNo) == null) {
            message.addFailMsg("删除失败，题目不存在");
        } else {
            proService.deleteByPrimaryKey(proNo);
            message.addSuccessMsg("删除成功");
        }

        return message.toJson();
    }


    @RequestMapping(value = "/pro/update", method = RequestMethod.POST)
    public String updatePro(@RequestBody Problem problem) {
        Message message = new Message();
        if (proService.selectByPrimaryKey(problem.getProNo()) == null) {
            message.setObject(null);
            message.addFailMsg("数据不存在，更新失败");
        } else {
            message.setObject(proService.updateByPrimaryKey(problem));
            message.addSuccessMsg("更新成功");
        }
        return message.toJson();
    }


    @RequestMapping(value = "/pro/getAllPros", method = RequestMethod.GET)
    public String getAllPros(){
        List<Problem> users = proService.selectAllProblems();
        Message message = new Message();
        message.setObject(users);
        message.addSuccessMsg("获取所有题目");
        return message.toJson();
    }


    @RequestMapping(value = "/pro/getOnePro/{proNo}", method = RequestMethod.GET)
    public String getPro(@PathVariable("proNo") Integer proNo) {
        Message message = new Message();
        if(proService.selectByPrimaryKey(proNo) == null) {
            message.setObject(null);
            message.addFailMsg("数据不存在");
        } else {
            message.setObject(proService.selectByPrimaryKey(proNo));
            message.addSuccessMsg("成功");
        }

        return message.toJson();
    }
    @RequestMapping(value = "/pro/get/{proNo}", method = RequestMethod.GET)
    public Problem get(@PathVariable("proNo") Integer proNo) {

        return proService.selectByPrimaryKey(proNo);
    }


}
