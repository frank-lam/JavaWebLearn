package com.gyf.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyf.domain.Book;
import com.gyf.domain.PageResult;
import com.gyf.service.BookServiceImpl;

@WebServlet("/BookListServlet")
public class BookListServlet extends HttpServlet{
	/**
	 * 这里只写GET请求的方法即可
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BookServiceImpl bookService = new BookServiceImpl();
		
		//获取页码
		String page = request.getParameter("page");
		if(page == null  || "".equals(page)){
			page = "1";
		}
		
		//分页查询所有数据
		PageResult<Book> pageResult = bookService.findBooksWithPageCount(Integer.parseInt(page));
		System.out.println(pageResult);
		if(pageResult != null){
			request.setAttribute("pageResult", pageResult);
			//list2页面是复制一份用于测试分页效果
			request.getRequestDispatcher("/admin/products/list2.jsp").forward(request, response);
		}
	}
	
	/**
	 * 这里只写GET请求的方法即可
	 */
	protected void doGet2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//查询所有数据
		BookServiceImpl bookService = new BookServiceImpl();
		List<Book> list = bookService.findAllBooks();
		if(list != null){
			request.setAttribute("bookList", list);
			request.getRequestDispatcher("/admin/products/list2.jsp").forward(request, response);
		}
	}
}
