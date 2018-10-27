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
		
		//��֤��
		UserForm uf = new UserForm();
		try {
			BeanUtils.populate(uf, request.getParameterMap());
			if(uf.validate()){
				//���Ϸ�������ע��ҳ��
				request.setAttribute("uf", uf);
				request.getRequestDispatcher("/register.jsp").forward(request, response);
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//ע��
		try {
			User user = new User();
			//�Ѳ���ת��JavaBean
			BeanUtils.populate(user, request.getParameterMap());
			if(userService.userExsit(user) != null){//�����Ƿ����ͬ�����û�
				uf.getErr().put("username", "�û��Ѿ�������");
				request.setAttribute("uf", uf);
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}else{
				//��������
				userService.register(user);
				//ע��ɹ�
				response.getWriter().write("ע��ɹ���3���ת����ҳ������¼");
				response.setHeader("refresh", "3;url=" + request.getContextPath()
				+ "/index.jsp");
			}
		}catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			response.getWriter().write("ע��ʧ�ܣ�" + e.getMessage());
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		// TODO Auto-generated method stub
		User user = new User();
		try {
			//��BeanUtilsע��һ������ת����
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
			ConvertUtils.register(new DateLocaleConverter(), Date.class);//��ͬ�������
			//�Ѳ���ת��JavaBean
			BeanUtils.populate(user, request.getParameterMap());
			
			//��������
			userService.register(user);
			
			//ע��ɹ�
			response.getWriter().write("ע��ɹ���3���ת����ҳ������¼");
			response.setHeader("refresh", "3;url=" + request.getContextPath()
			+ "/index.jsp");
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			response.getWriter().write("ע��ʧ�ܣ�" + e.getMessage());
		}
	}
}
