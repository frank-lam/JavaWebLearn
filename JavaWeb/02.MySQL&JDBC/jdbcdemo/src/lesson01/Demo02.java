package lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ʵ��JDBC����
		//1��ע������
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Class.forName("com.mysql.jdbc.Driver");//ʹ���������ͼ�����
		
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "123456");
		//2����������
		Connection conn = DriverManager.getConnection("jdbc:mysql:///test1", info);
		
		//3���õ�ִ��sql����Statement����
		Statement statement = conn.createStatement();
		String sql = "select * from user;";
		
		//4��ִ��sql��䣬�����ؽ��

		ResultSet resultSet = statement.executeQuery(sql);
		//5��������
		while(resultSet.next()){
			System.out.println(resultSet.getObject(1));
			System.out.println(resultSet.getObject(2));
			System.out.println(resultSet.getObject(3));
			System.out.println(resultSet.getObject(4));
			System.out.println(resultSet.getObject(5));
			System.out.println("======================");
		}
		
		
		//6�ر���Դ
		resultSet.close();
		statement.close();
		conn.close();
	}
	
	
	public void test2(){
		
	}

}
