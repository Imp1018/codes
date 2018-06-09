<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 下午5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login" method="post   ">
    <br>
    用户名:<input name="username">
    <br>
    密码:<input name="password" type="password">
    <br>
    <input type="submit">
</form>
</body>
</html>
