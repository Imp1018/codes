package com.lanou3g.hw0518.pojo;

import java.util.Arrays;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private List<String> hobbies;


    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
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

    public List<String> getHobbies() {
        return hobbies;
    }

    public User setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public User setHobbies(String[] hobbies) {
        //直接使用Arrays 工具类的 asList方法
        //把数组转换成 List集合
        this.hobbies = Arrays.asList(hobbies);
        return this;
    }
}
