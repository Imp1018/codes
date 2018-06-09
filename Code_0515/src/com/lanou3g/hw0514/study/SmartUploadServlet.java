package com.lanou3g.hw0514.study;

import com.lanou3g.hw0514.util.SmartUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "SmartUploadServlet", urlPatterns = "/smart")
public class SmartUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf8");

        SmartUpload smartUpload = new SmartUpload(this);
        smartUpload.parse(request);// 上传

        PrintWriter pw = response.getWriter();

        // 获取普通表单参数
        String code = smartUpload.getParameter("code");
        pw.println(code);
        pw.println("<br>");
        // 获取上传信息
        Map<String, File> fileMap = smartUpload.getUploadFiles();
        for (String fileName : fileMap.keySet()) {
            String filePath = fileMap.get(fileName).getAbsolutePath();
            pw.println(fileName + "::" + filePath);
            pw.println("<br>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
