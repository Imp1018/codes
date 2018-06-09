package com.lanou3g.code0514;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "AServlet", urlPatterns = "/a")
public class AServlet extends HttpServlet {
    /**
     * get请求 和 post请求的异同
     * 1. get请求 和 post请求 都是HTTP协议规定的请求方式之一
     * get请求更偏向于从服务器获取数据,而不会修改服务器中已有的数据
     * post请求更偏向于向服务器发送数据
     * <p>
     * 2. get请求 请求参数拼接在URL后 使用?隔开  post请求 请求参数 放在 请求体中
     * 但是无论哪种方式,参数的 格式 和 内容 都是一样的
     * 每一个参数使用key=value的形式  多个参数之间 使用&进行连接
     * <p>
     * 3. 由于get请求的参数是放在URL上的, 又因为URL是有长度限制的
     * 所以,get请求不能发送过大的数据
     * 而post请求 由于是参数放在请求体中 就没有长度限制了
     * 可以用来上传文件
     * <p>
     * 4. 关于安全,get和post一样 都不安全,因为HTTP协议本身就是不安全的协议
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 对request 和 response 的操作 是不分 get/post 请求的
        response.setContentType("text/html;charset=utf8");
        // 使用utf8 来解析body中的参数
        request.setCharacterEncoding("utf8");

        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        String gender = request.getParameter("gender");
        // 要获取 向CheckBox这种 一个name 对应多个 value的参数
        // 需要使用该方法,返回值是 String数组
        String[] hobby = request.getParameterValues("hobby");

        PrintWriter pw = response.getWriter();
        pw.println("用户名" + username);
        pw.println("密码" + pwd);
        pw.println("性别" + gender);
        pw.println("爱好" + Arrays.toString(hobby));


        // 获取所有请求的参数
        // Enumeration 这个对象 可以向resultset 一样使用
        // 只有两个方法
        // hasMoreElements: 是否还有没遍历的元素
        // nextElement: 下一个元素
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            pw.println(name);
        }

        // 获取所有的参数信息,以map的形式
        // key 就是参数的name,value就是参数的value
        Map<String, String[]> map = request.getParameterMap();

        // 获取所有的key,组成一个set集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            // 为了照顾 像CheckBox这样的多个value的情况,所以,value是一个数组
            String[] values = map.get(key);
            // 输出看效果
            pw.println(key + "::" + Arrays.toString(values));
        }

//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//        }


    }

}
