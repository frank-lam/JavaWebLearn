<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	//--------json字符串转对象----------------
	console.log('--------json字符串转对象');
	//json字符串
	var str1 = '{"firstName":"yongfeng","lastName":"guo"}';
	console.log(str1);
	
	//json字符串转成json对象，方便操作
	var jsonObj1 = JSON.parse(str1);
	console.log(jsonObj1);
	
	//--------json对象转字符串----------------
	console.log('--------json对象转字符串');
	//创建一个json对象
	var jsonObj2 = {firstName:"禅",lastName:"貂"};
	console.log(jsonObj2);
	
	//json对象转字符串【stringify方法是小写的】
	var str2 = JSON.stringify(jsonObj2)
	console.log(str2);
	
	//----------遍历数组json字符串----------
	console.log("--------遍历数组json字符串");
	var str3 = '[{ "firstName":"Bill" , "lastName":"Gates" },{ "firstName":"George" , "lastName":"Bush" },{ "firstName":"Thomas" , "lastName":"Carter" }]';
	var jsonArr = JSON.parse(str3);
	for(var i=0;i<jsonArr.length;i++){
		var item = jsonArr[i];
		console.log(item.lastName + ' ' + item.firstName);
	}
</script>
</body>
</html>