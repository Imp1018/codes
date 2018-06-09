<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 下午2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
session 是HTTPsession的对象,是用来进行会话跟踪的
会话跟踪,就是服务器来判断是否是同一个用户发起的不同请求
会话:浏览器与服务器的连贯性请求
session的底层 依赖于cookie,cookie和session会在之后详细说

session是保存在服务器中的
session还是四大域对象之一

--%>
<%
    String username = (String) session.getAttribute("username");
%>
<p>当前用户:<%=username%></p>
</body>
</html>
