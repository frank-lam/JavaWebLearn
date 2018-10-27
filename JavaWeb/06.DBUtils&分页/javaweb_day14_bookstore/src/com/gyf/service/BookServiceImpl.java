package com.gyf.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.gyf.dao.BookDaoImpl;
import com.gyf.domain.Book;
import com.gyf.domain.PageResult;
import com.gyf.utils.C3P0Utils;

public class BookServiceImpl {
	BookDaoImpl bookDao = new BookDaoImpl();
	public List<Book> findAllBooks(){
		try {
			return bookDao.findAllBooks();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public void addBook(Book book){
		try {
			bookDao.addBook(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * 根据ID查找书的信息
	 */
	public Book findBookById(String id){
		try {
			return bookDao.findBookById(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void updateBook(Book book){
		try {
			bookDao.uppdateBook(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBookById(String bookId) {
		try {
			bookDao.deleteBookById(bookId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deleteAllBook(String bookIds) {
		// TODO Auto-generated method stub
		try {
			//拆分成字符串数组
			String[] ids = bookIds.split(",");
			bookDao.deleteAllBook(ids);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Book> findBookByCondition(String id, String name, String category, String minprice, String maxprice) {
		// TODO Auto-generated method stub
		try {
			return bookDao.findBookByCondition(id,name,category,minprice,maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public PageResult<Book> findBooksWithPageCount(int page) {
		// TODO Auto-generated method stub
		try {
			return bookDao.findBooksWithPageCount(page);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
