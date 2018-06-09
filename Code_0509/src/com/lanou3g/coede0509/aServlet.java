package com.lanou3g.coede0509;

import javax.servlet.*;
import java.io.*;

/**
 * Created by dllo on 18/5/9.
 */
public class aServlet implements Servlet {
    // servlet 全局只有这一个对象
    // 多线程操作全局变量 会产生线程安全问题
    // 在servlet中 禁止使用全局变量(等级一)
    private int count = 0;  // 访问量

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        // 当这个servlet第一次被启动的时候
        // 会执行该方法,这个方法只会执行一次
        // 叫做初始化方法
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
        // 一般是用来获取servlet配置信息的
        // 返回对象 就是init方法中传入的那个
        // 这个方法是手动调用的
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
//        count++;
        PrintWriter pw = resp.getWriter();
        // 这种方式获取的文件路径
        // 在这个类的文件夹中
        InputStream is = getClass().getResourceAsStream("A.html");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = reader.readLine()) != null) {
            pw.println(line);
        }
        reader.close();
        pw.close();
//        resp.getWriter().println("count:"+count);
        // 这个方法最重要
        // 每一次访问servlet都会执行该方法
        // 这个方法的作用 就是提供服务的
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        return "一点用也没有";
        // 获取servlet信息的
        // 这个信息 随便写 一般来说
        // 这是一个一点用也没有的方法

    }

    @Override
    public void destroy() {
        // 他会在servlet被销毁之前被调用
        // servlet最后一个执行的方法
        System.out.println("destroy");
    }
}
