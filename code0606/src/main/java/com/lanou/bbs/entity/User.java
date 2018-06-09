package com.lanou.bbs.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private int uid;
    private String name;
    private String password;
    private String nickname;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date regDate;
    private int state;

    public int getUid() {
        return uid;
    }

    public User setUid(int uid) {
        this.uid = uid;
        return this;
    }
    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Date getRegDate() {
        return regDate;
    }

    public User setRegDate(Date regDate) {
        this.regDate = regDate;
        return this;
    }

    public int getState() {
        return state;
    }

    public User setState(int state) {
        this.state = state;
        return this;
    }
}
