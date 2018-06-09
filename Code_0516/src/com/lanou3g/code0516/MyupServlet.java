package com.lanou3g.code0516;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "MyupServlet", urlPatterns = "/Myup")
@MultipartConfig
public class MyupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 上传文件
        // 根据表单的name属性,拿到要上传的文件
        // 在Servlet3.0之后才有
        Part file = request.getPart("file");
        // file.getName 拿到的是在表单中的name属性值
        System.out.println(file.getName());
        // 获取文件类型
        System.out.println(file.getName());
        // 获取文件大小
        System.out.println(file.getContentType());
        // 获取文件详情
        System.out.println(file.getHeader("content-disposition"));

        File dir = new File(getServletContext().getRealPath("") + File.separator + "upload");
        if (!dir.exists()) {
            dir.mkdir();
        }

        String fileName = getServletContext().getRealPath("") + File.separator + "upload" + File.separator + file.getName();
        file.write(fileName);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
