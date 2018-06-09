package com.lanou3g.code0523.permission;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public abstract class BaseFilter implements Filter {
    private FilterConfig filterConfig;

    public void destroy() {
    }

    public abstract void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException;


    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        this.doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
    }

    protected FilterConfig getFilterConfig() {
        return getFilterConfig();
    }

}