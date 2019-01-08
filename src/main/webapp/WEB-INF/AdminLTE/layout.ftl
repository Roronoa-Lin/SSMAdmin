<#macro html>
    <!DOCTYPE html>
    <html>
    <#include 'head.ftl'>
    <body class="hold-transition skin-blue sidebar-mini">
    <div class="wrapper">
        <!-- 头部 -->
        <#include 'header.ftl'>
        <!-- 侧边栏主体 -->
        <#include 'main-sidebar.ftl'>

        <!-- 内容区 -->
        <div class="content-wrapper">
            <!-- 内容区头部 -->
            <section class="content-header">
                <h1>
                    Dashboard
                    <small>Control panel</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                    <li class="active">Dashboard</li>
                </ol>
            </section>

            <!-- 内容主体区 -->
                <div id="pjax-container">
                <#--pjax-->
                <#nested />
                </div>
        </div>
        <!-- 页脚 -->
        <#include 'footer.ftl'>

        <!-- 侧边栏控制 -->
        <#include 'sidebar.ftl'>
        <!-- /.control-sidebar -->
        <!-- 侧边栏背景 -->
        <div class="control-sidebar-bg"></div>
    </div>
    <#include 'includefile.ftl'>
    </body>
    </html>
</#macro>