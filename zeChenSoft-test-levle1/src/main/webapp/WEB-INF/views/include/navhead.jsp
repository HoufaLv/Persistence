
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 顶部导航栏部分 -->
<header class="main-header">
    <!-- Logo -->
    <a href="/test/home" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>上机题</b></span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>泽辰软件上机题</b></span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="/test/static/dist/img/default-avatar.png" class="user-image" alt="User Image">
                        <span class="hidden-xs"><shiro:principal property="accountName"/></span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="/test/static/dist/img/default-avatar.png" class="img-circle" alt="User Image">

                        </li>
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-right">
                                <a href="/test/home/logout" class="btn btn-default btn-flat">安全退出</a>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>