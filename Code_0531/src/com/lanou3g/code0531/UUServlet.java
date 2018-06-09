package com.lanou3g.code0531;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "UUServlet", urlPatterns = "/uu")
public class UUServlet extends HttpServlet {
    private Gson gson = new Gson();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json;charset=utf-8");
        String method = request.getParameter("method");
        switch (method) {
            case "checkUsername":
                checkUsername(request, response);
        }
    }

    private void checkUsername(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Set<String> names = new HashSet<String>() {
            {
                add("root");
                add("admin");
            }
        };

        ;
        //检查用户名是否存在
        String username = request.getParameter("username");
        //检查是否存在 应该用数据库
        boolean exist = names.contains(username);
//            response.getWriter().println("{exist:"+exist+"}");

        Map<String, Boolean> result = new HashMap<>();
        result.put("exist", exist);
        response.getWriter().println(gson.toJson(result));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}