<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		/* 排除show的标签，其它同级标签生效css */
		//$('.show').siblings().css('background-color','red');
	
		/* 获取父标签 */
		//$('.show').parent().css('background-color','blue');
		
		/* 获取子标签 */
		$('ul').children(':odd').css('background-color','blue');
	});
</script>
</head>
<body>
<ul>
	<li >Java基础从入门到精通</li>
	<li>JavaWeb从入门到精通</li>
	<li class='show'>J2EE框架从入门到精通</li>
	<li>MySql数据库从入门到精通</li>
</ul>
</body>
</html>