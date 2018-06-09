<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 下午3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = (String) session.getAttribute("username");
    if (username == null) {
        // 没有登录
        // 请求重定向到登录页面
        response.sendRedirect(request.getContextPath() + "/session/login.jsp");
    } else {
        // 已经登录
        // 请求转发的时候不要添加项目名称,自动会给你填上
        request.getRequestDispatcher(request.getContextPath() + "/WEB-INF/test.jsp").forward(request, response);
    }
%>
这个页面只有登录后才能看见
</body>
</html>
