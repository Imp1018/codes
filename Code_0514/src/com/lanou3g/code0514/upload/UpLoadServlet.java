package com.lanou3g.code0514.upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@WebServlet(name = "UpLoadServlet", urlPatterns = "/upload")
public class UpLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 0. 修改编码
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf8");

        // 1. 检测表单是否支持上传文件
        if (!ServletFileUpload.isMultipartContent(request)) {
            // 如果不支持上传文件,就不用往下执行了
            return;
        }
        // 2. 创建ServletFileUpload对象,来上传文件
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 3. 配置一些参数
        // 3.1 服务器支持上传的最大文件
        upload.setFileSizeMax(1024 * 1024 * 30);
        // 3.2 支持的 带表单中其他数据,带文件,即整个表单的最大容量
        upload.setSizeMax(1024 * 1024 * 40);
        // 3.3 支持中文
        upload.setHeaderEncoding("utf8");
        // 4. 需要知道上传的文件要放在哪   // web文件夹的路径
        String path = getServletContext().getRealPath("") + File.separator + "upload";
        File uploadDir = new File(path);
        if (!uploadDir.exists()) {
            // 如果文件夹不存在,则创建文件夹
            uploadDir.mkdir();
        }
        // 5. 真正的上传
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            if (fileItems != null && fileItems.size() > 0) {
                // 有上传的内容
                for (FileItem fileItem : fileItems) {
                    if (fileItem.isFormField()) {
                        // 如果是一个普通表单属性
                        // 就别上传了
                        continue;
                    }

                    // 这个文件名绝对不能用 用户上传的那个文件名
                    String Filename = fileItem.getName();
                    String Filepath = path + File.separator + Filename;
                    File file = new File(Filepath);
                    System.out.println(Filepath);
                    // 将传上来的文件 写入 我们自己的文件中
                    fileItem.write(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
