<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="../header.jsp"></jsp:include>
    <!-- 页面头部 /-->
    <!-- 导航侧栏 -->
    <jsp:include page="../aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                商品管理 <small>商品添加</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a
                        href="#">商品管理</a></li>
                <li class="active">商品添加</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <form action="${pageContext.request.contextPath}/goods/update"
              method="post" name="form" onsubmit="return beforeSubmit(this)">
            <input class="form-control" name="id" type="hidden" value="${goods.id}">
            <!-- 正文区域 -->
            <section class="content"> <!--产品信息-->
                <%--更新--%>
                <c:if test="${page.equals('update')}">
                <div class="panel panel-default">
                    <div class="panel-heading">商品信息</div>
                    <div class="row data-type">
                        <div class="col-md-2 title">商品数量</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="number"
                                   placeholder="商品数量" value="${goods.number}">
                        </div>

                        <div class="col-md-2 title">商品名称</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="name"
                                   placeholder="商品名称" value="${goods.name}">
                        </div>

                        <div class="col-md-2 title">一级分类</div>
                        <div class="col-md-4 data">
                            <select class="form-control" id="categoryName1">
                                <option value="-1">${goodsType.categoryName}(当前商品一级分类名称)</option>
                            </select>
                        </div>
                        <div class="col-md-2 title">二级分类</div>
                        <div class="col-md-4 data">
                            <select class="form-control" name="categoryName" id="categoryName2">
                                <option value="${goods.categoryName}">${goods.categoryName}(当前商品二级分类名称)</option>
                            </select>
                        </div>


                        <div class="col-md-2 title">品牌名称</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="brandName"
                                   placeholder="品牌名称" value="${goods.brandName}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">商品型号</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="model"
                                   placeholder="商品型号" value="${goods.model}">
                        </div>

                        <div class="col-md-2 title">购买价格</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="purchasePrice"
                                   placeholder="购买价格" value="${goods.purchasePrice}">
                        </div>

                        <div class="col-md-2 title">购买部门</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="purchaseDept"
                                   placeholder="购买部门" value="${goods.purchaseDept}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">市场价格</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="marketPrice"
                                   placeholder="市场价格" value="${goods.mallPrice}">
                        </div>

                        <div class="col-md-2 title">商城价格</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="mallPrice"
                                   placeholder="商城价格" value="${goods.mallPrice}">
                        </div>

                    </div>
                </div>
                <!--订单信息/--> <!--工具栏-->
                <div class="box-tools text-center">
                    <button type="submit" class="btn bg-maroon" id="save">保存</button>
                    <button type="button" class="btn bg-default"
                            onclick="history.back(-1);">返回
                    </button>
                </div>
                </c:if>
                <%--更新--%>
                <%--详情--%>
                <c:if test="${page.equals('detail')}">
                <div class="panel panel-default">
                    <div class="panel-heading">商品信息</div>
                    <div class="row data-type">
                        <div class="col-md-2 title">商品数量</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="number"
                                    value="${goods.number}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">商品名称</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="name"
                                    value="${goods.name}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">一级分类</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="categoryName1"
                                  value="${goodsType.categoryName}" readonly="readonly">
                        </div>
                        <div class="col-md-2 title">二级分类</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="categoryName2"
                                  value="${goods.categoryName}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">品牌名称</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="brandName"
                                   value="${goods.brandName}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">商品型号</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="model"
                                   value="${goods.model}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">购买价格</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="purchasePrice"
                                    value="${goods.purchasePrice}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">购买部门</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="purchaseDept"
                                  value="${goods.purchaseDept}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">市场价格</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="marketPrice"
                                    value="${goods.mallPrice}" readonly="readonly">
                        </div>

                        <div class="col-md-2 title">商城价格</div>
                        <div class="col-md-4 data">
                            <input type="text" class="form-control" name="mallPrice"
                                   value="${goods.mallPrice}" readonly="readonly">
                        </div>

                    </div>
                </div>
                <!--订单信息/--> <!--工具栏-->
                <div class="box-tools text-center">
                    <button type="button" class="btn bg-default"
                            onclick="history.back(-1);">返回
                    </button>
                </div>
                </c:if>
                <%--详情--%>
                <!--工具栏/-->
            </section>
            <!-- 正文区域 /-->
        </form>
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


<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>
<script>
    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
        //
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
        $('#datepicker-a3').datetimepicker({
            format: "yyyy-mm-dd hh:ii",
            autoclose: true,
            todayBtn: true,
            language: "zh-CN"
        });
    });

    $(document).ready(function () {
        // 激活导航位置
        setSidebarActive("order-manage");
        $("#datepicker-a3").datetimepicker({
            format: "yyyy-mm-dd hh:ii",
        });
    });
    /* ========================自己添加的js============================  */
    $(document).ready(function () {
        //日期控件
        $('#dateTimePicker').datetimepicker({
            format: "yyyy/mm/dd",
            autoclose: true,
            todayBtn: true,
            language: 'zh-CN'
        });

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
        console.log(parentId + "1");
        var option;
        if (parentId != -1) {
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
        } else {
            $('#categoryName2').empty();
            option = $('<option value="${goods.categoryName}">${goods.categoryName}(当前商品二级分类名称)</option>');
            $('#categoryName2').append(option);
        }
    })
    function beforeSubmit(form){
        if(form.number.value==''){
            alert('请填写数量！');
            form.number.focus();
            return false;
        }
        if(form.name.value==''){
            alert('请填写商品名称！');
            form.name.focus();
            return false;
        }
        if(form.model.value==''){
            alert('请填写商品型号');
            form.model.focus();
            return false;
        }
        if(form.purchasePrice.value==''){
            alert('请填写购买价格');
            form.purchasePrice.focus();
            return false;
        }
        if(form.marketPrice.value==''){
            alert('请填写市场价格');
            form.marketPrice.focus();
            return false;
        }
        if(form.mallPrice.value==''){
            alert('请填写商城价格');
            form.mallPrice.focus();
            return false;
        }
        return true;
    }

</script>


</body>

</html>