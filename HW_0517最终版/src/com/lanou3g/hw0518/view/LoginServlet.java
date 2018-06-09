package com.lanou3g.hw0518.view;

import com.lanou3g.hw0518.controller.LoginController;
import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.MD5Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

//url后加.action 是为了和jsp或者其他静态页面做区分
//一看见这个路径 就知道它访问的servlet
@WebServlet(name = "LoginServlet", urlPatterns = "/login.action")
public class LoginServlet extends HttpServlet {
    private LoginController loginController = new LoginController();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        password= MD5Util.MD5WithSalt(password);
        String mode = request.getParameter("mode");
        String verofy = request.getParameter("verify");
        String text = (String) request.getSession().getAttribute("verify");
        //验证码需要忽略大小写
        if (text == null || !text.equalsIgnoreCase(verofy)) {
            //验证码 不相等 ,显示错误信息
            fieldMsg(request, response, "验证码错误,点击返回登录页面");
            return;

        }


        User user = loginController.login(username, password);
        if (user == null) {
            //登录失败
            fieldMsg(request, response, "用户名/密码错误,点击返回登录页面");
        } else {
            //登录成功
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            if ("week".equals(mode)) {
                //7天免登陆
                session.setMaxInactiveInterval(7 * 24 * 60 * 60);
                Cookie cookie = new Cookie("JSESSIONID", session.getId());
                cookie.setPath("/");
                cookie.setMaxAge(7 * 24 * 60 * 60);
                response.addCookie(cookie);
            }
            response.sendRedirect("/index.jsp");


        }
    }

    private void fieldMsg(HttpServletRequest request, HttpServletResponse response, String msg) throws ServletException, IOException {
        // String msg = "用户名/密码错误,点击返回登录页面";
        request.setAttribute("msg", msg);
        String path = "/login.jsp";
        request.setAttribute("path", path);
        response.setStatus(302);
        response.setHeader("refresh", "5;url=/login.jsp");
        request.getRequestDispatcher("/msg.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
