<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>第三题</title>
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
                第三题
                <small>三．表a中有A B C三列,用SQL语句实现：当A列大于B列时选择A列否则选择B列，当B列大于C列时选择B列否则选择C列。</small>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box">
                <img style="width: 800px;" src="/test/static/img/1.png" alt="数据库结构">
            </div>
            <div class="box">
                <small>Sql</small>
                <br>
                <pre>
                    SELECT
                    (CASE WHEN column_a>column_b THEN column_a ELSE column_b END) as result_column,
                    (CASE WHEN column_b>column_c THEN column_b ELSE column_c END) as result_column
                    FROM testThree
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
