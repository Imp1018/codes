package com.lanou3g.code0517;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieServlet2", urlPatterns = "/a/b/c/cookie.do")
public class CookieServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("cookie01", "hello");
        // cookie.setPath
        // 表明 我们网站的哪个页面可以访问cookie
        // 我们Servlet的访问路径如果包含cookie的path
        // 那么浏览器会自动归还这个cookie
        // 如果不设置,默认值是 当前路径 表示任何页面都可以使用该cookie
        cookie.setPath("/a/b/c");
        response.addCookie(cookie);
        PrintWriter writer = response.getWriter();
        for (Cookie c : request.getCookies()) {
            String name = c.getName();
            String value = c.getValue();
            writer.println(name + "::" + value);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
