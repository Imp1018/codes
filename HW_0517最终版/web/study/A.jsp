<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/21
  Time: 下午5:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>锄禾日当午</p>
<%
    //可以将一个页面的内容
    //完全的放到另一个页面中加载
    //这就是请求包含
    //用request做 其实是完全一样的
    //那么这两个页面可以使用 pageContext传值
    //但是 一般我们都会使用request域传值
    pageContext.include("B.jsp");
    //全域查找
    application.setAttribute("key", "App");
    session.setAttribute("key", "Session");
    request.setAttribute("key", "request");
    //pageContext.setAttribute("key", "pageContext");
%>

<p>
    <%--会自动的上不同的域中去查找key值对应的value
    查找顺序是 有小到大:
    pageContext->request->session->application
    只有都没有找到,才返回null--%>
    全域查找:
    <%=pageContext.findAttribute("key")%>
</p>

<p>汗滴禾下土</p>
</body>
</html>
