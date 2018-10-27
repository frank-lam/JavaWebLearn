<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-ui/external/jquery/jquery.js"></script>
<!-- 在html中导入jquery的 js和css文件 -->
<link href="./js/jquery-ui/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="./js/jquery-ui/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		//$("#dialog").dialog();
		var params = {buttons:[
								{text : '喜欢',
								 click: function() {
									 $(this).dialog("close");
										}
								}
					 ]};
		
		//隐藏dialoa窗口
		$("#dialog").dialog(params);
		$("#dialog").dialog("close");
		
		//监听点击事件
		$("button").click(function() {
			$("#dialog").dialog(params);
		});
	});
</script>
</head>
<body>
<div id="dialog" title="这是对话框" style="">
	<p>你爱Java吗？</p>
</div>
<button>点击我</button>
</body>
</html>