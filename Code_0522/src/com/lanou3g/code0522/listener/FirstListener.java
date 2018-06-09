package com.lanou3g.code0522.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * listener 是 javaWeb提供的3大组件之一
 * 是用来在特定时间来提供回调的
 * 我们可以创建不同种类的listener 来实现 在不同情况下
 * 调用我们自己写的代码
 * listener 与 Servlet 一样 需要注册
 * 注册方式1: 在 web.xml中 通过 listener标签来注册即可
 * <p>
 * ServletContextListener
 * 会先于任何的Servlet/Filter 执行
 *
 *
 * javaWeb 提供的listener
 * 按照 被监听的对象分类
 * 1.ServletContext
 *    1.1 ServletContextListener
 *    1.2 ServletContextAttributeListener
 * 2.HttpSession
 *    2.1 HttpSessionListener
 *    2.2 HttpSessionAttributeListener
 *    感知监听器
 *    2.3 HttpSessionBindingListener
 *    2.4 HttpSessionActivationListener
 * 3.ServletRequest
 *    3.1 ServletRequestListener
 *    3.2 ServletRequestAttributeListener
 */
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized");
        ServletContext app = servletContextEvent.getServletContext();
        app.setAttribute("listener", "listener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed");
    }
}
