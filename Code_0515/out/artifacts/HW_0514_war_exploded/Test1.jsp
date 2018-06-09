<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/15
  Time: 下午5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border: 1px solid black;
        }

        .odd {
            background-color: lawngreen;
        }

        .even {
            background-color: skyblue;
        }
    </style>
</head>
<body>
<table>
    <%
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
    %>
    <tr class="odd">
        <td>aa</td>
    </tr>
    <%
    } else {
    %>
    <tr class="even">
        <td>bb</td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
