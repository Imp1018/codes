package com.lanou3g.hw0518.controller;

import com.lanou3g.hw0518.model.LoginModel;
import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.JDBCUtil;

import java.util.List;

public class ResultController {
    private LoginModel loginModel = new LoginModel();

    public List<User> getResult(String search) {
        try {
            return loginModel.getUsers(search);
        } finally {
            JDBCUtil.closeConn();
        }
    }
}
