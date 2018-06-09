<%@ page import="java.util.List" %>
<%@ page import="com.lanou3g.hw0518.pojo.User" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/19
  Time: 上午10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.include("search.jsp");
%>
<table>
    <tr>
        <td>序号</td>
        <td>用户名</td>
        <td>昵称</td>
        <td>性别</td>
        <td>爱好</td>
    </tr>
    <%
        List<User> users = (List<User>) request.getAttribute("users");
        int i=1;
        for (User user : users) {
    %>
    <tr>
        <td><%=i++%></td>
        <td><%=user.getUsername()%></td>
        <td><%=user.getNickname()%></td>
        <td><%=user.getGender()%></td>
        <td><%=Arrays.toString(user.getHobbies().toArray())%></td>
    </tr>
    <%
        }
    %>
</table>


</body>
</html>
