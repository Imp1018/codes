<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/17
  Time: 上午10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
Cookie 是服务器保存到客户端的,由服务器创建,下发给客户端
客户端自己保存在自己的电脑中,当客户端再一次访问服务器时 会自动的将
上次服务器要求他保存的信息交还给服务器
cookie 在HTTP协议中 规定:
一个cookie最大值 4kb
一个服务器最多要求浏览器保存 20个cookie
一个浏览器最多保存 300个cookie
但是 浏览器几乎没有遵守这个要求的
--%>



<%
    //  设置cookie
    //  通过在响应头中 添加 set-cookie信息
    //  value就是cookie的值
    //  值 使用 = 分割 key 和 value
    //  cookie 不是jsp内置对象,不是域对象
    //  在jsp和Servlet中 都可以使用
    response.addHeader("Set-Cookie","aaa=bbb");
    response.addHeader("Set-Cookie","ccc=ddd");
%>
</body>
</html>
