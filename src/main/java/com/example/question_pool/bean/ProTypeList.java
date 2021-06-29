package com.example.question_pool.bean;

import com.example.question_pool.entity.Problem;

import java.util.List;

/**
 * @author wei
 * test里面的题型类
 */
public class ProTypeList {
    private String typeName;
    private int count;//题目数量
    private int score;//分数
    private List<Problem> list;

    public ProTypeList() {
    }

    public ProTypeList(String typeName, int score, List<Problem> list) {
        this.typeName = typeName;
        this.count = list.size();
        this.score = score;
        this.list = list;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Problem> getList() {
        return list;
    }

    public void setList(List<Problem> list) {
        this.list = list;
    }
}
