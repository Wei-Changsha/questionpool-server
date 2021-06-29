package com.example.question_pool.entity;

public class Manager {
    private Integer manaNo;

    private String manaName;

    private String manaPwd;

    public Manager(Integer manaNo, String manaName, String manaPwd) {
        this.manaNo = manaNo;
        this.manaName = manaName;
        this.manaPwd = manaPwd;
    }

    public Manager() {
        super();
    }

    public Integer getManaNo() {
        return manaNo;
    }

    public void setManaNo(Integer manaNo) {
        this.manaNo = manaNo;
    }

    public String getManaName() {
        return manaName;
    }

    public void setManaName(String manaName) {
        this.manaName = manaName == null ? null : manaName.trim();
    }

    public String getManaPwd() {
        return manaPwd;
    }

    public void setManaPwd(String manaPwd) {
        this.manaPwd = manaPwd == null ? null : manaPwd.trim();
    }
}