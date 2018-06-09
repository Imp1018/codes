<%@ page import="com.lanou3g.code0522.Person" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    application.setAttribute("keyApp", "app域");
    session.setAttribute("keySession", "session域");
    request.setAttribute("keyRequest", "request域");

    Person person = new Person();
    person.setName("张三");
    person.setAge(18);
    session.setAttribute("user", person);
    // 定义的时候写泛型
    // new的时候不写泛型
    // 这是java1.7 的 类型推断机制
    // jsp中没有, 所有的泛型不能省略
    Map<String, String> jobs = new HashMap<String, String>();
    jobs.put("lanou", "ceo");
    jobs.put("bai-du", "cto");
    person.setJobs(jobs);
    pageContext.forward("/test3.jsp");
%>
