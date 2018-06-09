package com.lanou3g.code0514;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BServlet", urlPatterns = "/b")
public class BServlet extends HttpServlet {
    // 请求转发,留头不留体
    // 设置的响应头会保留下来 但是 响应体 以最终被转发到的Servlet为准
    // 其他响应体 都会被抛弃掉


    /**
     * 请求转发和请求重定向的区别
     * 1. 请求转发是一个请求一次响应,而请求重定向是多次响应
     * 2. 请求转发地址栏不变,而重定向后 会显示一个新的请求地址
     * 3. 请求转发只能转发到本项目的其他Servlet,而重定向则没有限制,本项目的也行,其他网站也行
     * 4. 请求转发是服务器行为,只需要给出转发的Servlet路径,而重定向是浏览器行为
     * 5. 请求转发效率高
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //写代码
        System.out.println("BServlet");

        // 1. 编码
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf8");
        // 2. 拿数据
        String username = request.getParameter("username");
        // 3. 校验
        boolean startNum = false;
        for (int i = 0; i < 9; i++) {
            if (username.startsWith(String.valueOf(i))) {
                startNum = true;
            }
        }
        // 根据校验结果不同,转发到不同的Servlet
        RequestDispatcher rd = null;
        if (startNum) {
            rd = request.getRequestDispatcher("/c");
        } else {
            rd = request.getRequestDispatcher("/a");
        }
        rd.forward(request, response);
        // 请求包含留头又留体
//        rd.include(request,response);

//        RequestDispatcher rd = request.getRequestDispatcher("/a");

        // 进行请求转发
        // 虽然真正干活的是AServlet 但是浏览器的网址是不变的 还是以为访问的是b
        // 这样 可以隐藏真正干活的Servlet路径
//        rd.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
