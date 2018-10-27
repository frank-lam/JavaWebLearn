<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	/* css的id选择器 */
	#div1{width: 100px;height: 100px;background-color: red;}
	
	#div2{width: 100px;height: 100px;background-color: blue;
	}	
</style>
<!-- 1、 ./代表当前目录 ../代表上级目录  -->
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		console.log('xxx');
		/* 元素+id选择器 */
		$('span#s1').css('background-color','red');
		/* 元素+类选择器 */
		$('span.s2').css('background-color','yellow');
		
		/* 元素+元素选择器 */
		$('div p').css('background-color','gray');
		
		/* 元素+元素+类选择器 */
		$('div p.p2').css('background-color','black');
	});
	
</script>
</head>
<body>
<div id="div">
	<span id='s1'>AA</span>
	<span class='s2'>BB</span>
</div>

<div id="div2">
	<p>段落1</p>
	<p class='p2'>段落2</p>
	<p>段落3</p>
</div>
</body>
</html>