<%--
  Created by IntelliJ IDEA.
  User: lulu
  Date: 2019-07-03
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>订单处理</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- page style-->
    <style>
        .my_itemtitle{
            font-size: 20px;
        }
        .my_info{
            width: 50% !important;
        }
        .my_radio{
            display: inline-block !important;
        }
        .my_formgroup{
            display: inline-block !important;
        }
    </style>
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/bootstrap/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/font-awesome/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/Ionicons/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/AdminLTE/AdminLTE.min.css">
    <!-- AdminLTE Skin -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/AdminLTE/skin/skin-blue.min.css">
    <!-- Google Font -->
    <!-- <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic"> -->
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <header class="main-header">

        <!-- Logo -->
        <a href="#" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>书城</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg">学子书城管理系统</span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">导航切换</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <!-- /.messages-menu -->
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                            <img src="<%=ctxPath%>/img/setting.png" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">${sessionScope.get("userName")}</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="<%=ctxPath%>/img/word.jpg" class="img-circle" alt="User Image">
                                <p>让学习成为一种习惯</p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="<%=ctxPath%>/passwordChange.do" class="btn btn-default btn-flat">修改密码</a>
                                </div>
                                <div class="pull-right">
                                    <a href="<%=ctxPath%>/logout.do" class="btn btn-default btn-flat">退出</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">

        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar Menu -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">&nbsp;</li>
                <!-- Optionally, you can add icons to the links -->
                <li class="treeview active">
                    <a href="#"><i class="fa fa-link"></i> <span>订单管理</span>
                        <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=ctxPath%>/Order/orderList.do">所有订单</a></li>
                        <li><a href="<%=ctxPath%>/Order/orderList.do?sta=待处理">待处理</a></li>
                        <li><a href="<%=ctxPath%>/Order/orderList.do?sta=处理中">处理中</a></li>
                        <li><a href="<%=ctxPath%>/Order/orderList.do?sta=已发货">已发货</a></li>
                        <li><a href="<%=ctxPath%>/Order/orderList.do?sta=已交付">已交付</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#"><i class="fa fa-link"></i> <span>商品管理</span>
                        <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="<%=ctxPath%>/Product/productList.do">所有商品</a></li>
                        <li><a href="<%=ctxPath%>/Product/productAdd.do">添加商品</a></li>
                    </ul>
                </li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1><small></small></h1>
            <ol class="breadcrumb">
                <li><i class="fa fa-dashboard">&nbsp;订单管理</i></li>
                <li><a href="order-list.html"><i class="fa"></i>所有订单</a></li>
                <li class="active">处理订单</li>
            </ol>
        </section>
        <!-- Main content -->
        <section class="invoice">
            <!-- title row -->
            <div class="row">
                <div class="col-xs-12">
                    <h2 class="page-header">
                        <i class="fa"></i>订单详情
                        <small class="pull-right">日期: 2017-10-10</small>
                    </h2>
                </div>
                <!-- /.col -->
            </div>
            <!-- info row -->
            <div class="row invoice-info">
                <div class="col-sm-4 invoice-col my_info">
                    <b class="my_itemtitle">收件人</b><br>
                    <br>
                    <b>姓名：</b>${address.receiver}<br>
                    <b>地址：</b>${address.address}<br>
                    <b>电话：</b>${address.receiverPhone}<br>
                </div>
                <!-- /.col -->
                <div class="col-sm-4 invoice-col my_info">
                    <b class="my_itemtitle">#183</b><br>
                    <br>
                    <b>创建时间：</b><fmt:formatDate value="${order.placed}" pattern="yyyy-MM-dd HH:mm"/><br>
                    <b>订单总额：</b>￥${order.payment}<br>
                    <b>订单状态：</b>
                    <!-- radio -->
                    <div class="form-group my_formgroup">
                        <form action="<%=ctxPath%>/Order/orderProcess.do" method="post">
                            <input type="hidden" name="id" value="${order.id}"/>
                            <div class="radio my_radio">
                                <label>
                                    <input type="radio" name="sta" id="sta1" value="待处理"
                                            <c:if test="${order.sta eq '待处理'}">checked</c:if>
                                            <c:if test="${order.sta eq '处理中'}">disabled</c:if>
                                           <c:if test="${order.sta eq '已发货'}">disabled</c:if>
                                           <c:if test="${order.sta eq '已交付'}">disabled</c:if>
                                           >待处理
                                </label>
                            </div>
                            <div class="radio my_radio">
                                <label>
                                    <input type="radio" name="sta" id="sta2" value="处理中"
                                           <c:if test="${order.sta eq '待处理'}"></c:if>
                                           <c:if test="${order.sta eq '处理中'}">checked</c:if>
                                           <c:if test="${order.sta eq '已发货'}">disabled</c:if>
                                           <c:if test="${order.sta eq '已交付'}">disabled</c:if>>处理中
                                </label>
                            </div>
                            <div class="radio my_radio">
                                <label>
                                    <input type="radio" name="sta" id="sta3" value="已发货"
                                           <c:if test="${order.sta eq '待处理'}">disabled</c:if>
                                           <c:if test="${order.sta eq '处理中'}"></c:if>
                                            <c:if test="${order.sta eq '已发货'}">checked</c:if>
                                           <c:if test="${order.sta eq '已交付'}">disabled</c:if>
                                    >已发货
                                </label>
                            </div>
                            <div class="radio my_radio">
                                <label>
                                    <input type="radio" name="sta" id="sta4" value="已交付"
                                           <c:if test="${order.sta eq '待处理'}">disabled</c:if>
                                           <c:if test="${order.sta eq '处理中'}">disabled</c:if>
                                           <c:if test="${order.sta eq '已发货'}"></c:if>
                                            <c:if test="${order.sta eq '已交付'}">checked</c:if>
                                    >已交付
                                </label>
                            </div>
                            <div class="radio my_radio">
                                <button type="submit" class="btn btn-default">保存</button>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /.col -->
            </div>
            <hr>
            <!-- /.row -->
            <!-- Table row -->
            <div class="row">
                <div class="col-xs-12 table-responsive">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>数量</th>
                            <th>名称</th>
                            <th>商品编号</th>
                            <th>商品描述</th>
                            <th>单价</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${orderItemList}" var="orderItem" varStatus="oi">
                            <tr>
                                <td>${orderItem.count}</td>
                                <td>${bookList[0].title}</td>
                                <td>${bookList[oi.index].isbn}</td>
                                <td>${bookList[oi.index].author} ${bookList[oi.index].author}</td>
                                <td>￥${orderItem.price}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </section>
        <!-- /.content -->
        <div class="clearfix"></div>
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
            缔造年轻人的中国梦
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2021 <a href="http://www.tedu.cn">达内教育</a>.</strong> All rights reserved.
    </footer>

    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
    immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
<script src="<%=ctxPath%>/js/jquery/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=ctxPath%>/js/bootstrap/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="<%=ctxPath%>/js/datatables.net/jquery.dataTables.min.js"></script>
<script src="<%=ctxPath%>/js/datatables.net-bs/dataTables.bootstrap.min.js"></script>
<!-- FastClick -->
<script src="<%=ctxPath%>/js/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=ctxPath%>/js/AdminLTE/adminlte.min.js"></script>
<!-- page script -->
<script>

</script>
</body>
</html>

