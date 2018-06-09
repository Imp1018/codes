package com.lanou3g.hw0514.pojo;

/**
 * If there are no bugs, it was created by Chen FengYao on 2018/4/27;
 * Otherwise, I don't know who created it either
 */
/*
pojo : Plain Ordinary Java Object 简单Java对象
就是数据类,一般是会跟数据库一一对应
 */
public class User {
    private String username;
    private String pwd;
    private String word;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
