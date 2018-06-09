package com.lanou3g.code0523.permission;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Filter 可以通过DispatcherType 来配置拦截方式
 * 有4种拦截方式
 * 1.REQUEST: 默认拦截方式,如果不写该项配置,则使用此拦截方式 只会拦截请求,转发,包含都不在进行拦截
 * 2.FORWARD: 拦截请求转发
 * 3.INCLUDE: 拦截请求包含
 * 4.ERROR: 如果在jsp中配置了errorPage,当出现异常时,进入errorPage之前,可以被该拦截器 拦截
 * 默认不写是REQUEST,只要写了,无论写什么,都以写的为准 即不再提供默认,如果还想拦截请求,则需要手动写上
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/user/*", dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST})
public class myFilter extends BaseFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {

    }
}
