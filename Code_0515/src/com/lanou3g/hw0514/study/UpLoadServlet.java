package com.lanou3g.hw0514.study;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UpLoadServlet", urlPatterns = "/upload")
// 我们也可以通过加上MultipartConfig注解
// 来获取表单中的其他 input
// 建议在处理完上传之后,转发到一个单独的Servlet去处理表单中其他的input,
// 因为使用了 该注解 有可能导致fileUpload不好用

@MultipartConfig
public class UpLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 上传
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf8");
//
//        String code = request.getParameter("code");
//        response.getWriter().println(code);

        String path = getServletContext().getRealPath("") + File.separator + "upload";
        File uploadDir = new File(path);
        if (!uploadDir.exists()) {
            // 创建文件夹
            uploadDir.mkdirs();
        }
        ServletFileUpload upload = new ServletFileUpload();

        FileItemFactory factory = new DiskFileItemFactory();
        upload.setFileItemFactory(factory);
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            if (fileItems == null) {
                return;
            }
            for (FileItem fileItem : fileItems) {
                if (fileItem.isFormField()) {
//                    // 这不是一个文件 是一个表单数据
//                    // input 中的name属性
//                    String fieldName = fileItem.getFieldName();
//                    // name 是文件名 当不传文件时 为null
//                    String name = fileItem.getName();
//                    // String 是input的值
//                    // getString 参数传递 编码格式
//                    // 解决乱码
//                    String s = fileItem.getString("utf8");
//
//                    System.out.println("fieldName:" + fieldName);
//                    System.out.println("name:" + name);
//                    System.out.println("s:" + s);
                    continue;
                }
                // 源文件名
                String fileName = fileItem.getName();
                // 处理后的文件名
                String afterName = TestUUID.handleFileName(fileName);
                // 创建文件壳子
                File file = new File(uploadDir, afterName);
                fileItem.write(file);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
