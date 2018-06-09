package com.lanou3g.code0510;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by dllo on 18/5/10.
 */
@WebServlet(name = "CServlet", urlPatterns = "/c")
public class CServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获得一个写字节流的输出流
        // 在同一个Servlet中,字节流和字符流只能二选一
        OutputStream os = response.getOutputStream();
        InputStream is = getServletContext().getResourceAsStream("pic/aaa.jpg");
        // 读取输入流里的内容,生成一个byte数组
        byte[] bytes = IOUtils.toByteArray(is);
        os.write(bytes);// 写到输入流中

    }
}
