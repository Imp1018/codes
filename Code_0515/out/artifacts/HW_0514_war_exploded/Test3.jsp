<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/15
  Time: 下午5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .i {
            color: red;
        }

        .j {
            color: green;
        }

        .result {
            color: yellow;
        }
    </style>
</head>
<body>
<%
    //i*j=i*j
    for (int i = 1; i < 10; i++) {
        for (int j = 1; j <= i; j++) {
            String result = j + "*" + i + "=" + j * i;
            // html 代码
%>
<%--这是jsp表达式,直接写要输出的变量名,不要写分号
jsp表达式,运行在HTML代码中 使用 java代码的变量值--%>
<span class="j"><%=j%></span>*<span class="i"><%=i%></span>=<span class="result"><%=i*j%></span>
<%
    }
%>
<br>
<%
    }
%>

</body>
</html>
