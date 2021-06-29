package com.example.question_pool.entity;

public class Teacher {
    private Integer teaNo;

    private String teaPwd;

    private String teaName;

    private String teaDiscipline;

    private String teaMail;

    public Teacher(Integer teaNo, String teaPwd, String teaName, String teaDiscipline, String teaMail) {
        this.teaNo = teaNo;
        this.teaPwd = teaPwd;
        this.teaName = teaName;
        this.teaDiscipline = teaDiscipline;
        this.teaMail = teaMail;
    }

    public Teacher() {
        super();
    }

    public Integer getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(Integer teaNo) {
        this.teaNo = teaNo;
    }

    public String getTeaPwd() {
        return teaPwd;
    }

    public void setTeaPwd(String teaPwd) {
        this.teaPwd = teaPwd == null ? null : teaPwd.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaDiscipline() {
        return teaDiscipline;
    }

    public void setTeaDiscipline(String teaDiscipline) {
        this.teaDiscipline = teaDiscipline == null ? null : teaDiscipline.trim();
    }

    public String getTeaMail() {
        return teaMail;
    }

    public void setTeaMail(String teaMail) {
        this.teaMail = teaMail == null ? null : teaMail.trim();
    }
}