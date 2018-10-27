package com.gyf.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ManagerThreadLocal {

	private static ThreadLocal<Connection>  tl = new ThreadLocal<Connection>();
	/**
	 * 获取本地线程中的一个连接
	 * */
	public static Connection getConnection(){
		Connection conn = tl.get();
		if(conn == null){
			conn = C3P0Utils.getConnection();
			tl.set(conn);
		}
		return conn;
	}
	//开始事务
	public static void beginTransaction(){
		try {
			getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//提交事务
	public static void commitTransaction(){
		try {
			getConnection().commit();;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//回滚事务
	public static void rollback(){
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//关闭连接
	public static void close(){
		try {
			getConnection().close();//把连接放回连接池中
			tl.remove();//从当前线程中移除连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
