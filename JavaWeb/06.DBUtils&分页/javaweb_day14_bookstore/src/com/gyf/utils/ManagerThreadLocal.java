package com.gyf.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ManagerThreadLocal {

	private static ThreadLocal<Connection>  tl = new ThreadLocal<Connection>();
	/**
	 * ��ȡ�����߳��е�һ������
	 * */
	public static Connection getConnection(){
		Connection conn = tl.get();
		if(conn == null){
			conn = C3P0Utils.getConnection();
			tl.set(conn);
		}
		return conn;
	}
	//��ʼ����
	public static void beginTransaction(){
		try {
			getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�ύ����
	public static void commitTransaction(){
		try {
			getConnection().commit();;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//�ع�����
	public static void rollback(){
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//�ر�����
	public static void close(){
		try {
			getConnection().close();//�����ӷŻ����ӳ���
			tl.remove();//�ӵ�ǰ�߳����Ƴ�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
