package com.lanou3g.coede0509;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dllo on 18/5/9.
 */
public class MyServlet extends HttpServlet {
    /**
     * req: 是浏览器发来的请求,请求的所有数据,都在这里面
     * resp: 是要返回的数据,叫做响应,向resp操作,就可以将处理后的结果 返回给调用方
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 如果我们要让自己的Servlet 支持get请求
        // 那么必须要 覆写 doGet 并且 不能调用父类的doGet方法
        /**
         * ServletContext 是javaweb 4大域对象之一
         * 有时我们也叫做 app/application
         *特点:
         * 1. 所有的ServletContext 都是同一个,利用这点,可以做多个Servlet传值/记录整个网站的信息
         * 2. 寿命极长:与天地同寿,Tomcat启动,这个对象就被创建,Tomcat停止,这个对象就会销毁
         *
         * 域对象:
         * 我们一共有4个域对象,域对象的作用就是在一个范围内共享值使用的
         */
//        ServletContext context = getServletContext();
        ServletContext app = getServletContext();
        Integer count = (Integer) app.getAttribute("counts");
        if (count==null){
            count=1;
        }else {
            count++;
        }
        app.setAttribute("counts",count);
        PrintWriter pw=resp.getWriter();
        pw.println(count);
    }
}
