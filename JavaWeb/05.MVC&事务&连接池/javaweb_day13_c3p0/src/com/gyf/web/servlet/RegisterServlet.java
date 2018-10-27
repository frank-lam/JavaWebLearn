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
import com.gyf.domain.UserForm;
import com.gyf.exception.UserException;
import com.gyf.service.IUserService;
import com.gyf.service.impl.UserServiceImpl;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{

	IUserService userService = new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		
		//验证表单
		UserForm uf = new UserForm();
		try {
			BeanUtils.populate(uf, request.getParameterMap());
			if(uf.validate()){
				//不合法，跳回注册页面
				request.setAttribute("uf", uf);
				request.getRequestDispatcher("/register.jsp").forward(request, response);
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//注册
		try {
			User user = new User();
			//把参数转成JavaBean
			BeanUtils.populate(user, request.getParameterMap());
			if(userService.userExsit(user) != null){//检验是否存在同名的用户
				uf.getErr().put("username", "用户已经存在了");
				request.setAttribute("uf", uf);
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}else{
				//插入数据
				userService.register(user);
				//注册成功
				response.getWriter().write("注册成功，3秒后转回主页，请点登录");
				response.setHeader("refresh", "3;url=" + request.getContextPath()
				+ "/index.jsp");
			}
		}catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			response.getWriter().write("注册失败，" + e.getMessage());
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		// TODO Auto-generated method stub
		User user = new User();
		try {
			//给BeanUtils注册一个日期转换器
			/*ConvertUtils.register(new Converter() {
				@Override
				public Object convert(Class type, Object value) {
					// TODO Auto-generated method stub
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String birthday = (String)value;
					Date date = null;
					try {
						date = sdf.parse(birthday);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return date;
				}
			}, Date.class);*/
			ConvertUtils.register(new DateLocaleConverter(), Date.class);//等同于上面的
			//把参数转成JavaBean
			BeanUtils.populate(user, request.getParameterMap());
			
			//插入数据
			userService.register(user);
			
			//注册成功
			response.getWriter().write("注册成功，3秒后转回主页，请点登录");
			response.setHeader("refresh", "3;url=" + request.getContextPath()
			+ "/index.jsp");
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			response.getWriter().write("注册失败，" + e.getMessage());
		}
	}
}
