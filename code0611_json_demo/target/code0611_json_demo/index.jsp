<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/6/11
  Time: 下午3:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="/jquery-3.3.1.min.js"></script>
</head>
<body>
<button onclick="f1();">发送并接收Json数据</button>
</body>
<script>
    function f1() {
        $.ajax({
            url: "/json",
            type: "post",
            data: '{"brand":"apple","model":"Hsdqw213-546","price":"3999.9"}',
            contentType: "application/json",
            success: function (data) {
                console.log(data)
            }
        });
    }

</script>
</html>
