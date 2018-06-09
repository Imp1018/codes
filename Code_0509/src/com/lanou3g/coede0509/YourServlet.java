package com.lanou3g.coede0509;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dllo on 18/5/9.
 */
public class YourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext app = getServletContext();
        Integer count = (Integer) app.getAttribute("counts");
        if (count==null){
            count=1;
        }else {
            count++;
        }
        app.setAttribute("counts",count);
        PrintWriter pw=resp.getWriter();
        pw.println(count);
    }
}
