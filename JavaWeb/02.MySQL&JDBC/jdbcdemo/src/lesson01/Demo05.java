package lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gyf.util.DBUtils;

public class Demo05 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			//2、创建连接
			conn = DBUtils.getConnection();
		
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
			DBUtils.closeAll(conn, statement, resultSet);
		}
		
	}
	

}
