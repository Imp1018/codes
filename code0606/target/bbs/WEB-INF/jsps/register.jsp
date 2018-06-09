<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/6/7
  Time: 下午4:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <script src="../../js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-12 column" style="margin-top: 80px">
                    <ul class="breadcrumb">
                        <li>
                            <a href="index.jsp">Log in</a>
                        </li>
                        <li>
                            <a href="javascript:void(0);">Registration</a>
                        </li>
                        <li class="active">
                            Beta
                        </li>
                    </ul>
                </div>
            </div>
            <div class="row clearfix" style="margin-top: 100px">
                <div class="col-md-3 column">
                </div>
                <div class="col-md-1 column">
                </div>
                <div class="col-md-4 column">
                    <span style="color: red">${msg}</span>
                    <form role="form" action="/user/register" method="post" onsubmit="return valid_submit()">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Username</label><input type="text" class="form-control"
                                                                                   id="exampleInputEmail1"
                                                                                   name="name"/>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label><input type="password"
                                                                                      class="form-control"
                                                                                      id="exampleInputPassword1"
                                                                                      name="password"/>
                        </div>
                        <div class="form-group">
                            <label for="repass">Confirm Password</label><input type="password"
                                                                                              class="form-control"
                                                                                              id="repass"/>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputNickname">Nickname</label><input type="text" class="form-control"
                                                                                     id="exampleInputNickname" name="nickname"/>
                        </div>
                        <%--<div class="form-group">--%>
                        <%--<label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />--%>
                        <%--<p class="help-block">--%>
                        <%--Example block-level help text here.--%>
                        <%--</p>--%>
                        <%--</div>--%>
                        <div class="radio">
                            <label><input type="radio" name="gender"/>Male</label>
                            <label><input type="radio" name="gender"/>FeMale</label>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
                <div class="col-md-1 column">
                </div>
                <div class="col-md-3 column">
                </div>
            </div>
            <div class="carousel slide" id="carousel-662581">
                <ol class="carousel-indicators">
                    <li data-slide-to="0" data-target="#carousel-662581">
                    </li>
                    <li data-slide-to="1" data-target="#carousel-662581">
                    </li>
                    <li data-slide-to="2" data-target="#carousel-662581" class="active">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item">
                        <img alt="" src="./file/default(5).jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                First Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="./file/default(6).jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Second Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item active">
                        <img alt="" src="./file/default(7).jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Third Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-662581" data-slide="prev"><span
                        class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control"
                                                                                href="#carousel-662581"
                                                                                data-slide="next"><span
                    class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
            <div class="row clearfix">
                <div class="col-md-12 column">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    function valid_submit() {
        var name = $("input[name='username']").val();
        var password = $("input[name='password']").val();
        var repass = $("#repass").val();
        if (name != "" && password != "" && password == repass) {
            return true;
        }else {
            return false;
        }
    }
</script>
</html>
