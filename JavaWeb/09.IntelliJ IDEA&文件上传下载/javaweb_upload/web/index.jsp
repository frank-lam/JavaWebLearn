<%--
  Created by IntelliJ IDEA.
  User: gyf
  Date: 2018/1/7
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>文件上传</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/UploadServlet"  method="post" enctype="multipart/form-data">
        用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
        密码：<input type="password" name="password" placeholder="请输入密码"><br>
        文件1:<input type="file" name="file"><br>
        文件2:<input type="file" name="file"><br>
        文件3:<input type="file" name="file"><br>
        <input type="submit" value="提交">
    </form>

  </body>
</html>
