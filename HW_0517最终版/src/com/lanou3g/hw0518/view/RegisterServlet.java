package com.lanou3g.hw0518.view;

import com.lanou3g.hw0518.controller.RegisterController;
import com.lanou3g.hw0518.pojo.User;
import com.lanou3g.hw0518.util.MD5Util;

import javax.naming.ldap.Control;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register.action")
public class RegisterServlet extends HttpServlet {
    private RegisterController controller = new RegisterController();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        password=MD5Util.MD5WithSalt(password);
        String confirm = request.getParameter("confirm");
        confirm=MD5Util.MD5WithSalt(confirm);
        String nickname = request.getParameter("nickname");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobby");

        //密码/验证密码不一致
        if (!password.equals(confirm)) {
            fieldMsg(request, response, "密码和确认密码不一致");
            return;
        }

        User user = new User();
        user.setUsername(username).setPassword(password).setNickname(nickname)
                .setGender(gender).setHobbies(hobbies);

        if (controller.register(user)) {
            //注册成功
            response.sendRedirect("/login.jsp");
        } else {
            //注册失败
            fieldMsg(request, response, "注册失败");
        }


    }

    private void fieldMsg(HttpServletRequest request, HttpServletResponse response, String msg) throws ServletException, IOException {
        // String msg = "用户名/密码错误,点击返回登录页面";
        request.setAttribute("msg", msg);
        String path = "/register.jsp";
        request.setAttribute("path", path);
        response.setStatus(302);
        response.setHeader("refresh", "5;url=/register.jsp");
        request.getRequestDispatcher("/msg.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
