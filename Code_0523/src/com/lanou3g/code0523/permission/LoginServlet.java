package com.lanou3g.code0523.permission;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // todo 调用controller检查登录是否成功
        if ("user".equals(username)) {
            User user = new User();
            user.setUsername(username);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
        }
        if ("root".equals(username)) {
            User user = new User();
            user.setUsername(username);
            user.setAdmin(true);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

        }
        response.sendRedirect("/index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
