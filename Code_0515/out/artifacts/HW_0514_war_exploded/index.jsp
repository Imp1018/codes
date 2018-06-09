<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/15
  Time: 上午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/choice">
    用户名:<input name="username"><br>
    密码:<input type="password" name="password">
    <br>
    <input type="radio" name="type" value="login">登录
    <input type="radio" name="type" value="register">注册
    <input type="submit">
  </form>
  </body>
</html>
