<%
    String username=request.getParameter("username");
    //登录成功
    session.setAttribute("username",username);
    // 请求重定向到 privacy.jsp
    response.sendRedirect(request.getContextPath()+"/session/privacy.jsp");
%>