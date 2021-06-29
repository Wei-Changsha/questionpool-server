package com.example.question_pool.entity;

public class Answer {
    private Integer ansNo;

    private String proNo;

    private String ansDetail;

    public Answer(Integer ansNo, String proNo) {
        this.ansNo = ansNo;
        this.proNo = proNo;
    }

    public Answer(Integer ansNo, String proNo, String ansDetail) {
        this.ansNo = ansNo;
        this.proNo = proNo;
        this.ansDetail = ansDetail;
    }

    public Answer() {
        super();
    }

    public Integer getAnsNo() {
        return ansNo;
    }

    public void setAnsNo(Integer ansNo) {
        this.ansNo = ansNo;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getAnsDetail() {
        return ansDetail;
    }

    public void setAnsDetail(String ansDetail) {
        this.ansDetail = ansDetail == null ? null : ansDetail.trim();
    }
}