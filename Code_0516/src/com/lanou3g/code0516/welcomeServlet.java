package com.lanou3g.code0516;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "welcomeServlet", urlPatterns = "/welcome")
public class welcomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username= (String) session.getAttribute("username");
        if (username==null){
            // 还没登录
            // 去登录页面登录
            response.sendRedirect(request.getContextPath()+"/user/login.jsp");
        }else {
            // 登录过了
            request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
