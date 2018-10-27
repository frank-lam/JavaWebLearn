package com.gyf.service.impl;

import java.sql.Connection;

import com.gyf.dao.IAccountDao;
import com.gyf.dao.impl.AccountDaoImpl;
import com.gyf.domain.Account;
import com.gyf.service.IAccountService;
import com.gyf.utils.C3P0Utils;
import com.gyf.utils.ManagerThreadLocal;

public class AccountServiceImpl implements IAccountService{

	
	@Override
	public void transfer(String from, String to, float money) throws Exception {
		//accountDao.updateAccount(from, to, money);废弃的方法
		IAccountDao accountDao = new AccountDaoImpl();
		try {
			ManagerThreadLocal.beginTransaction();//开启事务
			//输出账号
			Account fromAccount = accountDao.findAccount(from);
			//输入帐号
			Account toAccount = accountDao.findAccount(to);
			//计算转账后的又方金额
			fromAccount.setMoney(fromAccount.getMoney() - money);
			toAccount.setMoney(toAccount.getMoney() + money);
			
			//更新数据
			accountDao.updateAccount(fromAccount);
			int i = 10 / 0;//模拟异常
			accountDao.updateAccount(toAccount);
			
			ManagerThreadLocal.commitTransaction();//提交事务
		} catch (Exception e) {
			e.printStackTrace();
			ManagerThreadLocal.rollback();//回滚
		}finally {
			ManagerThreadLocal.close();
		}
	}

}
