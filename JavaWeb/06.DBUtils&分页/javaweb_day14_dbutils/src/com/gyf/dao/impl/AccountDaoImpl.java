package com.gyf.dao.impl;


import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.gyf.dao.IAccountDao;
import com.gyf.domain.Account;
import com.gyf.utils.C3P0Utils;
import com.gyf.utils.ManagerThreadLocal;

public class AccountDaoImpl implements IAccountDao{
	private Connection con;//dao里放一个连接
	
	public AccountDaoImpl(Connection con) {
		this.con = con;
	}
	public AccountDaoImpl() {}
	
	/**
	 * 更新数据库的帐号信息
	 */
	public void updateAccount(Account acc) throws Exception{
		QueryRunner qr = new QueryRunner();
		qr.update(ManagerThreadLocal.getConnection(), "update account set money = ? where name = ?",acc.getMoney(),acc.getName());
	}
	
	/**
	 * 根据名字查找用户
	 */
	@Override
	public Account findAccount(String name) throws Exception {
		QueryRunner qr = new QueryRunner();
		Account a = qr.query(ManagerThreadLocal.getConnection(), "select * from account where name = ?", new BeanHandler<Account>(Account.class), name);
		return a;
	}
	
	@Override
	public void updateAccount(String from, String to, float amount) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		qr.update("update account set money = money - ? where name = ?",amount,from);
		qr.update("update account set money = money + ? where name = ?",amount,to);
	}
	

}
