package com.example.question_pool.entity;

public class Student {
    private Integer stuNo;

    private String stuName;

    private String stuPwd;

    private String stuDiscipline;

    private String stuGrade;

    public Student(Integer stuNo, String stuName, String stuPwd, String stuDiscipline, String stuGrade) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuPwd = stuPwd;
        this.stuDiscipline = stuDiscipline;
        this.stuGrade = stuGrade;
    }

    public Student() {
        super();
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd == null ? null : stuPwd.trim();
    }

    public String getStuDiscipline() {
        return stuDiscipline;
    }

    public void setStuDiscipline(String stuDiscipline) {
        this.stuDiscipline = stuDiscipline == null ? null : stuDiscipline.trim();
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade == null ? null : stuGrade.trim();
    }
}