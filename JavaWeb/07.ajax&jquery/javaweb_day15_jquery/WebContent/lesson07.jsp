<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		/* 知识点一、append添加的是子标签 */
		$('#btn1').click(function() {
			$('ul').append('<li>JS从入门到精通</li>');
		});
		$('#btn2').click(function() {
			$('ul').prepend('<li>H5从入门到精通</li>');
		});
		
		/* 知识点二、ul>li子标签的前面和后面添加元素 */
		$('#btn3').click(function() {
			$('li').eq(2).after('<li>Oracle从入门到精通</li>');
		});
		
		$('#btn4').click(function() {
			$('li').eq(2).before('<li>SVN从入门到精通</li>');
		});
		
		/* 知识点三、删除li的最后一个标签 */
		$('#btn5').click(function() {
			$('li').last().remove();
		});
		
		/* 知识点四、从被先元素中删除子元素 */
		$('#btn6').click(function() {
			$('ul').empty();
		});
		
		/* 知识点五、表单的值设置和获取 */
		$('#btn7').click(function() {
			alert($('#username').val());
		});
		$('#btn8').click(function() {
			$('#username').val('郭永峰');
		});
		
		/* 知识点六、表单的属性设置和获取 */
		$('#btn9').click(function() {
			alert($('#username').attr('placeholder'));
		});
		$('#btn10').click(function() {
			$('#username').attr('placeholder','please input your name');
			
			/* 知识点七、标签的内容设置和获取 */
			$('span').html('薛之千');//设置
			console.log($('span').html());//取内容
		});
	});
</script>
</head>
<body>
<button id="btn1">1在被选元素的结尾插入内容</button>
<button id="btn2">2在被选元素的开头插入内容</button>
<button id="btn3">3在被选元素之后插入内容</button>
<button id="btn4">4在被选元素之前插入内容</button>
<button id="btn5">5删除被选元素（及其子元素）</button>
<button id="btn6">6从被选元素中删除子元素</button><br>
<button id="btn7">7获取html标签的内容</button>
<button id="btn8">8设置html标签的内容</button>
<button id="btn9">9获取html标签属性的内容</button>
<button id="btn10">10设置html标签属性的内容</button><br>
java开发工程师课程内容<br>
<ul>
	<li>Java基础从入门到精通</li>
	<li>JavaWeb从入门到精通</li>
	<li>J2EE框架从入门到精通</li>
	<li>MySql数据库从入门到精通</li>
</ul>
<p></p>
<input id="username" name="uesrname" placeholder="请输入用户名" value="">
<span>什么鬼，全部垮掉</span>
</body>
</html>