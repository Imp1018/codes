package com.lanou3g.hw0518.view;

import com.lanou3g.hw0518.util.VerifyCode;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

//显示验证码的
@WebServlet(name = "VerifyServlet",urlPatterns = "/verify")
public class VerifyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        VerifyCode verifyCode = new VerifyCode();
        BufferedImage image = verifyCode.getImage();
        ServletOutputStream outputStream = response.getOutputStream();
        verifyCode.out(image, outputStream);//吧图片输出到页面
        //把验证码的值 放到session域当中
        String text = verifyCode.getText();
        request.getSession().setAttribute("verify", text);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
