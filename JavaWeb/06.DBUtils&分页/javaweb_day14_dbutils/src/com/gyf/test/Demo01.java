package com.gyf.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.gyf.domain.Account;
import com.gyf.utils.C3P0Utils;


public class Demo01 {
	/**
	 * 查询数据一
	 * @throws SQLException
	 */
	@Test
	public void test1() throws SQLException{
		//1.创建查询对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.第一种查询数据方式，比较少用
		List<Account> list =  qr.query("SELECT * FROM account", new ResultSetHandler<List<Account>>(){

			@Override
			public List<Account> handle(ResultSet rs) throws SQLException {
				List<Account> list  = new ArrayList<Account>();
				while(rs.next()){
					Account account = new Account();
					account.setId(rs.getInt(1));
					account.setName(rs.getString(2));
					account.setMoney(rs.getFloat(3));
					list.add(account);
				}
				DbUtils.close(rs);
				return list;
			}
		});
		
		//3.第二种查询数据方式，比较常用
		//List<Account> list =  qr.query("SELECT * FROM account", new BeanListHandler<>(Account.class));
		System.out.println(list);
	}
	
	/**
	 * 查询数据二
	 * @throws SQLException
	 */
	@Test
	public void test2() throws SQLException{
		//1.创建查询对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		
		//2.传递参数
		List<Account> list = qr.query(
				"SELECT * FROM account where name = ? and id = ?", 
				new BeanListHandler<>(Account.class), 
				"aaa",2);
		System.out.println(list);
	}
	/**
	 * 插入数据
	 * @throws SQLException
	 */
	@Test
	public void test3() throws SQLException{
		//1.创建查询对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	
		//2.插入数据
		int r = qr.update("INSERT INTO ACCOUNT(name,money) VALUES (?,?)", "gyf",1000.0);
		System.out.println(r);
	}
	
	/**
	 * 删除数据
	 */
	@Test
	public void test4() throws SQLException{
		//1.创建查询对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	
		//2.删除数据
		int r = qr.update("DELETE FROM ACCOUNT WHERE id = ?", 4);
		System.out.println(r);
	}
	
	/**
	 * 更新数据
	 */
	@Test
	public void test5() throws SQLException{
		//1.创建查询对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
	
		//2.更新数据
		int r = qr.update("UPDATE ACCOUNT SET name = ?,money = ? WHERE id = ?",
				"balabala",2000,1);
		System.out.println(r);
	}
}
