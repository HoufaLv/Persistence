<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title></title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="/test/static/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/test/static/dist/css/font-awesome.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/test/static/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="/test/static/plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="/"><b>上机测试</b></a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <c:if test="${not empty message}">
            <p class="login-box-msg text-danger">${message}</p>
        </c:if>
        <form method="post">
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="token" placeholder="请输入token" autofocus="autofocus">
            </div>
            <div class="row">

                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">查看</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 3 -->
<script src="/test/static/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/test/static/bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="/test/static/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
    });
</script>
</body>
</html>
