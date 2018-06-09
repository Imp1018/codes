package com.lanou3g.code0517.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@WebServlet(name = "SessionServlet1", urlPatterns = "/session1")
public class SessionServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果 可以使用已有session,则使用已有session
        // 如果没有创建session,则会自动创建一个session
        // 并会分配JSessionID
        HttpSession session = request.getSession();
        // 获取创建时间
        // java中 时间是从1970开始 经过的毫秒数
        long time = session.getCreationTime();
        Date date = new Date(time);
//        int year = date.getYear();  // 年
//        int month = date.getMonth();// 月
//        int day = date.getDay();    // 日
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date(time)));

        // 获取sessionID
        // 手动设置JSessionID的超时时间
        String sessionID = session.getId();
        Cookie cookie = new Cookie("JSessionID", sessionID);
        cookie.setMaxAge(7 * 24 * 3600);
        cookie.setPath("/");//代表整个网站可用

        // 手动设置 这一个session的超时时间
        // 不会影响其他session,单位是秒
        session.setMaxInactiveInterval(30);

        // 立即销毁session
        // 注销功能
        session.invalidate();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
