package com.lanou3g.code0517;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet(name = "CookieServlet3", urlPatterns = "/cookie3")
public class CookieServlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // cookie 可以设置 存活时间
        // url编码 解决了 cookie不能存储中文的问题
        String val = URLEncoder.encode("中文", "utf8");
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf8");
        Cookie cookie = new Cookie("cookie3", val);
        // 存活时间的单位 是 秒
        cookie.setMaxAge(20);
        // 让cookie可以在 各个二级域名之间共享
        // cookie.setDomain("baidu.com");
        /**
         * maxAge: >0 表示 cookie存活多少秒,到时间浏览器自动删除该cookie
         * maxAge: 0< 表示 无论设置成多少,都表示活到浏览器关闭 默认值就是-1
         * maxAge: =0 表示 告诉浏览器 立即删除这个cookie
         */
        response.addCookie(cookie);
        PrintWriter writer = response.getWriter();
        for (Cookie c : request.getCookies()) {
            String name = c.getName();
            String value = c.getValue();
            writer.println(name + "::" + value);
        }
        /**
         * www.baidu.com
         * .com 顶级域名
         * baidu.com 一级域名
         * www.baidu.com 二级域名
         * pan.baidu.com 二级域名
         */
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
