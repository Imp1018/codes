package com.lanou3g.hw0514.view;

import com.lanou3g.hw0514.controller.Controller;
import com.lanou3g.hw0514.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf8");
        request.setCharacterEncoding("utf8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Controller controller = new Controller();
        User user = controller.login(username, password);
        // todo 根据user是否为空 来判断登录成功与否
        String msg = "";
        if (user == null) {
            msg = "用户名/密码 错误";
        } else {
            msg = "登录成功";
        }
//        response.getWriter().println(msg);
        // 向request域中放值
        // 值以key-value的形式存放
        // key只能是String,value可以是任何对象
        request.setAttribute("msg",msg);
        request.getRequestDispatcher("/msg").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
