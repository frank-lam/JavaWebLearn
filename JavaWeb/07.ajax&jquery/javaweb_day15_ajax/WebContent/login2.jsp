<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function postlogin() {
		//1.获取表单的值
		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;
		var params = 'username=' + username + '&password=' + password;
		console.log(params);
		
		//2.创建XMLHttpRequest对象
		var request = new XMLHttpRequest();
		
		//3.发送请求,把请求参数放在send方法中
		request.open('post','${pageContext.request.contextPath}/LoginServlet');
		//设置请求头,一定要设置请求头
        request.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		request.send(params);
		
		//4.监听准备状态的改变
		request.onreadystatechange = function(){
			console.log(request.readyState + ' - ' + request.status);
			if(request.readyState == 4 && request.status == 200){
				var rspTxt = request.responseText;
				console.log('服务器响应：' + rspTxt);
				if(rspTxt == 'success'){
					alert('登录成功');
				}else{
					alert('登录失败');
				}
			}
		}
	}
</script>
<title>登录</title>
</head>
<body>
<form action="" method="post">
	<table border="1">
		<tr>
			<td colspan="2" align="center">POST的登录请求，使用ajax实现</td>
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
				<input type="button" value="登录" onclick="postlogin();">
			</td>
		</tr>
	</table>
</form>
</body>
</html>