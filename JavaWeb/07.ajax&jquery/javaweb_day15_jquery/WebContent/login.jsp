<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		//1.监听按钮点击事件
		$('#loginBtn').click(function () {
			//2.获取参数值
			var username = $('#username').val();
			var password = $('#password').val();
			
			//3.url
			var url = '${pageContext.request.contextPath}/LoginServlet'
			
			//4.默认是json对象处理
			 $.post(url,$('#loginForm').serialize(),function(data){
				//如果是json对象，直接获取属性，如果是字符串，要转成json对象再处理
				console.log(data);
			},'text'); 
		});
	})
</script>
<title>登录</title>
</head>
<body>
<form action="" method="get" id="loginForm">
	<table border="1">
		<tr>
			<td colspan="2" align="center">GET的登录请求，使用jquery实现</td>
		</tr>
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="username" id="username"/></td>
		</tr>
		<tr>
			<td>密码名:</td>
			<td><input type="text" name="password" id="password"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="登录" id="loginBtn">
			</td>
		</tr>
	</table>
</form>
</body>
</html>