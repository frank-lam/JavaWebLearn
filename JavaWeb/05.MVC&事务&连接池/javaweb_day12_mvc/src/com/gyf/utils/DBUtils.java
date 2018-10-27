package com.gyf.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBUtils {
/*	private static String url = "jdbc:mysql://localhost/day12";
	private static String user = "root";
	private static String password = "123456";
	private static String driverClass = "com.mysql.jdbc.Driver";*/
	private static String url;
	private static String user;
	private static String password;
	private static String driverClass;
	
	static{
		//从类路径中找db.properties
		ResourceBundle rb =  ResourceBundle.getBundle("db");//不需要写.properties
		url = rb.getString("url");
		user = rb.getString("user");
		password = rb.getString("password");
		driverClass = rb.getString("driverClass");
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		System.out.println(driverClass);
		
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url, user, password);
	}
	
	public static void closeAll(Connection conn,Statement statement,ResultSet resultSet){
		//6关闭资源
		if(resultSet != null){
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(statement != null){
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
