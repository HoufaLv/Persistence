<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>第一题</title>
    <%@include file="../include/css.jsp" %>
    <link rel="stylesheet" href="/test/static/testOneJsCss/testOne.css">
</head>
<body class="hold-transition skin-purple-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@include file="../include/navhead.jsp" %>

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
                第一题 <br>
                <small>写一个页面，可以添加和删除页面上的表格</small>
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <button class="btn btn-primary" id="addFormJavaScript">使用原生js添加表格</button>
            <button class="btn btn-primary" id="deleteFromJavaScript">使用原生js删除表格</button>

            <button class="btn btn-success" id="addFormJquery">使用jQuery 添加表格</button>
            <button class="btn btn-success" id="deleteFormJquery">使用jQuery 删除表格</button>
            <br>
            <br>
            <br>
            <div id="testTable">

            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
</div>
<!-- ./wrapper -->

<%@include file="../include/js.jsp" %>
<script src="/test/static/testOneJsCss/testOne.js"></script>
<script >

    $(function () {

        var $tableDiv = $("#testTable");

        $("#addFormJquery").click(function () {

            //避免重复加载
            $tableDiv.html("");

            var $table = $("<table></table>");
            $table.attr("class","table");
            var $tr = $("<tr></tr>");

            //组合Dom 结构,在此处已经组合Dom 元素，删除的时候如果没有table，则提示错误信息
            $tableDiv.append($table);

            //测试数据
            var tableContext = [
                {message: "学习   Node.js"},
                {message: "攒钱买一台 MBP"},
                {message: "学习SpringCloud"},
                {message: "学习       Arch"},
                {message: "修手机         "},
                {message: "给赵总发订货合同"},
                {message: "给赵总发销售合同"}
            ];

            for (var i = 0; i < tableContext.length; i++) {
                var row = tableContext[i];
                console.log(row);
                createRowElement(row);
            }

            //创建元素的function
            function createRowElement(row){
                var html = "<td>"+row.message+"</td>";
                $tr.append(html);
                $table.append($tr);
            }
        });

        $("#deleteFormJquery").click(function () {

            //jQuery判断元素是否含有特定子元素
            if ($("#testTable>table").length==0) {
                layer.msg("未发现表格");
            }else{
                $tableDiv.html("");
            }
        });

    })
</script>
</body>
</html>
