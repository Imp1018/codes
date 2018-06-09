package com.lanou3g.code0512;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "EServlet", urlPatterns = "/e")
public class EServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String referer = request.getHeader("Referer");
        System.out.println(referer);

        InputStream is = getServletContext().getResourceAsStream("pic/bbb.gif");

        response.getOutputStream().write(IOUtils.toByteArray(is));
    }
}
