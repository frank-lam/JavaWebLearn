<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var urlStr = 'LoginServlet?username=张三丰&password=123';
	//1.对字符串进行url编码,会对一些特殊字符串,比如中文,:,&,?号进行编码
	var u1 = encodeURIComponent(urlStr);
	var u2 = encodeURI(urlStr)
	console.log(u1);
	console.log(u2);
	
	
	//2.对url进行解码,还原原始模样
	console.log(decodeURIComponent(u1));
	console.log(decodeURIComponent(u2));
</script>
</head>
<body>

</body>
</html>