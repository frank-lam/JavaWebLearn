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
			//1、注册驱动
			Class.forName("com.mysql.jdbc.Driver");//使用了这个类就加载了

			//2、创建连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?user=root&password=123456");
		
			//3、得到执行sql语句的Statement对象
			statement = conn.createStatement();
			String sql = "select * from user;";
			
			//4、执行sql语句，并返回结果

			 resultSet = statement.executeQuery(sql);
			//5、处理结果
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
	

}
