<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
out对象是jspWrite的实例,用来向客户端输出文本信息的,将内容写到out中会默认写到out的缓冲区
当jsp执行完成后,统一输出到客户端,默认页面中的静态内容,也是使用out来输出的
<%
    out.println("你好");
    out.flush();  // 把缓冲区的内容写到浏览器
    out.clear();  // 清空缓冲区,缓冲区的内容不会写到页面上
    // clear方法不能在清空缓冲区之后调用
    // 如果 就想调用 那么使用 clearBuffer()
    out.println("我也好");
%>
</body>
</html>
