package com.lanou3g.code0510;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dllo on 18/5/10.
 */
@WebServlet(name = "ResponseServlet",urlPatterns = "/a")
public class ResponseServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 添加响应码 302: 请求重定向
//        response.setStatus(302);
//        response.addHeader("Location","/b");

        // 快捷重定向方法
        response.sendRedirect("/b");

        /**
         * 状态信息
         *
         * 头信息
         * key:value
         * ......
         *
         * body
         */

    }
}
