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
                    <li id="user-manager">${pageContext.request.contextPath}
                        <a href="#"> <i
                                class="fa fa-circle-o"></i><span>商品管理</span> <span class="pull-right-container"><i
                                class="fa fa-angle-left pull-right"></i> </span> </a>
                        <ul class="treeview-menu" style="padding-left: 20px">
                            <li id="">
                                <a href="${pageContext.request.contextPath}/goods/findAll?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i> <span>商品管理</span></a>
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
                        <a href="${pageContext.request.contextPath}/goodstocompli/findAll?page=1&size=4"> <i
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
                <span>B2C销售管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li id="sale-order">
                        <a href="${pageContext.request.contextPath}/book/findAll.do">
                            <i class="fa fa-circle-o"></i>
                            <span>B2C销售订单管理</span>
                            <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                        </a>

                        <ul class="treeview-menu" style="padding-left: 20px">
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>B2C销售订单查询</span> </a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>B2C网店订单管理</span> </a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>B2C销售出库管理</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>B2C销售出库单记录</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>B2C销售退货管理</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>B2C销售退货单记录</span></a>
                            </li>
                        </ul>

                    </li>
                    <li id="sale-check">
                        <a href="${pageContext.request.contextPath}/book/findAll.do">
                            <i class="fa fa-circle-o"></i>
                            <span>对账管理</span>
                            <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                        </a>

                        <ul class="treeview-menu" style="padding-left: 20px">
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>中邮订单查询</span> </a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>中邮EMS对账</span> </a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>中邮EMS对账记录</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>中邮EMS对账记录审核</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>中邮平账单</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>当当订单查询</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>当当对账</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>当当对账记录</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>当当对账记录审核</span></a>
                            </li>
                            <li id="">
                                <a href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=4"> <i
                                        class="fa fa-circle-o"></i><span>当当平账单</span></a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <%--销售管理结束--%>
            <%--售后开始--%>

            <%--售后结束--%>
            <%--权限开始--%>

            <%--权限结束--%>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>