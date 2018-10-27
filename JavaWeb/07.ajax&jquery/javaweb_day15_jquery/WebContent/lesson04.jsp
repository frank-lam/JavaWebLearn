<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		//属性选择器
		//$('[src]').css("border-style","solid");//添加边框实线
		
		//指定属性值的元素
		$('[src="./image/002.jpg"]').css("border-style","solid");
		
		//属性值以png结尾的元素
		//$('[src$=".png"]').css("border-style","solid");
	});
	
</script>
</head>
<body>
<div id="div">
	<img alt="" width="200px" height="200px" src="./image/001.jpg">
	<img alt="" width="200px" height="200px" src="./image/002.jpg">
	<img alt="" width="200px" height="200px" src="./image/003.png">
	<div style="width: 200px;height: 200px;background: red;"></div>
</div>
</body>
</html>