package com.lanou3g.code0522.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
// 统计在线人数
// listener 就是全局唯一的
public class CountListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        ServletContext app = session.getServletContext();
        Integer count = (Integer) app.getAttribute("count");
        if (count == null) {
            count = 0;
        }
        count++;
        app.setAttribute("count", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        ServletContext app = session.getServletContext();
        Integer count = (Integer) app.getAttribute("count");
        count--;
        app.setAttribute("count", count);


    }
}
