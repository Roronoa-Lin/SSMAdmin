<#include '/'+layoutName>
<@html>
      <div class="row">
        <div class="col-12">
          <div class="card">
            <div class="card-header">
              <h3 class="card-title">用户列表</h3>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              <div style="width: 100px;margin-bottom: 15px"><button type="button"  id="adduser" class="btn btn-block btn-primary">新增</button></div>
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>ID</th>
                  <th>邮箱</th>
                  <th>密码</th>
                  <th>姓名</th>
                </tr>
                </thead>
                <tbody>
                <#list data as item>
                  <tr>
                    <td>${item.id}</td>
                    <td>${item.mail}</td>
                    <td>${item.password}</td>
                    <td>${item.name}</td>
                  </tr>
                </#list>
                </tbody>
                <tfoot>
                </tfoot>
              </table>
            </div>
          </div>
        </div>
      </div>
  <div class="card card-primary" style="position:fixed;top: 20%;left:250px;right:0px;width: 35%;margin-left:auto;margin-right:auto;display: none  ">
    <div class="card-header">
      <h3 class="card-title" id="adduser">新增用户</h3>
    </div>
    <!-- /.card-header -->
    <!-- form start -->
    <form role="form" action="/adduser">
      <div class="card-body">
        <div class="form-group">
          <label for="exampleInputEmail1">邮箱</label>
          <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
        </div>
        <div class="form-group">
          <label>昵称</label>
          <input type="text" name="name" class="form-control">
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">密码</label>
          <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>
        <div class="form-group">
          <label for="exampleInputFile">文件</label>
          <div class="input-group">
            <div class="custom-file">
              <input type="file" class="custom-file-input" id="exampleInputFile">
              <label class="custom-file-label" for="exampleInputFile">点击从本地选择文件</label>
            </div>
            <div class="input-group-append">
              <span class="input-group-text" id="">上传</span>
            </div>
          </div>
        </div>
        <div class="form-check">
          <input type="checkbox" class="form-check-input" id="exampleCheck1">
          <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
      </div>
      <!-- /.card-body -->

      <div class="card-footer">
        <button type="submit" id="adduser"class="btn btn-primary">保存</button>
      </div>
    </form>
  </div>
</@html>