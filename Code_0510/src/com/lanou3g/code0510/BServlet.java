package com.lanou3g.code0510;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

/**
 * Created by dllo on 18/5/10.
 */
@WebServlet(name = "BServlet", urlPatterns = "/b")
public class BServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html:charset=utf-8");
        response.addHeader("content-Type", "text/html;charset=utf-8");
//          设置请求头 5秒后回到主页
        //  定时刷新 我们不需要设置状态码
        //  自动的,到时候就自己重定向过去了
        response.setHeader("Refresh", "5;url=/index.jsp");
        /**
         * setheader 和 addheader 区别
         * addheader 可以在响应头中 一个key对应多个值
         * setheader 不可以,key相同只会保留最后一个值
         * setheader 用的比较多
         */

        response.getWriter().println("<a href=\"/index.jsp\">" + "5s后回到主页如果没有成功点击此处</a>");


    }
}
