package com.lanou3g.hw0514.controller;

import com.lanou3g.hw0514.model.Model;
import com.lanou3g.hw0514.pojo.User;

/**
 * If there are no bugs, it was created by Chen FengYao on 2018/4/27;
 * Otherwise, I don't know who created it either
 */

public class Controller {
    private Model model;

    public Controller() {
        // 在构造方法中 对对象进行赋值
        model = new Model();
    }

    public boolean register(String username,
                            String pwd,
                            String word) {
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
