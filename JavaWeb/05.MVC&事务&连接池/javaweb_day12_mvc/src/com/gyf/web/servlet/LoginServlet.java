package com.gyf.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import com.gyf.domain.User;
import com.gyf.exception.UserException;
import com.gyf.service.IUserService;
import com.gyf.service.impl.UserServiceImpl;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	IUserService userService = new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//User user = userService.login(username, password);
		User pageUser = new User(username, password, null, null);
		User user;
		try {
			user = userService.login(pageUser);
			request.getSession().setAttribute("loginUsername", user.getUsername());
			response.getWriter().write("登录成功，3秒后进入主页");
			response.setHeader("refresh", "3;url=" + request.getContextPath()
			+ "/main.jsp");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("exception", e);
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
			
	}
}
