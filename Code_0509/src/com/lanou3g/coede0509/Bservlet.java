package com.lanou3g.coede0509;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by dllo on 18/5/9.
 */
public class Bservlet implements Servlet {
    /**
     * servlet 是线程不安全的
     * 等级一: 不在servlet中创建全局变量
     * 等级二: 在servlet中创建无状态全局变量(没有属性的对象)
     * 等级三: 创建有状态的全局变量,但是状态都是只读的
     */
    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
