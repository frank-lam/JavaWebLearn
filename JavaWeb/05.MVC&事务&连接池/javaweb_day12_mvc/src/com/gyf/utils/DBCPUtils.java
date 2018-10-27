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
				throw new ExceptionInInitializerError("�������ò���ȷ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ExceptionInInitializerError("dbcpconfig.properties �ļ��Ҳ���");
		}
	}
	
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
	}
	
	public static void closeAll(Connection conn,Statement statement,ResultSet resultSet){
		//6�ر���Դ
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
