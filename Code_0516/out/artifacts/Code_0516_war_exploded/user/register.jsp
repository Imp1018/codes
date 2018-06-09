<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 下午4:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/register" method="post">
    <br>
    用户名:<input name="username">
    <br>
    密码:<input name="password" type="password">
    <br>
    最喜欢的一句话:<input name="word">
    <br>
    <input type="submit">
</form>
</body>
</html>
