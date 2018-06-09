<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/19
  Time: 上午10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/register.action" method="post">
    用户名:<input type="text" name="username"> <br>
    密码: <input type="password" name="password"><br>
    确认密码: <input type="password" name="confirm"><br>
    昵称: <input type="text" name="nickname"><br>
    性别: <input type="radio" name="gender" value="m"> 男
    <input type="radio" name="gender" value="f"> 女
    <br>
    爱好:
    <input type="checkbox" name="hobby" value="eat">吃
    <input type="checkbox" name="hobby" value="play">玩
    <input type="checkbox" name="hobby" value="code">写代码
    <br>
    <input type="submit" value="注册">

</form>
</body>
</html>
