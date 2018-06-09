package com.lanou3g.hw0514.util;

import com.lanou3g.hw0514.study.TestUUID;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 18/5/15.
 */
//封装servletupload
public class SmartUpload {
    private HttpServlet servlet;
    private ServletFileUpload sfu;//用于上传
    private File uploadDir;
    // 用来存储普通表单数据
    private HashMap<String, String> parameters;
    // 存储上传的文件名和文件
    private HashMap<String, File> files;

    public SmartUpload(HttpServlet httpServlet) {
        this.servlet = httpServlet;

        //初始化上传文件夹
        initDir();
        //初始化 ServletFileUpload
        sfu = new ServletFileUpload();
        sfu.setFileItemFactory(new DiskFileItemFactory());

        parameters = new HashMap<>();
        files = new HashMap<>();
    }

    private void initDir() {
        String path = servlet.getServletContext().getRealPath("") + File.separator + "upload";
        uploadDir = new File(path);
        if (!uploadDir.exists()) {
            //创建文件夹
            uploadDir.mkdirs();
        }
    }

    public void parse(HttpServletRequest request) {
        try {
            List<FileItem> fileItems = sfu.parseRequest(request);
            if (fileItems != null) {
                for (FileItem fileItem : fileItems) {
                    if (fileItem.isFormField()) {
                        //表单数据
                        String key = fileItem.getFieldName();
                        String value = fileItem.getString("utf8");
                        parameters.put(key, value);
                    } else {
                        // 不是表单数据
                        String filename = fileItem.getName();
                        // 引包 引的是Apache 下的 lang包

                        if (StringUtils.isEmpty(filename)) {
                            continue;
                        }
                        String realname = TestUUID.handleFileName(filename);
                        File file = new File(uploadDir, realname);
                        fileItem.write(file);
                        // 数据放到files中
                        files.put(filename, file);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 提供访问结果的方法
    public String getParameter(String key) {
        return parameters.get(key);
    }

    public Map<String, String> getParameterMap() {
        return parameters;
    }

    public Map<String, File> getUploadFiles() {
        return files;
    }
}