package com.lanou3g.code0512;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RequestServlet", urlPatterns = "/search")
public class RequestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf8");

        //  在获取参数前  告诉Tomcat 参数是utf8编码的
        //  在get请求中 这种方式不可行
        // request.setCharacterEncoding("utf8");


        String keyword = request.getParameter("keyword");


//          方法一:
//        byte[] bytes = keyword.getBytes("iso-8859-1");
//        keyword = new String(bytes, "utf8");

        response.getWriter().print("用户输入的是:" + keyword);


    }
}
