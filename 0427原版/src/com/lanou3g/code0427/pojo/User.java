package com.lanou3g.code0427.pojo;

/**
 * Created by dllo on 18/4/27.
 */
/*
pojo : plain Ordinay java Object 简单java对象
就是数据类 一般会跟数据库一一对应
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

    public void setPwd(String psd) {
        this.pwd = psd;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
