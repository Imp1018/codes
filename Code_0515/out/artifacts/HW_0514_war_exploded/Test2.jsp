<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/15
  Time: 下午5:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    // 这里是声明区,只能定义方法
    // 而且必须一口气写完
    public int add(int a, int b) {
        return a + b;
    }
%>

<%
    int a = add(3, 4);
    out.print(a);
%>
</body>
</html>
