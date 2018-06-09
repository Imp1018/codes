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
<a href="<%=request.getAttribute("path")%>">
    <%=request.getAttribute("msg")%>
</a>
</body>
</html>
