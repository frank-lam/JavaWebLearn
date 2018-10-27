package com.gyf.web.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//1.设置响应方式，以前是设置text/html,现在设置成json
		response.setContentType("text/json;charset=utf-8");
		
		//2.或者客户端的请求参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("接收到浏览器提交的数据：" + username + ":" + password);
		
		//3.使用map封装json数据
		ObjectMapper mapper = new ObjectMapper();
		Map<String,String> map = new HashMap<String,String>();
		
		//4.判断是否登录成功【以后是通过dao来判断用户是否登录成功，这里讲案例，先写死】
		if("gyf".equals(username) && "520".equals(password)){
			map.put("success", "1");
			map.put("message", "");
		}else{
			map.put("success", "0");
			map.put("message", "用户名或者密码不对");
		}
		
		//5.响应客户端面
		response.getWriter().print(mapper.writeValueAsString(map));
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("接收到浏览器提交的数据：" + username + ":" + password);
		
		if("gyf".equals(username) && "520".equals(password)){
			response.getWriter().print("success");
		}else{
			response.getWriter().print("failure");
		}
		
	}
}
