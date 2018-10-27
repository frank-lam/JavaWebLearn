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

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.设置请求参数编码
		request.setCharacterEncoding("UTF-8");
		//2.封装请求参数
		Book book = new Book();
		try {
			BeanUtils.populate(book, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("接收到更新的请求参数：" + book);
		
		//3.更新
		BookServiceImpl bookService = new BookServiceImpl();
		bookService.updateBook(book);
		
		//4.跳转
		List<Book> list = bookService.findAllBooks();
		request.setAttribute("bookList", list);
		request.getRequestDispatcher("/admin/products/list.jsp").forward(request, response);
	}
}
