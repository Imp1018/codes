package com.lanou3g.hw0514.view;

import com.lanou3g.hw0514.controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Controller controller = new Controller();
        boolean isSuccess = controller.register(username, password, "");
        String msg = "";
        if (isSuccess) {
            msg = "注册成功<a href=\"/index.jsp\">点击回主页</a>";
        } else {
            msg = "注册失败";
        }
//        response.getWriter().println(msg);
       // 把值放到request域对象中
        request.setAttribute("msg",msg);
        request.getRequestDispatcher("/msg").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
