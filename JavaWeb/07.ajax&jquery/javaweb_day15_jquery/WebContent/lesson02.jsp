<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	/* css的id选择器 */
	#div1{
		width: 100px;
		height: 100px;
		background-color: red;
	}	
</style>
<!-- 1、 ./代表当前目录 ../代表上级目录  -->
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		//jquery的id选择器和点击事件
		$('#btn1').click(function() {
			/* 改变宽高 */
			$('#div1').width(200);
			$('#div1').height(200);
		});
	});
	
</script>
<title>jquery的导入</title>
</head>
<body>
<div id="div1"></div>
<button id="btn1">点击我放大</button>
</body>
</html>