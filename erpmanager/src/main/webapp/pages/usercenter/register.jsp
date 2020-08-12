<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>天翼 进销存系统 | register</title>


    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- Theme style -->
    <!-- iCheck -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="../../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../../plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition register-page" style="background-image: url('/img/registerbj.jpg')">
<div class="register-box">
    <div class="register-logo" style="margin-top: 40px">
        <h3>天翼进销存系统</h3>
    </div>


<%--    <div class="alert alert-info alert-dismissible">--%>
<%--        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>--%>
<%--        <h4><i class="icon fa fa-info"></i> Alert!</h4>--%>
<%--        Info alert preview. This alert is dismissable.--%>
<%--    </div>--%>

    <div class="register-box-body">
        <div>
            <p style="text-align: left">我有账号，现在就去<a href="login.jsp" style="color: blue">登录</a></p>
        </div>

        <form action="a${pageContext.request.contextPath}/register" method="post" name="form" onSubmit="return beforeSubmit(this);">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" data-toggle="tooltip"
                       data-placement="top" title="顶部的 Tooltip" id="nickName" name="nickName" placeholder="昵称">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>

            </div>
            <div class="form-group has-feedback">
                <input type="email" class="form-control" id="username" name="username" placeholder="Email">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" data-toggle="tooltip"
                       data-placement="top" title="顶部的 Tooltip" id="password" name="password" placeholder="密码">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" id="confirmPwd" placeholder="确认密码">
                <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox"> 我同意 <a href="#">协议</a>
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat" style="border-radius: 12px">注册</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <div class="social-auth-links text-center">
            <p>- 或者 -</p>
            <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-qq"></i> 腾讯QQ用户注册</a>
            <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-weixin"></i> 微信用户注册</a>
        </div>
    </div>
    <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<!-- Bootstrap 3.3.6 -->
<!-- iCheck -->
<script src="../../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../../plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });

    //提示框
    $(function () { $("[data-toggle='tooltip']").tooltip(); });

    function beforeSubmit(form) {
        if (form.nickName.value == '') {
            alert('昵称不能为空！');
            form.nickName.focus();
            return false;
        }
        if (form.username.value == '') {
            alert('注册Email账号不能为空！');
            form.username.focus();
            return false;
        }
        if (form.password.value == '') {
            alert('密码不能为空');
            form.password.focus();
            return false;
        }
        return confirmName(document.getElementById('nickName').value)
            && confirmEmail(document.getElementById('username').value)
            && confirmPassword(document.getElementById('password').value);
    }

    // 确认用户昵称
    function confirmName() {
        // TODO
    }

    // 确认用户名
    function confirmEmail(str) {
        // TODO
    };

    // 确认用户密码
    function confirmPassword(str) {
        // TODO
    }
</script>
</body>

<style type="text/css">

    .register-box {
        height: 554px;
        margin-top: -277px;
        position: absolute;
        right: 139px;
        top: 50%;
        width: 480px;
        background: rgba(255,255,255,0.8);
        border-radius: 12px;
        overflow: hidden;
    }

    .register-box-body {
        background: rgba(255,255,255,0);
    }
</style>

</html>