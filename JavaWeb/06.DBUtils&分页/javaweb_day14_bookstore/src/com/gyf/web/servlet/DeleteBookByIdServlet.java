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

@WebServlet("/DeleteBookByIdServlet")
public class DeleteBookByIdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.获取删除书的id
		String bookId = request.getParameter("id");
		
		//2.创建service
		BookServiceImpl bookService = new BookServiceImpl();
		
		//3.删除书
		bookService.deleteBookById(bookId);
		
		//4.返回图书列表界面
		List<Book> list = bookService.findAllBooks();
		request.setAttribute("bookList", list);
		request.getRequestDispatcher("/admin/products/list.jsp").forward(request, response);
	}
}
