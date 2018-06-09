package com.lanou3g.code0523.dynamic;

import com.lanou3g.code0523.permission.BaseFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebFilter(filterName = "randomFilter", servletNames = "RandomServlet")
public class randomFilter extends BaseFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 思路: 当第一次访问资源的时候 根据servlet输出的结果 生成一个HTML文件
        // 之后 只要这个HTML文件存在,那么久不去访问servlet了 而是直接把这个HTML返回

        // 动态页面静态化 其实就是缓存
        // 真正会用Redis做
        ServletContext app = req.getServletContext();
        String FilePath = app.getRealPath("") + File.separator + "random.html";
        File file = new File(FilePath);
        if (!file.exists()) {
            // 生成HTML文件
            MyResponse myResponse = new MyResponse(resp, req.getServletContext());
            chain.doFilter(req, myResponse);
            myResponse.writeFile();
        }
        // 请求转发
        req.getRequestDispatcher("/random.html").forward(req, resp);

    }
}
