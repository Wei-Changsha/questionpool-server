package com.example.question_pool.entity;

public class TestPro {
    private Integer id;

    private Integer tstNo;

    private Integer proNo;

    public TestPro(Integer id, Integer tstNo, Integer proNo) {
        this.id = id;
        this.tstNo = tstNo;
        this.proNo = proNo;
    }
    public TestPro(Integer tstNo, Integer proNo) {

        this.tstNo = tstNo;
        this.proNo = proNo;
    }

    public TestPro() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTstNo() {
        return tstNo;
    }

    public void setTstNo(Integer tstNo) {
        this.tstNo = tstNo;
    }

    public Integer getProNo() {
        return proNo;
    }

    public void setProNo(Integer proNo) {
        this.proNo = proNo;
    }
}