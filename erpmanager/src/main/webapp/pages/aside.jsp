<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                     class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>
                    用户名可用security取
                </p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>
            <%--商品与赠品开始--%>
            <li id="admin-index"><a href="${pageContext.request.contextPath}/pages/main.jsp"><i
                    class="fa fa-dashboard"></i> <span>电子商务进销售存系统</span></a></li>
            <li class="treeview">
                <a href="#"> <i class="fa fa-cube"></i><span>商品与赠品管理</span> <span class="pull-right-container"><i
                        class="fa fa-angle-left pull-right"></i> </span> </a>
                <ul class="treeview-menu" style="padding-left: 20px">
                    <li id="user-manager">
                        <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                class="fa fa-circle-o"></i><span>商品管理</span> <span class="pull-right-container"><i
                                class="fa fa-angle-left pull-right"></i> </span> </a>
                        <ul class="treeview-menu" style="padding-left: 20px">
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4">
                                    <span>产品查询</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>商品品牌管理</span> </a>
                                <%--如需要再添加层级就继续嵌套treeview-menu
                                配合这个变化的箭头<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i> </span>
                                --%>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>商品类型管理</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>供应商管理</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>价格调整管理</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>价格调整审核</span></a>
                            </li>
                        </ul>

                    </li>
                    <li id="role-manager">
                        <a href="${pageContext.request.contextPath}/role/findAll.do?page=1&size=4"> <i
                                class="fa fa-circle-o"></i> 赠品管理 </a>
                    </li>
                    <li id="permission-setting">
                        <a href="${pageContext.request.contextPath}/permission/findAll.do?page=1&size=4"> <i
                                class="fa fa-circle-o"></i> 活动商品管理 </a>
                    </li>
                </ul>
            </li>
            <%--商品与赠品结束--%>
            <%--销售管理开始--%>
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>图书管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/book/findAll.do">
                        <i class="fa fa-circle-o"></i> 图书列表
                    </a></li>
                </ul>
            </li>
            <%--销售管理结束--%>
            <%--售后开始--%>
            <li class="treeview"><a href="#">
                <i class="fa fa-cube"> </i>
                <span>渠道版本</span> <span class="pull-right-container">
                    <i class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li id="channel-setting">
                        <a href="${pageContext.request.contextPath}/channel/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"> </i> 渠道管理
                        </a>
                    </li>

                    <li id="channel-type-setting">
                        <a href="${pageContext.request.contextPath}/channelType/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 渠道分类管理
                        </a>
                    </li>
                </ul>
            </li>
            <%--售后结束--%>
            <%--权限开始--%>
                <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                    <span>游戏管理</span> <span class="pull-right-container"> <i
                            class="fa fa-angle-left pull-right"></i>
				</span>
                </a>
                    <ul class="treeview-menu">

                        <li id="gamelist-setting"><a
                                href="${pageContext.request.contextPath}/game/findAll.do?page=1&size=4">
                            <i class="fa fa-circle-o"></i> 游戏列表
                        </a></li>
                        <li id="gameadd-setting"><a
                                href="${pageContext.request.contextPath}/game/getType.do"> <i
                                class="fa fa-circle-o"></i> 游戏添加
                        </a></li>

                    </ul>
                </li>
            <%--权限结束--%>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>