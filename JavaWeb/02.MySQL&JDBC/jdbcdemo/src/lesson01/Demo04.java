package lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo04 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			//1��ע������
			Class.forName("com.mysql.jdbc.Driver");//ʹ���������ͼ�����

			//2����������
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?user=root&password=123456");
		
			//3���õ�ִ��sql����Statement����
			statement = conn.createStatement();
			String sql = "select * from user;";
			
			//4��ִ��sql��䣬�����ؽ��

			 resultSet = statement.executeQuery(sql);
			//5��������
			while(resultSet.next()){
				System.out.println(resultSet.getObject(1));
				System.out.println(resultSet.getObject(2));
				System.out.println(resultSet.getObject(3));
				System.out.println(resultSet.getObject(4));
				System.out.println(resultSet.getObject(5));
				System.out.println("======================");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//6�ر���Դ
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
	

}
