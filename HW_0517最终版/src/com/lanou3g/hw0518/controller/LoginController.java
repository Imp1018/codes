package com.lanou3g.hw0518.controller;


import com.lanou3g.hw0518.model.LoginModel;
import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.JDBCUtil;

public class LoginController {
    private LoginModel loginModel = new LoginModel();

    public User login(String username, String password) {
        try {
            if (username == null || password == null) {
                return null;
            }
            if (!loginModel.canLogin(username, password)) {
                return null;
            }
            User user = loginModel.login(username, password);
            return user;
        } finally {
            JDBCUtil.closeConn();
        }

    }
}
