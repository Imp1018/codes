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
<form action="login.action" method="post">
    用户名: <input name="username"> <br>
    密码: <input type="password" name="password"> <br>

    <input type="text" name="verify"><img src="/verify"><br>

    <input type="checkbox" name="mode" value="week">一周免登陆 <br>
    <input type="submit" value="登录">
</form>

</body>
</html>
