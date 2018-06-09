<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 下午2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    // 查询数据库
    // 把用户名 存到session中
    session.setAttribute("username",username);
/*
* 其实 jsp就是Servlet,那么我们jsp也是可以只处理逻辑
* 而不写任何的HTML代码的
* 也就是说,我们可以完全抛弃Servlet,全部使用jsp,但是不要这么做
* */
%>
<p>用户名是:<%=username%>
</p>
<p>密码是:<%=password%>
</p>

</body>
</html>
