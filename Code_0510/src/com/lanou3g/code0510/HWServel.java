package com.lanou3g.code0510;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * 可以通过注解的形式来配置Servlet的名字和路径
 * 这种写法就不需要去web.xml中注册了
 * 效果和写在web.xml中 是一致的
 */
@WebServlet(name = "HWServel",urlPatterns="/error404")
public class HWServel extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext app=getServletContext();
        InputStream is=app.getResourceAsStream("404.html");
        String html= IOUtils.toString(is,"utf8");
        response.getWriter().println(html);
        is.close();
    }
}
