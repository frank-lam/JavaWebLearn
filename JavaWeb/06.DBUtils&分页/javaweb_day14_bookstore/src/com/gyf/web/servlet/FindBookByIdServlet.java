package com.gyf.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.gyf.dao.BookDaoImpl;
import com.gyf.domain.Book;
import com.gyf.service.BookServiceImpl;

@WebServlet("/FindBookByIdServlet")
public class FindBookByIdServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取ID
		String id = request.getParameter("id");
		
		//根据ID查询书
		BookServiceImpl bookService = new BookServiceImpl();
		Book book = bookService.findBookById(id);
		request.setAttribute("book", book);
	
		//跳转到页面
		request.getRequestDispatcher("/admin/products/edit.jsp").forward(request, response);
		
	}
}
