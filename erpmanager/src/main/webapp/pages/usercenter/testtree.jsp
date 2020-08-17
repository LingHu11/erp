<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>基本演示</legend>
</fieldset>
<div class="layui-btn-container">
    <button type="button" class="layui-btn layui-btn-sm" lay-demo="getChecked">确认选中权限</button>
    <button type="button" class="layui-btn layui-btn-sm" lay-demo="reload">重载实例</button>
<%--
    <button type="button" class="layui-btn layui-btn-sm" lay-demo="setChecked">勾选指定节点</button>
--%>

</div>

<div id="test12" class="demo-tree-more"></div>

<div id="test5" class="demo-tree"></div>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>开启复选框</legend>
</fieldset>

<script src="../../plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use([ 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider','tree'], function () {
        var $ = layui.jquery
            , layer = layui.layer //弹层
        var tree = layui.tree
            , util = layui.util;

            $.ajax({
                url: "${pageContext.request.contextPath}/rolepmn/tree",     //接口返回的梯归数据方法
                type: "get",
                dataType: "json",
                success: function (data) {
                    //基本演示
                    console.log(data);
                    tree.render({
                        elem: '#test12'
                        , data: data
                        , showCheckbox: true  //是否显示复选框
                        , id: 'demoId1'
                        , isJump: true //是否允许点击节点时弹出新窗口跳转
                        // , click: function (obj) {
                        //     var data = obj.data;  //获取当前点击的节点数据
                        //     layer.msg('状态：' + obj.state + '<br>节点数据：' + JSON.stringify(data));
                        // }
                    });

                    //按钮事件
                    util.event('lay-demo', {
                        getChecked: function (othis) {
                            var checkedData = tree.getChecked('demoId1'); //获取选中节点的数据
                            // layer.alert(JSON.stringify(checkedData), {shade: 0});
                            // console.log(checkedData);

                            var list = new Array();
                            list = getChecked_list(checkedData);

                            console.log(list);
                            alert(list);
                            location.href="${pageContext.request.contextPath}/rolepmn/addpmn?ids="+list;
                        }
                        , reload: function () {
                            //重载实例
                            tree.reload('demoId1', {});
                        }
                        // , setChecked: function () {
                        //     tree.setChecked('demoId1', [12, 16]); //勾选指定节点
                        // }
                    });

                    // 获取选中节点的id
                    function getChecked_list(data) {
                        var id = "";
                        $.each(data, function (index, item) {
                            if (id != "") {
                                id = id + "," + item.id;
                            }
                            else {
                                id = item.id;
                            }
                            var i = getChecked_list(item.children);
                            if (i != "") {
                                id = id + "," + i;
                            }
                        });
                        return id;
                    }
                }, error: function () {
                    alert("网络错误");
                }
            });
//             //模拟数据
//             ,data = [{
//                 title: '一级1'
//                 ,id: 1
// /*                ,checked: true
//                 ,spread: true*/
//                 ,children: [{
//                     title: '二级1-1 可允许跳转'
//                     ,id: 3
//                     ,children: [{
//                         title: '三级1-1-3'
//                         ,id: 23
//                         ,children: [{
//                             title: '四级1-1-3-1'
//                             ,id: 24
//                             ,children: [{
//                                 title: '五级1-1-3-1-1'
//                                 ,id: 30
//                             },{
//                                 title: '五级1-1-3-1-2'
//                                 ,id: 31
//                             }]
//                         }]
//                     },{
//                         title: '三级1-1-1'
//                         ,id: 7
//                         ,children: [{
//                             title: '四级1-1-1-1 可允许跳转'
//                             ,id: 15
//                         }]
//                     },{
//                         title: '三级1-1-2'
//                         ,id: 8
//                         ,children: [{
//                             title: '四级1-1-2-1'
//                             ,id: 32
//                         }]
//                     }]
//                 },{
//                     title: '二级1-2'
//                     ,id: 4
//                     ,children: [{
//                         title: '三级1-2-1'
//                         ,id: 9
//                     },{
//                         title: '三级1-2-2'
//                         ,id: 10
//                     }]
//                 },{
//                     title: '二级1-3'
//                     ,id: 20
//                     ,children: [{
//                         title: '三级1-3-1'
//                         ,id: 21
//                     },{
//                         title: '三级1-3-2'
//                         ,id: 22
//                     }]
//                 }]
//             },{
//                 title: '一级2'
//                 ,id: 2
//                 ,children: [{
//                     title: '二级2-1'
//                     ,id: 5
//                     ,children: [{
//                         title: '三级2-1-1'
//                         ,id: 11
//                     },{
//                         title: '三级2-1-2'
//                         ,id: 12
//                     }]
//                 },{
//                     title: '二级2-2'
//                     ,id: 6
//                     ,children: [{
//                         title: '三级2-2-1'
//                         ,id: 13
//                     },{
//                         title: '三级2-2-2'
//                         ,id: 14
//                         ,disabled: true
//                     }]
//                 }]
//             },{
//                 title: '一级3'
//                 ,id: 16
//                 ,children: [{
//                     title: '二级3-1'
//                     ,id: 17
//                     ,children: [{
//                         title: '三级3-1-1'
//                         ,id: 18
//                     },{
//                         title: '三级3-1-2'
//                         ,id: 19
//                     }]
//                 },{
//                     title: '二级3-2'
//                     ,id: 27
//                     ,children: [{
//                         title: '三级3-2-1'
//                         ,id: 28
//                     },{
//                         title: '三级3-2-2'
//                         ,id: 29
//                     }]
//                 }]
//             }]
//
//             //模拟数据2
//             ,data2 = [{
//                 title: '早餐'
//                 ,id: 1
//                 ,children: [{
//                     title: '油条'
//                     ,id: 5
//                 },{
//                     title: '包子'
//                     ,id: 6
//                 },{
//                     title: '豆浆'
//                     ,id: 7
//                 }]
//             },{
//                 title: '午餐'
//                 ,id: 2
//                 ,checked: true
//                 ,children: [{
//                     title: '藜蒿炒腊肉'
//                     ,id: 8
//                 },{
//                     title: '西湖醋鱼'
//                     ,id: 9
//                 },{
//                     title: '小白菜'
//                     ,id: 10
//                 },{
//                     title: '海带排骨汤'
//                     ,id: 11
//                 }]
//             },{
//                 title: '晚餐'
//                 ,id: 3
//                 ,children: [{
//                     title: '红烧肉'
//                     ,id: 12
//                     ,fixed: true
//                 },{
//                     title: '番茄炒蛋'
//                     ,id: 13
//                 }]
//             },{
//                 title: '夜宵'
//                 ,id: 4
//                 ,children: [{
//                     title: '小龙虾'
//                     ,id: 14
//                     ,checked: true
//                 },{
//                     title: '香辣蟹'
//                     ,id: 15
//                     ,disabled: true
//                 },{
//                     title: '烤鱿鱼'
//                     ,id: 16
//                 }]
//             }];

        /* //常规用法
         tree.render({
             elem: '#test1' //默认是点击节点可进行收缩
             ,data: data1
         });

         //无连接线风格
         tree.render({
             elem: '#test13'
             ,data: data1
             ,showLine: false  //是否开启连接线
         });

         //仅节点左侧图标控制收缩
         tree.render({
             elem: '#test2'
             ,data: data1
             ,onlyIconControl: true  //是否仅允许节点左侧图标控制展开收缩
             ,click: function(obj){
                 layer.msg(JSON.stringify(obj.data));
             }
         });
         //手风琴模式
         tree.render({
             elem: '#test4'
             ,data: [{
                 title: '优秀'
                 ,children: [{
                     title: '80 ~ 90'
                 },{
                     title: '90 ~ 100'
                 }]
             },{
                 title: '良好'
                 ,children: [{
                     title: '70 ~ 80'
                 },{
                     title: '60 ~ 70'
                 }]
             },{
                 title: '要努力奥'
                 ,children: [{
                     title: '0 ~ 60'
                 }]
             }]
             ,accordion: true
         });

         //点击节点新窗口跳转
         tree.render({
             elem: '#test5'
             ,data: data
             ,isJump: true  //link 为参数匹配
         });

         //开启复选框
         tree.render({
             elem: '#test7'
             ,data: data2
             ,showCheckbox: true
         });

         //开启节点操作图标
         tree.render({
             elem: '#test9'
             ,data: data1
             ,edit: ['add', 'update', 'del'] //操作节点的图标
             ,click: function(obj){
                 layer.msg(JSON.stringify(obj.data));
             }
         });*/
    });
</script>

</body>
</html>