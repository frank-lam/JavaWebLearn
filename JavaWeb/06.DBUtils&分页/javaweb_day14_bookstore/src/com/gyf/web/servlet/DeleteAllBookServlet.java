package com.gyf.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyf.domain.Book;
import com.gyf.service.BookServiceImpl;

@WebServlet("/DeleteAllBookServlet")
public class DeleteAllBookServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.获取删除书的id
		String bookIds = request.getParameter("ids");
		
		System.out.println(bookIds);
		
		BookServiceImpl bookService = new BookServiceImpl();
		bookService.deleteAllBook(bookIds);
		
		//3.返回图书列表界面
		List<Book> list = bookService.findAllBooks();
		request.setAttribute("bookList", list);
		request.getRequestDispatcher("/admin/products/list.jsp").forward(request, response);
	}
}
