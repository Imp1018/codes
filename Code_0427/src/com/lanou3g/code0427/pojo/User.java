package com.lanou3g.code0427.pojo;

/**
 * pojo: 简单java对象  plain ordinary java object
 * 就是数据类 一般会跟数据库一一对应
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
