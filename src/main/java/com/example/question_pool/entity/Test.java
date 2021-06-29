package com.example.question_pool.entity;

import java.util.Date;

public class Test {
    private Integer tstNo;

    private String tstName;

    private Date tstTime;

    private String tstType;

    private Float tstDif;

    private Integer tstNum;

    private Float tstScore;

    private String tstDetail;

    public Test(Integer tstNo, String tstName, Date tstTime, String tstType, Float tstDif, Integer tstNum, Float tstScore) {
        this.tstNo = tstNo;
        this.tstName = tstName;
        this.tstTime = tstTime;
        this.tstType = tstType;
        this.tstDif = tstDif;
        this.tstNum = tstNum;
        this.tstScore = tstScore;
    }

    public Test(Integer tstNo, String tstName, Date tstTime, String tstType, Float tstDif, Integer tstNum, Float tstScore, String tstDetail) {
        this.tstNo = tstNo;
        this.tstName = tstName;
        this.tstTime = tstTime;
        this.tstType = tstType;
        this.tstDif = tstDif;
        this.tstNum = tstNum;
        this.tstScore = tstScore;
        this.tstDetail = tstDetail;
    }

    public Test() {
        super();
    }

    public Integer getTstNo() {
        return tstNo;
    }

    public void setTstNo(Integer tstNo) {
        this.tstNo = tstNo;
    }

    public String getTstName() {
        return tstName;
    }

    public void setTstName(String tstName) {
        this.tstName = tstName == null ? null : tstName.trim();
    }

    public Date getTstTime() {
        return tstTime;
    }

    public void setTstTime(Date tstTime) {
        this.tstTime = tstTime;
    }

    public String getTstType() {
        return tstType;
    }

    public void setTstType(String tstType) {
        this.tstType = tstType == null ? null : tstType.trim();
    }

    public Float getTstDif() {
        return tstDif;
    }

    public void setTstDif(Float tstDif) {
        this.tstDif = tstDif;
    }

    public Integer getTstNum() {
        return tstNum;
    }

    public void setTstNum(Integer tstNum) {
        this.tstNum = tstNum;
    }

    public Float getTstScore() {
        return tstScore;
    }

    public void setTstScore(Float tstScore) {
        this.tstScore = tstScore;
    }

    public String getTstDetail() {
        return tstDetail;
    }

    public void setTstDetail(String tstDetail) {
        this.tstDetail = tstDetail == null ? null : tstDetail.trim();
    }
}