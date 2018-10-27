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
      <script type="text/javascript">
          function addFile(){
              //得到div容器
              var div1 = document.getElementById("div1");
              div1.innerHTML +=  "<div><input type='file' name='photo' /><input type='button' value='删除' onclick='delFile(this)'/><br /></div>";
          }

          function delFile(input){
              //使用input对象的爷爷删除他的爸爸
              input.parentNode.parentNode.removeChild(input.parentNode);
          }
      </script>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/UploadServlet"  method="post" enctype="multipart/form-data">
        用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
        密码：<input type="password" name="password" placeholder="请输入密码"><br>
        <div id="div1">
            <div>
                <input type="file" name="photo" /><input type="button" value="添加" onclick="addFile()"/><br />
            </div>
        </div>
        <input type="submit" value="提交">
    </form>

  </body>
</html>
