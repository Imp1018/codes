package com.lanou3g.hw0518.view;

import com.lanou3g.hw0518.controller.ResultController;
import com.lanou3g.hw0518.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ResultServlet", urlPatterns = "/result.action")
public class ResultServlet extends HttpServlet {
    private ResultController resultController = new ResultController();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String search = request.getParameter("search");
        List<User> users = resultController.getResult(search);
        //把数据放入请求域中
        request.setAttribute("users", users);
        //请求转发
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
