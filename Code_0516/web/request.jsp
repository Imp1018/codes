<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/16
  Time: 上午11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
request 封装了 HTTP请求的 所有信息,不分get/post,用法和Servlet中的request 没有区别
<%
    String contextPath = request.getContextPath();
    String servletPath = request.getServletPath();

    out.println("contextpath:"+contextPath);
    out.print("<br>");
    out.println("servletpath:"+servletPath);
%>
<%--
javaweb中的路径:
一条完整的网址由以下几部分组成
协议:// ip地址:端口号/项目名称/各个Servlet/jsp的配置路径

例如:
http://localhost:8080/Code0516/myup

其中 我们的项目名称可以为空,idea默认帮我们启动项目,项目名称就是空的,但是实际部署项目时
项目名称往往不为空,一个服务器上就会跑一个Tomcat,当我们有多个项目需要运行的时候就需要
使用项目名称来区分这个Tomcat中的各个项目
在我们平常使用路径的时候有2种写法
1. 绝对路径
以/开头 真正访问的时候 会拼接到端口号后面
2. 相对路径
以非/开头 拼接的时候是相对与当前页面所处的路径

例如:项目名称为ABC,要访问的页面是:
http://localhost:8080/ABC/a/b/c/target.jsp
当前页面地址是:
http://localhost:8080/ABC/a/e/f/now.jsp

使用绝对路径是:
/ABC/a/b/c/target.jsp
相对路径
../../b/c/target.jsp
可以看出使用相对路径,不需要关心项目名称,但是对两个文件的位置要求比较严格
而绝对路径,则必须在前面加上项目名称,但是项目名称之后又可能更改

解决办法
统一使用绝对路径,项目名称使用request对象的contextpath方法来动态获取


--%>
</body>
</html>
