<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
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
                            <a href="user/toLogin">Log in</a>
                        </li>
                        <li>
                            <a href="register.jsp">Registration</a>
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
                    <span style="color: red">*${msg}</span>
                    <form class="form-horizontal" role="form" action="/user/login" method="post">
                        <div class="form-group">
                            <label for="inputTest3" class="col-sm-2 control-label">Username</label>
                            <br>
                            <br>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputTest3" value="${user.name}" name="name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                            <br>
                            <br>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="inputPassword3" name="password"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label><input type="checkbox" />Remember me</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Log  in</button>
                            </div>
                        </div>
                        <br>
                        <a href="/user/toRegister">免费注册</a>
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
                        <img alt="" src="/imgs/3.jpg" />
                        <div class="carousel-caption">
                            <h4>
                                First Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="" src="/imgs/1.jpeg" />
                        <div class="carousel-caption">
                            <h4>
                                Second Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item active">
                        <img alt="" src="/imgs/2.jpg" />
                        <div class="carousel-caption">
                            <h4>
                                Third Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                </div> <a class="left carousel-control" href="#carousel-662581" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-662581" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
            <div class="row clearfix">
                <div class="col-md-12 column">
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
