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
		Connection conn = null;//��������
		Statement stmt = null;//Ԥ����
		ResultSet resultSet = null;//�����
		try {
			conn = DBUtils.getConnection();
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery("select * from user;");
			List<User> list = new ArrayList<User>();
			//5��������
			while(resultSet.next()){
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				//java.sql.Date�̳�java.util.Date
				user.setDate(resultSet.getDate(5));
				list.add(user);
			}
			//��ӡ����
			System.out.println(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(conn, stmt, null);
		}
	}
}
