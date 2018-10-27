package com.gyf.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {
	private static DataSource ds;
	static{
		Properties p = new Properties();
		try {
			p.load(DBCPUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
			
			try {
				ds = BasicDataSourceFactory.createDataSource(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new ExceptionInInitializerError("参数配置不正确");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ExceptionInInitializerError("dbcpconfig.properties 文件找不到");
		}
	}
	
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
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
			resultSet = null;
		}
		
		if(statement != null){
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statement = null;
		}
		
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				conn = null;
			}
		}
	}
}
