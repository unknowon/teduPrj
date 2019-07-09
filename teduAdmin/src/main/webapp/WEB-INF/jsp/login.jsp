<%--
  Created by IntelliJ IDEA.
  User: lulu
  Date: 2019-07-01
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>登录</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- page style -->
    <style>

    </style>
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/bootstrap/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/font-awesome/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/Ionicons/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/AdminLTE/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/iCheck/square/blue.css">
    <!-- Google Font -->
    <!-- <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic"> -->
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="<%=ctxPath%>/login.do"><b>学子书城管理系统</b></a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">管理员登录</p>

        <form action="<%=ctxPath%>/login.do" method="post">
            <div class="form-group has-feedback">
                <input name="uname" type="text" class="form-control" placeholder="Name">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input name="upwd" type="password" class="form-control" placeholder="Password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
            <div class="row">
                <!-- /.col -->
                <div class="col-xs-10">
                    ${msg}
                </div>
                <!-- /.col -->
            </div>
        </form>

        <!-- /.social-auth-links -->
        <a href="#">忘记密码？</a><br>
    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 3 -->
<script src="<%=ctxPath%>/js/jquery/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=ctxPath%>/js/bootstrap/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="<%=ctxPath%>/js/iCheck/icheck.min.js"></script>
<!-- page script -->
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });
</script>
</body>
</html>

