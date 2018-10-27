<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 1、 ./代表当前目录 ../代表上级目录  -->
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	//js的监听文档加载完成方法   
	window.onload = function(){
		document.getElementById('div1').innerHTML = 'DIV1';
	};
	
	/*2、 下面这是固定写法，相当于window.onload = function(){}
	   也就是页面加载完后调用
	*/
	$(function() {
		document.getElementById('div2').innerHTML = 'DIV2';
		//alert('页面加载完了');
	});
	 
	//jquery的另一种监听文档加载完成方法，一般推荐使用前面一种
	$(document).ready(function() {
		document.getElementById('div3').innerHTML = 'DIV3';
	});
</script>
<title>jquery的导入</title>
</head>
<body>
<div id="div1"></div>
<div id="div2"></div>
<div id="div3"></div>
</body>
</html>