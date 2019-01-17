<#macro html>
<!DOCTYPE html>
<html>
<#include 'head.ftl'>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

    <!-- 页眉 -->
    <#include 'navbar.ftl'>

    <!-- 主侧边栏 -->
    <#include 'sidebar.ftl'>

    <div class="content-wrapper">
        <!-- 主内容区域头部 -->
        <#include 'c-header.ftl'>
        <!-- 主内容区域 -->
        <section class="content">
            <#nested />
        </section>
    </div>
    <!-- 页脚 -->
    <#include 'footer.ftl'>
    <!-- 控制侧栏 -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
</div>
<!-- 引入 -->
<#include 'include.ftl'>
</body>
</html>
</#macro>