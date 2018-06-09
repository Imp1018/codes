<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/5/22
  Time: 上午10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
EL表达式
EL表达式 是 jsp2.0之后开始提供的,表达式语言
专门,只能用来代替jsp表达式,就是说 只能做输出
<%
    pageContext.setAttribute("keyPage", "page域");
%>
<%--EL表达式 可以从 域对象中取值
1.EL表达语法是${要取的值} 它不是java代码 所以没有.方法
2.取值的时候,这些值需要从其他内置对象中获得 或者从javabean中获得
3.从域对象中取值,实际上 是获得applicationScope 这个map
直接 map.key 就可以获得这个map对应的value
--%>
<P>${applicationScope.keyApp}</P>
<P>${sessionScope.keySession}</P>
<P>${requestScope.keyRequest}</P>
<P>${pageScope.keyPage}</P>
<%--全域查找--%>
<p>${keySession}</p>


<%--取cookie里的值: cookie.cookie名字.value
在EL表达式中, 点 这个操作符 会自动的调用一个对象的getxxx方法
即 A.B=>A.getB()--%>
<P>${cookie.JSESSIONID.value}</P>
<P>你好:${sessionScope.user.age}岁的${sessionScope.user.name}
你${sessionScope.user.marry}结婚</P>
<%--在map中取值 可以直接map.key这种形式去取值--%>
<%--如果key值 有 特殊符号
 就不能用,而是用['key']单引号表示字符
 如果是 数组/--%>
<P>${sessionScope.user.jobs[bai-du]}</P>
<%--从参数中取值--%>
<p>${param.username}</p>
</body>
</html>
