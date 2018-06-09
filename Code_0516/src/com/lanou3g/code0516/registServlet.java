package com.lanou3g.code0516;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "registServlet", urlPatterns = "/register")
public class registServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // todo 拿到用户名和密码
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String word=request.getParameter("word");
        // TODO 验证

        // TODO 根据验证结果 构建验证信息
        Random random = new Random();
        boolean registerSuccess = random.nextBoolean();
        String msg="";
        if (registerSuccess){
            msg="注册成功";
        }else{
            msg="注册失败";
        }
        // 把消息放到request域中 发送到jsp中
        request.setAttribute("msg",msg);
        request.getRequestDispatcher("/user/msg.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
