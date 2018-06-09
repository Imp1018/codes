package com.lanou3g.code0531;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/user.do")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取数据
        // 2. 调用controller
        response.setContentType("text/json;charset=utf8");
        User user = new User();
        user.setUsername("ZhangSan");
        user.setAge(18);
        String[] hobbies = {"eat", "drink", "play"};
        user.setHobbies(hobbies);
        // 3. 返回数据
        Gson gson = new Gson();
        String data = gson.toJson(user);
        response.getWriter().println(data);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
