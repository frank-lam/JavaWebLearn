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
			//2����������
			conn = DBUtils.getConnection();
		
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
			DBUtils.closeAll(conn, statement, resultSet);
		}
		
	}
	

}
