package com.lanou3g.code0516;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO 获取数据
        String username = request.getParameter("username");

        String msg = "";

        // TODO 校验
        if ("root".equals(username)) {
            msg = "登录成功";
            // 获取session对象
            HttpSession session = request.getSession();
            //把用户信息存到session当中
            session.setAttribute("username",username);
            session.setAttribute("word","走出来美丽");

        } else {
            msg = " 登录失败";
        }
        request.setAttribute("msg", msg);
        request.getRequestDispatcher("/user/msg.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
