package com.example.question_pool.entity;

public class Problem {
    private Integer proNo;

    private String proAnsno;

    private String proKeyw;

    private Float proDif;

    private String proType;

    private String chaNo;

    private String chaTitle;

    private String chaMpoint;

    private String proDetail;

    public Problem(Integer proNo, String proAnsno, String proKeyw, Float proDif, String proType, String chaNo, String chaTitle, String chaMpoint) {
        this.proNo = proNo;
        this.proAnsno = proAnsno;
        this.proKeyw = proKeyw;
        this.proDif = proDif;
        this.proType = proType;
        this.chaNo = chaNo;
        this.chaTitle = chaTitle;
        this.chaMpoint = chaMpoint;
    }

    public Problem(Integer proNo, String proAnsno, String proKeyw, Float proDif, String proType, String chaNo, String chaTitle, String chaMpoint, String proDetail) {
        this.proNo = proNo;
        this.proAnsno = proAnsno;
        this.proKeyw = proKeyw;
        this.proDif = proDif;
        this.proType = proType;
        this.chaNo = chaNo;
        this.chaTitle = chaTitle;
        this.chaMpoint = chaMpoint;
        this.proDetail = proDetail;
    }

    public Problem() {
        super();
    }

    public Integer getProNo() {
        return proNo;
    }

    public void setProNo(Integer proNo) {
        this.proNo = proNo;
    }

    public String getProAnsno() {
        return proAnsno;
    }

    public void setProAnsno(String proAnsno) {
        this.proAnsno = proAnsno == null ? null : proAnsno.trim();
    }

    public String getProKeyw() {
        return proKeyw;
    }

    public void setProKeyw(String proKeyw) {
        this.proKeyw = proKeyw == null ? null : proKeyw.trim();
    }

    public Float getProDif() {
        return proDif;
    }

    public void setProDif(Float proDif) {
        this.proDif = proDif;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public String getChaNo() {
        return chaNo;
    }

    public void setChaNo(String chaNo) {
        this.chaNo = chaNo == null ? null : chaNo.trim();
    }

    public String getChaTitle() {
        return chaTitle;
    }

    public void setChaTitle(String chaTitle) {
        this.chaTitle = chaTitle == null ? null : chaTitle.trim();
    }

    public String getChaMpoint() {
        return chaMpoint;
    }

    public void setChaMpoint(String chaMpoint) {
        this.chaMpoint = chaMpoint == null ? null : chaMpoint.trim();
    }

    public String getProDetail() {
        return proDetail;
    }

    public void setProDetail(String proDetail) {
        this.proDetail = proDetail == null ? null : proDetail.trim();
    }
}