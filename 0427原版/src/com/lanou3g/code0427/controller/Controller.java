package com.lanou3g.code0427.controller;

import com.lanou3g.code0427.model.Model;
import com.lanou3g.code0427.pojo.User;

/**
 * Created by dllo on 18/4/27.
 */
public class Controller {
    private Model model;

    public Controller() {
        //在构造方法中 对对象进行赋值
        model = new Model();
    }

    public boolean register(String username, String pwd, String word) {
        if (model.hasUsername(username)) {
            return false;//注册失败
        }
        return model.register(username, pwd, word);
    }

    public User login(String username, String pwd) {
        User user = model.login(username, pwd);
        return user;
    }
}