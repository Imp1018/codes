package com.lanou3g.hw0514.view;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChoiceServlet", urlPatterns = "/choice")
public class ChoiceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf8");
        request.setCharacterEncoding("utf8");
        String type = request.getParameter("type");
        RequestDispatcher rd = null;
        if ("login".equals(type)) {
            //login
            rd = request.getRequestDispatcher("/login");
        } else {
            // register
            rd = request.getRequestDispatcher("/register");
        }
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
