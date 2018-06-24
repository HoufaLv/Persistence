(function () {
    //获取table 父Dom元素
    var tableDiv = document.querySelector("#testTable");

    //使用原生js 动态添加表格
    document.getElementById("addFormJavaScript").onclick = function () {

        //避免重复加载，注意Dom 开销
        tableDiv.innerHTML = "";

        var table = document.createElement("table");
        var tr = document.createElement("tr");

        //设置属性，组建Dom 关系
        table.setAttribute("class","table");
        tableDiv.appendChild(table);

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
            createRowElement(row);
        }

        //动态创建row
        function createRowElement(row) {
            var td = document.createElement("td");
            var text = document.createTextNode(row.message);

            //组建Dom 关系
            table.appendChild(tr);
            tr.appendChild(td);
            td.appendChild(text);
        }
        layer.msg("添加表格成功");
    }

    //使用原生js 动态删除表格
    document.getElementById("deleteFromJavaScript").onclick = function () {
        if (tableDiv.hasChildNodes()) {
            tableDiv.innerHTML = "";
        }else{
            layer.msg("未发现表格元素");
        }

    }
})();