<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/22
  Time: 上午10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
出错了
<%
    // exception 这个内置对象 默认是用不了的 编译不过去
    // 要想用必须把这个页面 指定为isErrorPage
    // 即 在page指令中 添加 isErrorPage="true"这个指令
    out.print(exception);
%>
</body>
</html>
