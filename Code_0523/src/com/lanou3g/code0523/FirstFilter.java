package com.lanou3g.code0523;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化方法 作用等同于servlet 的 init 方法

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 每次执行过滤的时候 调用的方法
        // 放行这次请求
        request.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=utf8");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // 当 filter销毁的时候 会调用的方法
    }
}
