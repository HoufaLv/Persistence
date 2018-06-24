<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>第四题</title>
    <%@include file="../include/css.jsp"%>
    <link rel="stylesheet" href="/test/static/plugins/treegrid/css/jquery.treegrid.css">
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
                第四题
                <small>将父子关系一次展开显示</small>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">权限列表</h3>
                </div>
                <div class="box-body">
                    <table class="table tree">
                        <thead>
                        <tr>
                            <th>权限名称</th>
                            <th>权限代号</th>
                            <th>资源URL</th>
                            <th>类型</th>
                            <th>#</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${permissionList}" var="permission">
                            <c:choose>
                                <c:when test="${permission.parentId == 0}">
                                    <tr class="treegrid-${permission.id} treegrid-expanded">
                                        <td>${permission.permissionName}</td>
                                        <td>${permission.permissionCode}</td>
                                        <td>${permission.permissionUrl}</td>
                                        <td>${permission.permissionType}</td>

                                    </tr>
                                </c:when>
                                <c:otherwise>
                                    <tr class="treegrid-${permission.id} treegrid-expanded treegrid-parent-${permission.parentId}">
                                        <td>${permission.permissionName}</td>
                                        <td>${permission.permissionCode}</td>
                                        <td>${permission.permissionUrl}</td>
                                        <td>${permission.permissionType}</td>

                                    </tr>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section>

        <section class="content">

            <div class="box">
                <small>第二部分</small>
                <table class="table tree">
                    <tbody >
                    <c:forEach items="${tAddressList}" var="address">
                        <c:choose>
                            <c:when test="${address.parentId == 0}">
                                <tr class="treegrid-${address.id} treegrid-expanded">
                                    <td>${address.addressName}</td>

                                </tr>
                            </c:when>
                            <c:otherwise>
                                <tr class="treegrid-${address.id} treegrid-expanded treegrid-parent-${address.parentId}">
                                    <td>${address.addressName}</td>
                                </tr>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
</div>
<!-- ./wrapper -->

<%@include file="../include/js.jsp"%>
<script src="/test/static/plugins/treegrid/js/jquery.treegrid.min.js"></script>
<script src="/test/static/plugins/treegrid/js/jquery.treegrid.bootstrap3.js"></script>
<script src="/test/static/plugins/layer/layer.js"></script>

<script>
    $(function () {
        $('.tree').treegrid();

        $(".delLink").click(function(){
            var id = $(this).attr("rel");
            layer.confirm("确定要删除吗",function (index) {
                layer.close(index);
                $.get("/manage/permission/"+id+"/del").done(function (result) {
                    if(result.status == 'success') {
                        history.go(0);
                    } else {
                        layer.msg(result.message);
                    }
                }).error(function () {
                    layer.msg("服务器忙");
                });
            })
        });
    });
</script>
</body>
</html>
