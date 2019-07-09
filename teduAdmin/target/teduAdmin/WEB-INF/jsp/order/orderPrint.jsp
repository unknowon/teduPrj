<%--
  Created by IntelliJ IDEA.
  User: lulu
  Date: 2019-07-04
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@include file="../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>订单打印</title>
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
    </style>
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/bootstrap/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/font-awesome/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/Ionicons/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=ctxPath%>/css/AdminLTE/AdminLTE.min.css">
    <!-- Google Font -->
    <!-- <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic"> -->
</head>
<body onload="window.print();">
<div class="wrapper">
    <!-- Main content -->
    <section class="invoice">
        <!-- title row -->
        <div class="row">
            <div class="col-xs-12">
                <h2 class="page-header">
                    <i class="fa"></i>订单详情
                    <small class="pull-right">日期: <fmt:formatDate value="${order.placed}" pattern="yyyy-MM-dd HH:mm"/> </small>
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
                <b class="my_itemtitle">#${order.id}</b><br>
                <br>
                <b>创建时间：</b><fmt:formatDate value="${order.placed}" pattern="yyyy-MM-dd HH:mm"/><br>
                <b>订单总额：</b>￥${order.payment}<br>
                <b>订单状态：</b>${order.sta}
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
</div>
<!-- ./wrapper -->
</body>
</html>

