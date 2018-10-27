package com.gyf.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.gyf.domain.Book;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		String str = "{\"id\":\"1001\",\"name\":\"Java入门\",\"price\":19.88,\"pnum\":100,\"category\":\"IT\",\"description\":\"Good Book\"}";
		System.out.println(str);
		
		//创建 "对象映射" 对象
		ObjectMapper mapper = new ObjectMapper();
		
		Book book = mapper.readValue(str, Book.class);
		System.out.println(book);
		
	}

	private static void test1() throws IOException, JsonGenerationException, JsonMappingException {
		//创建 "对象映射" 对象
		ObjectMapper mapper = new ObjectMapper();
		
		//1.对象转json
		Book b1 = new Book("1001", "Java入门", 19.88,100, "IT", "Good Book");
		
		String bookJson = mapper.writeValueAsString(b1);
		System.out.println(bookJson);
		
		//2. List转json
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("1001", "Java入门", 19.88,100, "IT", "Good Book"));
		list.add(new Book("1002", "PHP入门", 29.88,100, "IT", "Good Book"));
		list.add(new Book("1003", "Python入门", 39.88,100, "IT", "Good Book"));
		String bookList = mapper.writeValueAsString(list);
		System.out.println(bookList);
		
		
		//3.Map转json
		Map<String,String> map = new HashMap<String,String>(); 
		map.put("name", "gyf");
		map.put("age", "18");
		map.put("height", "1.70");
		System.out.println(mapper.writeValueAsString(map));
	}
}
