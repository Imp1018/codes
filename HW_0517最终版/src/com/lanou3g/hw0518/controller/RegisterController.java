package com.lanou3g.hw0518.controller;

import com.lanou3g.hw0518.model.RegisterModel;
import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.JDBCUtil;

public class RegisterController {
    private RegisterModel model = new RegisterModel();

    public boolean register(User user) {
        JDBCUtil.begin();//开启事务
        if (!model.hasThisName(user.getUsername())) {
            JDBCUtil.closeConn();//关闭连接
            return model.register(user);
        }
        JDBCUtil.closeConn();//关闭连接
        return false;
    }
}
