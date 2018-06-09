package com.lanou3g.code0512;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DServlet", urlPatterns = "/d")
public class DServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf8");
        /**
         * request封装了HTTP请求的所有数据
         * 请求行
         * 请求头
         * 空行
         * 请求体(get请求没有)
         */

        // 1. 获取客户端ip
        // 用来实现封ip的功能
        String remoteAdder = request.getRemoteAddr();
        // 2. 获取请求方式
        String method = request.getMethod();

        PrintWriter writer = response.getWriter();

        // 请求头
        // 我们只会拿浏览器自动添加的头 自己添加的头
        // 一会用postman测试

        // 判断用户的 浏览器/操作系统
        String userAgent = request.getHeader("user-agent");
        // 当页面发起请求时,会自动添加从哪个域名发起的请求
        // 所以 可以用来做 防盗链
        // 但是 现在基本上 都用 cookie/session 配合 referer来做
        String referer=request.getHeader("referer");

        // 自定义头
        String myHead=request.getHeader("myHead");
        writer.println("myHead:"+myHead);

        writer.println(userAgent);
        writer.println(referer);

        writer.println(remoteAdder);
        writer.println(method);


    }
}
