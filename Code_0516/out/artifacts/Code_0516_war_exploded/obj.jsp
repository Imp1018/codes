<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 上午11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp九大内置对象</title>
</head>
<body>
<p>九大内置对象</p>
<ul>常用的:
    <li><a href="TestOut.jsp">out</a></li>
    <li><a href="request.jsp">request</a></li>
    <li><a href="Testresponse.jsp">response</a></li>
    <li>application</li>
    <li>session</li>
</ul>

<ul>不常用的:
    <li>page</li>
    <li>pageContext</li>
    <li>exception</li>
    <li>config</li>
</ul>
<%--
1. 什么是内置对象:
在java中一定是对象.方法()去调用
在所有jsp页面中,这9个对象,不需要new,可以直接使用
--%>
</body>
</html>
