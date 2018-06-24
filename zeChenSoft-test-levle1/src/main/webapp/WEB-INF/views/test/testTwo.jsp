<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>第二题</title>
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
                第二题
                <small>全国省、市、区树状统计表结构（t_address），其中parent_id为上级节点Id</small>
                <small>使用递归查询，查出下属的所有地区</small>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box">
                <div class="box">
                    <img style="width: 800px;" src="/test/static/img/2.png" alt="数据库结构">
                </div>
                <pre>
                    invoke ：
                    select * from t_address
                    where FIND_IN_SET(id,getChildrenNode(16));
                </pre>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
</div>
<!-- ./wrapper -->

<%@include file="../include/js.jsp"%>
</body>
</html>
