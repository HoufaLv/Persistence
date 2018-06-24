<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>第五题</title>
    <%@include file="../include/css.jsp"%>
</head>
<body class="hold-transition skin-purple-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@include file="../include/navhead.jsp"%>

    <!-- =============================================== -->

    <jsp:include page="../include/sider.jsp">
        <jsp:param name="menu" value="home"/>
    </jsp:include>

    <!-- =============================================== -->

    <!-- 右侧内容部分 -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                第五题
                <small>写一个select选择框。</small>
                <br>
                <small>要求：选择框可以输入文字，并且选择框可以根据输入的文字模糊查询筛选选择框已有的内容。</small>
                <br>
                <small>提示：1、选择框可以用combotree实现，默认可以选择所有可选择的内容；2、在选择框输入一个关键字段，根据输入的关键字，筛选选择框的内容，只显示包含输入关键字的选项。</small>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box no-border">
                <div class="box-body">
                    <form method="post" id="form"  class="form-inline">
                        <input type="text" name="addressName" placeholder="请输入搜索关键字" class="form-control" value="">
                        <button class="btn btn-default" id="serarchArea">搜索</button>
                    </form>
                </div>
            </div>

            <table class="table">
                <c:forEach items="${tAddress}" var="address">
                    <tr>
                        <td><span>${address.addressName}</span> <br></td>
                    </tr>
                </c:forEach>
            </table>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
</div>
<!-- ./wrapper -->

<%@include file="../include/js.jsp"%>
</body>
</html>
