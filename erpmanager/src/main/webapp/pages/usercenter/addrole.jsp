<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
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
                <small>游记攻略表单</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="all-travellog-manage-list.html">游记攻略管理</a></li>
                <li class="active">游记攻略表单</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">

            <div class="box-body">

                <!--tab页-->
                <div class="nav-tabs-custom">

                    <!--tab头-->
                    <ul class="nav nav-tabs">
                        <li class="active">
                            <a href="#tab-form" data-toggle="tab">
                                <c:if test="${requestScope.id == null }">添加角色</c:if>
                                <c:if test="${requestScope.id != null }">修改角色</c:if>
                            </a>
                        </li>
                    </ul>
                    <!--tab头/-->

                    <!--tab内容-->
                    <div class="tab-content">
                        <c:if test="${requestScope.id == null }">
                            <form action="${pageContext.request.contextPath}/role/register" method="post" name="form" onSubmit="return beforeSubmit(this);">
                        </c:if>
                        <c:if test="${requestScope.id != null }">
                            <form action="${pageContext.request.contextPath}/role/update" method="post" name="form" onSubmit="return beforeSubmit(this);">
                        </c:if>
                                <c:if test="${requestScope.id != null }">
                                    <input type="hidden" name="id" value="${role.id}">
                                </c:if>
                                <!--表单内容-->
                                <div class="tab-pane active" id="tab-form">
                                    <div class="row data-type">
                                        <div class="col-md-2 title">角色名称</div>
                                        <div class="col-md-10 data">
                                            <c:if test="${requestScope.id == null }">
                                                <input type="text" class="form-control" placeholder="角色"
                                                       name="roleName">
                                            </c:if>
                                            <c:if test="${requestScope.id != null }">
                                                <input type="text" class="form-control" placeholder="角色"
                                                       name="roleName" value="${role.roleName}">
                                            </c:if>
                                        </div>

                                        <div class="col-md-2 title">角色编码</div>
                                        <div class="col-md-10 data">
                                            <c:if test="${requestScope.id == null }">
                                                <input type="text" class="form-control" placeholder="角色编码"
                                                       name="roleCode">
                                            </c:if>
                                            <c:if test="${requestScope.id != null }">
                                                <input type="text" class="form-control" placeholder="角色编码"
                                                       name="roleCode" value="${role.roleCode}">
                                            </c:if>

                                        </div>
                                    </div>

                                    <!--游记-->
                                    <div class="panel panel-default">
                                        <div class="panel-heading">备注</div>
                                        <div id="dayslist" class="panel-body">

                                            <div class="box box-success">
                                                <div class="box-header with-border">
                                                    <h3 class="box-title">备注</h3>
                                                </div>
                                                <div class="box-body">
                                                    <c:if test="${requestScope.id == null }">
                                                    <textarea name="remark" class="textarea"
                                                              placeholder="请简短扼要的写出角色的备注信息"
                                                              style="width: 100%; height: 265px; font-size: 14px;
                                                              line-height: 18px; border: 1px solid #dddddd; padding: 10px;"></textarea>
                                                    </c:if>
                                                    <c:if test="${requestScope.id != null }">
                                                         <textarea name="remark" class="textarea"
                                                                   placeholder="请简短扼要的写出角色的备注信息"
                                                                   style="width: 100%; height: 265px; font-size: 14px;
                                                                   line-height: 18px; border: 1px solid #dddddd; padding: 10px;">${role.remark}</textarea>
                                                    </c:if>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                    <!--游记/-->

                                    <!--工具栏-->
                                    <div class="box-tools text-center">
                                        <button type="submit" class="btn bg-maroon">保存</button>
                                        <button type="button" class="btn bg-default" onclick="history.back(-1);">
                                            返回
                                        </button>
                                    </div>
                                    <!--工具栏/-->

                                </div>
                                <!--表单内容/-->
                            </form>
                    </div>
                    <!--tab内容/-->
                </div>
                <!--tab页/-->
            </div>
        </section>
        <!-- 正文区域 /-->
    </div>
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
    function beforeSubmit(form) {
        if (form.roleName.value == '') {
            alert('角色名不能为空！');
            form.roleName.focus();
            return false;
        }
        if (form.roleCode.value == '') {
            alert('角色编码不能为空！');
            form.roleCode.focus();
            return false;
        }
        if (form.remark.value == '') {
            alert('备注信息不能为空');
            form.remark.focus();
            return false;
        }
        return true;
    }
</script>
</body>
</html>