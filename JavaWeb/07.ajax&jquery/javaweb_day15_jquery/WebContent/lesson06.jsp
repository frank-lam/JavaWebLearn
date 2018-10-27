<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		//第一种方式控制css
		/* $('div').css('width',200);
		$('div').css('height',200);
		$('div').css('background-color','yellow'); */
		
		//第二种方式控制css,这种方式更简便
		$('div').css({'width':200,'height':200,'background-color':'red'});
	});
	
</script>
</head>
<body>
<div id="div">
</div>

</body>
</html>