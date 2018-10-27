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

import com.gyf.domain.Book;
import com.gyf.service.BookServiceImpl;

@WebServlet("/SearchBookServlet")
public class SearchBookServlet extends HttpServlet{
	/**
	 * 这里只写POST请求的方法即可
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.设置请求参数编码
		request.setCharacterEncoding("UTF-8");
		
		//2.获取搜索的请求参数
		String id = request.getParameter("id");
		String category = request.getParameter("category");
		String name = request.getParameter("name");
		String minprice = request.getParameter("minprice");
		String maxprice = request.getParameter("maxprice");
		
		//3.条件搜索
		BookServiceImpl bookService = new BookServiceImpl();
		List<Book> list = bookService.findBookByCondition(id,name,category,minprice,maxprice);
		
		//4.跳转
		request.setAttribute("bookList", list);
		request.getRequestDispatcher("/admin/products/list.jsp").forward(request, response);
		
	}
}
