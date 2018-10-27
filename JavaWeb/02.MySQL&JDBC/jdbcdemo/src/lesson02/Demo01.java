package lesson02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gyf.domain.User;
import com.gyf.util.DBUtils;

public class Demo01 {

	@Test
	public void test4(){
		Connection conn = null;//创建连接
		Statement stmt = null;//预处理
		ResultSet resultSet = null;//结果集
		try {
			conn = DBUtils.getConnection();
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery("select * from user;");
			List<User> list = new ArrayList<User>();
			//5、处理结果
			while(resultSet.next()){
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				//java.sql.Date继承java.util.Date
				user.setDate(resultSet.getDate(5));
				list.add(user);
			}
			//打印集合
			System.out.println(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(conn, stmt, null);
		}
	}
}
