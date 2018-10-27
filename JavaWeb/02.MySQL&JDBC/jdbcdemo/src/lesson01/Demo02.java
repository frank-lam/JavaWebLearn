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
		//实现JDBC操作
		//1、注册驱动
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Class.forName("com.mysql.jdbc.Driver");//使用了这个类就加载了
		
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "123456");
		//2、创建连接
		Connection conn = DriverManager.getConnection("jdbc:mysql:///test1", info);
		
		//3、得到执行sql语句的Statement对象
		Statement statement = conn.createStatement();
		String sql = "select * from user;";
		
		//4、执行sql语句，并返回结果

		ResultSet resultSet = statement.executeQuery(sql);
		//5、处理结果
		while(resultSet.next()){
			System.out.println(resultSet.getObject(1));
			System.out.println(resultSet.getObject(2));
			System.out.println(resultSet.getObject(3));
			System.out.println(resultSet.getObject(4));
			System.out.println(resultSet.getObject(5));
			System.out.println("======================");
		}
		
		
		//6关闭资源
		resultSet.close();
		statement.close();
		conn.close();
	}
	
	
	public void test2(){
		
	}

}
