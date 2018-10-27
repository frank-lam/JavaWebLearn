package com.gyf.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gyf.domain.User;
import com.gyf.util.DBUtils;

public class UserService {

	public User findUser(String name,String password){
		User user = null;
		Connection conn = null;//创建连接
		//PreparedStatement stmt = null;//预处理
		Statement stmt = null;
		ResultSet resultSet = null;//结果集
		
		try {
			conn = DBUtils.getConnection();
			/*stmt = conn.prepareStatement("select * from user where name = ? and password=?;");
			stmt.setString(1, name);
			stmt.setString(2, password);*/
			
			stmt = conn.createStatement();
			String sql = "select * from user where name = '" + name + "' and password='" + password + "';";
			System.out.println(sql);
			resultSet = stmt.executeQuery(sql);
			//处理结果
			while(resultSet.next()){
				user = new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				user.setDate(resultSet.getDate(5));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(conn, stmt, null);
		}
		
		return user;
	}
}
