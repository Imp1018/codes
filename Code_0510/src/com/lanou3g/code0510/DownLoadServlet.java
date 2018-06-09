package com.lanou3g.code0510;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dllo on 18/5/10.
 */
@WebServlet(name = "DownLoadServlet", urlPatterns = "/down")
public class DownLoadServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的编码格式为utf8
        response.setCharacterEncoding("utf8");

        // 设置下载响应头
        response.setHeader("Content-Disposition", "attachment;filename=Em.mp3");

        InputStream is=getServletContext().getResourceAsStream("files/Em.mp3");
        // 向浏览器写流
        response.getOutputStream().write(IOUtils.toByteArray(is));

    }
}
