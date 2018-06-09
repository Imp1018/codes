package com.lanou3g.coede0509;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by dllo on 18/5/9.
 */
public class PathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 使用汉字显示
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        ServletContext app = getServletContext();
        InputStream is = app.getResourceAsStream("error404.html");
        String html = IOUtils.toString(is);
        writer.println(html);
        is.close();

//        String path = app.getRealPath("error404.html");
//
//        BufferedReader reader = new BufferedReader(new FileReader(path));
//
//        String line = "";
//        while ((line = reader.readLine()) != null) {
//            writer.println(line);
//        }
//        reader.close();
        writer.close();
    }
}
