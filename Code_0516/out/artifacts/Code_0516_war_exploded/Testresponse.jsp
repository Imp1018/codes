<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 下午2:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

这里面的response就是java里的response
response在jsp中 用处很小
<%  // 利用response.getWrite()输出的所有内容
    // 都要优先于out对象输出的内容
    response.getWriter().println("hello");
%>
</body>
</html>
