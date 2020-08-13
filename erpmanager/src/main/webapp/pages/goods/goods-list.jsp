<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>数据 - AdminLTE2定制版</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="../header.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="../aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">
        <!-- 正文区域 -->
        <section class="content"> <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>
                <div class="box-body">
                    <!-- 数据表格 -->
                    <div class="table-box">
                        <form class="form-horizontal" action="${pageContext.request.contextPath}/goods/findBySelf" method="get">
                            <div class="box-body">
                                <div class="row">
<%--                                    <input type="text" value="1" name="page" hidden="hidden">--%>
<%--                                    <input type="text" value="4" name="size" hidden="hidden">--%>
                                    <div class="col-xs-2">
                                        <input type="text" class="form-control"  placeholder="商品名称" id="name" name="name" value="">
                                    </div>
                                    <div class="col-xs-2">
                                        <input type="text" class="form-control" placeholder="商品型号" id="model" name="model" value="">
                                        <div id="box"></div>
                                    </div>

                                    <div class="col-xs-2">
                                        <select class="form-control" id="brandName" name="brandName" value="">
                                            <option value="-1">商品品牌</option>
                                        </select>
                                    </div>
                                    <div class="col-xs-2">
                                        <select class="form-control" id="categoryName1" value="">
                                            <option value="-1">商品一级分类</option>
                                        </select>
                                    </div>
                                    <div class="col-xs-2">
                                        <select class="form-control" id="categoryName2" name="categoryName" value="">
                                            <option value="-1">商品二级分类</option>
                                        </select>
                                    </div>
                                    <button type="submit"  class="btn btn-info  pull-left" style="margin-right: 20px">搜索</button>
                                    <a class="btn btn-info  pull-left" href="${pageContext.request.contextPath}/pages/goods/goods-add.jsp">新建</a>
                                </div>
                            </div>
                        </form>
                        <!--工具栏/-->
                        <!--数据列表-->
                        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right:0px;">
                                    <input id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="sorting_asc">ID</th>
                                <th class="text-center">商品名称</th>
                                <th class="text-center">商品分类</th>
                                <th class="text-center">商品品牌</th>
                                <th class="text-center">商品型号</th>
                                <th class="text-center">商品颜色</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${pageInfo.list}" var="goods" varStatus="status">
                                <tr>
                                    <td><input name="ids" type="checkbox"></td>
                                    <td>${ status.index + 1}</td>
                                    <td>${goods.name}</td>
                                    <td>${goods.categoryName}</td>
                                    <td>${goods.brandName}</td>
                                    <td>${goods.model}</td>
                                    <td>${goods.color}</td>
                                        <%--                                    <td><fmt:formatDate value="${good.ctime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>--%>
                                    <td class="text-center">
                                        <button type="button" class="btn bg-olive btn-xs"
                                                onclick="location.href='${pageContext.request.contextPath}/goods/findById.do?id=${goods.id}'">
                                            详情
                                        </button>
                                        <button type="button" class="btn bg-olive btn-xs"
                                                onclick="location.href='${pageContext.request.contextPath}/goods/findById.do?id=${goods.id}'">
                                            修改
                                        </button>

                                        <button type="button" class="btn bg-olive btn-xs"
                                                onclick="location.href='${pageContext.request.contextPath}/goods/deleteById.do?id=${goods.id}'">
                                            删除
                                        </button>
                                            <%--&uuser=${name}--%>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <!--数据列表/-->
                    </div>
                    <!-- 数据表格 /-->
                </div>
                <!-- /.box-body -->
                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共${pageInfo.pages} 页，共${pageInfo.total} 条数据。 每页 <select id="changePageSize"
                                                                                     class="form-control"
                                                                                     onchange="changePageSize()">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select> 条
                        </div>
                    </div>
                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li>
                                <a href="${pageContext.request.contextPath}/goods/findAll?page=1&size=${pageInfo.pageSize}"
                                   aria-label="Previous">首页</a></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/goods/findAll.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a>
                            </li>
                            <c:forEach begin="1" end="${pageInfo.pages}" var="currentPage">
                                <li>
                                    <a href="${pageContext.request.contextPath}/goods/findAll.do?page=${currentPage}&size=${pageInfo.pageSize}">${currentPage}</a>
                                </li>
                            </c:forEach>
                            <li>
                                <a href="${pageContext.request.contextPath}/goods/findAll.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/goods/findAll.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}"
                                   aria-label="Next">尾页</a></li>
                        </ul>
                    </div>
                </div>
                <!-- /.box-footer-->
            </div>
        </section>
        <!-- 正文区域 /-->
    </div>
    <!-- @@close -->
    <!-- 内容区域 /-->
    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2014-2017 <a
                href="http://www.itcast.cn">研究院研发部</a>.
        </strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>

<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script>
    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document)
        .ready(
            function () {

                // 激活导航位置
                setSidebarActive("admin-datalist");

                // 列表按钮 
                $("#dataList td input[type='checkbox']")
                    .iCheck(
                        {
                            checkboxClass: 'icheckbox_square-blue',
                            increaseArea: '20%'
                        });
                // 全选操作 
                $("#selall")
                    .click(
                        function () {
                            var clicks = $(this).is(
                                ':checked');
                            if (!clicks) {
                                $(
                                    "#dataList td input[type='checkbox']")
                                    .iCheck(
                                        "uncheck");
                            } else {
                                $(
                                    "#dataList td input[type='checkbox']")
                                    .iCheck("check");
                            }
                            $(this).data("clicks",
                                !clicks);
                        });

            });
    /* ========================自己添加的js============================  */
    //页面加载后每页多少条的值
    $(document).ready(function () {
        $('#changePageSize').find('option[value=${pageInfo.pageSize}]').prop('selected', true);
    })
    /* ========================自己添加的js============================  */
    $(document).ready(function () {
        //加载品牌下拉列表
        $.ajax({
            url: '${pageContext.request.contextPath}/goodsBrand/findAll',
            dataType: 'json',//接收到的数据类型转换为json
            success: function (data) {
                var option;
                for (var i = 0; i < data.length; i++) {
                    option = $("<option></option>");
                    option.val(data[i].brandName);
                    option.text(data[i].brandName);
                    $('#brandName').append(option);
                }
            }
        })
        //加载类型下拉列表
        $.ajax({
            url: '${pageContext.request.contextPath}/goodsType/findAllParent',
            dataType: 'json',//接收到的数据类型转换为json
            success: function (data) {
                var option;
                for (var i = 0; i < data.length; i++) {
                    option = $("<option></option>");
                    option.val(data[i].id);
                    option.text(data[i].categoryName);
                    $('#categoryName1').append(option);
                }
            }
        })
    })
    //触发二级选项框
    $('#categoryName1').change(function () {
        var parentId = $('#categoryName1').val();
        var option;
        if (parentId!=-1){
            $.ajax({
                url: '${pageContext.request.contextPath}/goodsType/findAllSon?parentId=' + parentId,
                dateType: 'json',
                success: function (data) {
                    $('#categoryName2').empty();
                    for (var i = 0; i < data.length; i++) {
                        option = $("<option></option>");
                        option.val(data[i].categoryName);
                        option.text(data[i].categoryName);
                        $('#categoryName2').append(option);
                    }
                }
            })
        }else{
            $('#categoryName2').empty();
            option = $('<option value=-1>商品二级分类</option>');
            $('#categoryName2').append(option);
        }
    })
    //添加渠道分类
    $('#addChannelType').click(function () {
        location.href = "${pageContext.request.contextPath}/pages/goods-add.jsp"
    })

    //改变页面显示的行数
    function changePageSize() {
        var pageSize = $("#changePageSize").val();
        location.href = "${pageContext.request.contextPath}/goods/findAll?page=1&size=" + pageSize;
    }


</script>
</body>

</html>