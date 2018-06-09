<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/21
  Time: 下午5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //application就是ServletContext
    //只要ServletContext中有的方法
    //application都有
    //域对象中,范围最大的
    application.setAttribute("aa","bb");

    //page对象 指向的是当前jsp页面的对象
    //相当于this,但是 类型被人规定成了Object
    //所以只能调用Object里有的方法,
    //而本体类型,其实是 jsp编译生成的java类的对象
    //要想使用 当前类的对象,请使用this
    //page没有用
    page.toString();

    //7.pageContext
    //jsp才有的对象,servlet中没有
    //它是jsp四大域对象(application,session,request,pageContext)之一
    //它也有域对象的通用方法,它的作用范围:
    //当前jsp页面中
    //pageContext 它的类型是 pageContext
    //这个类一个顶八个

    //可以通过pageContext 获取其他所有的内置对象
    Object page1 = pageContext.getPage();
    ServletRequest request1 = pageContext.getRequest();
    ServletResponse response1 = pageContext.getResponse();
    ServletContext servletContext = pageContext.getServletContext();

    //使用pageContext 可以做到请求包含 和请求转发
%>
</body>
</html>
