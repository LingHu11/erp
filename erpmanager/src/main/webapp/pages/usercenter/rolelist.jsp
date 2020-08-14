<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>天翼</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

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
    <jsp:include page="../header.jsp"></jsp:include>
    <jsp:include page="../aside.jsp"></jsp:include>
    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                游记攻略管理
                <small>游记攻略列表</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="all-travellog-manage-list.html">游记攻略管理</a></li>
                <li class="active">游记攻略列表</li>
            </ol>
        </section>
        <!-- 内容头部 /-->
        <!-- 模态框（Modal） -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                        <h4 class="modal-title" id="myModalLabel">
                            是否确认删除?
                        </h4>
                    </div>
                    <div class="modal-body">
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary"
                                    onclick='document.getElementById("rolelist").submit()' data-dismiss="modal">删除
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>
        </div>
        <!-- 正文区域 -->
        <section class="content">

            <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-body" style="clear: both">
                    <!--工具栏-->
                    <form class="form-horizontal" action="${pageContext.request.contextPath}/goods/findBySelf"
                          method="get">
                        <div class="box-body">
                            <div class="row">
                                <%--                                    <input type="text" value="1" name="page" hidden="hidden">--%>
                                <%--                                    <input type="text" value="4" name="size" hidden="hidden">--%>
                                <div class="col-xs-2">
                                    <input type="text" class="form-control" placeholder="商品名称" id="name"
                                           name="name" value="">
                                </div>
                                <div class="col-xs-2">
                                    <select class="form-control" id="brandName" name="brandName" value="">
                                        <option value="-1">商品品牌</option>
                                    </select>
                                </div>
                                <div class="col-xs-2">
                                    <select class="form-control" id="categoryName1" name="categoryName" value="">
                                        <option value="-1">商品一级分类</option>
                                    </select>
                                </div>
                                <button type="submit" class="btn btn-info pull-left" style="margin-right: 15px">搜索
                                </button>
                                <!--工具栏-->
                                <div class="pull-right" style="margin-bottom: 5px;margin-right: 30px">
                                    <div class="form-group form-inline">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-default" title="新建"
                                                    onclick='location.href="${pageContext.request.contextPath}/pages/usercenter/addrole.jsp"'>
                                                <i class="fa fa-file-o"></i> 新建
                                            </button>
                                            <button type="button" class="btn btn-default" title="删除"
                                                    data-toggle="modal" data-target="#myModal"><i
                                                    class="fa fa-trash-o"></i> 删除
                                            </button>
                                            <button type="button" class="btn btn-default" title="刷新"
                                                    onclick="window.location.reload();"><i
                                                    class="fa fa-refresh"></i> 刷新
                                            </button>
                                        </div>
                                    </div>
                                </div>
                                <!--工具栏/-->
                            </div>
                        </div>
                    </form>


                    <!--数据列表-->
                    <form id="rolelist" action="${pageContext.request.contextPath}/role/delete" method="post">
                        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right:0px;">
                                    <input id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="">ID</th>
                                <th class="">角色名称</th>
                                <th class="">角色编码</th>

                                <th class="">备注</th>
                                <th class="">创建时间</th>

                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${pageInfo.list}" var="role">
                                <tr>
                                    <td><input name="ids" type="checkbox" value="${role.id}"></td>
                                    <td>${role.id}</td>
                                    <td>${role.roleName}</td>
                                    <td>${role.roleCode}</td>

                                    <td>${role.remark}</td>
                                    <td>${role.gmtCreate}</td>

                                    <td class="text-center">
                                        <button type="button" class="btn bg-olive btn-xs"
                                                onclick='location.href="${pageContext.request.contextPath}/role/getrole/${role.id}"'>编辑
                                        </button>
                                        <button type="button" class="btn bg-olive btn-xs"
                                                onclick='location.href="all-travellog-review-list.html"'>查看评论
                                        </button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
            <div class="box-footer">
                <div class="pull-left">
                    <div class="form-group form-inline">
                        总共${pageInfo.pages} 页，共${pageInfo.total} 条数据。 每页 <select id="changePageSize"
                                                                                 class="form-control"
                                                                                 onchange="changePageSize()">
                        <option value="3">3</option>
                        <option value="6">6</option>
                        <option value="9">9</option>
                        <option value="12">12</option>
                        <option value="15">15</option>
                    </select> 条
                    </div>
                </div>
                <div class="box-tools pull-right">
                    <ul class="pagination">
                        <li>
                            <a href="${pageContext.request.contextPath}/role/list?page=1&size=${pageInfo.pageSize}"
                               aria-label="Previous">首页</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/role/list?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a>
                        </li>
                        <c:forEach begin="1" end="${pageInfo.pages}" var="currentPage">
                            <li>
                                <a href="${pageContext.request.contextPath}/role/list?page=${currentPage}&size=${pageInfo.pageSize}">${currentPage}</a>
                            </li>
                        </c:forEach>
                        <li>
                            <a href="${pageContext.request.contextPath}/role/list?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/role/list?page=${pageInfo.pages}&size=${pageInfo.pageSize}"
                               aria-label="Next">尾页</a></li>
                    </ul>
                </div>
            </div>
        </section>
    </div>

    <!-- 内容区域 /-->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2014-2017 <a
                href="http://www.itcast.cn">研究院研发部</a>.
        </strong> All rights reserved.
    </footer>
</div>

<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>$.widget.bridge('uibutton', $.ui.button);</script>
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
<script src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
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

    $(document).ready(function () {

        // 激活导航位置
        setSidebarActive("travellog-manage");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass: 'icheckbox_square-blue',
            increaseArea: '20%'
        });
        // 全选操作
        $("#selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });
    /* ========================自己添加的js============================  */
    //页面加载后每页多少条的值
    $(document).ready(function () {
        $('#changePageSize').find('option[value=${pageInfo.pageSize}]').prop('selected', true);
    })

    //改变页面显示的行数
    function changePageSize() {
        var pageSize = $("#changePageSize").val();
        location.href = "${pageContext.request.contextPath}/role/list?page=1&size=" + pageSize;
    }

</script>
</body>
<style type="text/css">
    th {
        text-align: center;
    }

    tr {
        text-align: center;
    }

    .form-horizontal input {
        border-radius: 8px;
    }

    .form-horizontal select {
        border-radius: 8px;
    }
</style>

</html>