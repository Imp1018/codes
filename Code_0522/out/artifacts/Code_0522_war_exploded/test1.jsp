<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/22
  Time: 上午9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="test2.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    config.getServletContext();
    // config 对象 就是 在Servlet启动的时候
    // init方法中 传入进来的 ServletConfig对象
    // 基本没什么用


    // exception 对象 是一个异常对象
    // 当一个页面在运行过程中 发生了异常 将产生这个对象
    // 它是 throwable的对象

    out.print(100/0);
%>
</body>
</html>
