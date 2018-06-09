package com.lanou3g.code0517;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieServlet", urlPatterns = "/testCookie.do")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie=new Cookie("111","value");
        // 添加cookie
        response.addCookie(cookie);
        // 取出cookie
        // 取出浏览器中的 所有cookie
        Cookie[] cookies = request.getCookies();
        PrintWriter writer=response.getWriter();
        for (Cookie c : cookies) {
            String name = c.getName();
            String value = c.getValue();
            writer.println(name+"::"+value);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
