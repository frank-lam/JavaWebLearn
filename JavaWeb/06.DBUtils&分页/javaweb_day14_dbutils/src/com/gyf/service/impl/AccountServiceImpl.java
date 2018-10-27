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
		//accountDao.updateAccount(from, to, money);�����ķ���
		IAccountDao accountDao = new AccountDaoImpl();
		try {
			ManagerThreadLocal.beginTransaction();//��������
			//����˺�
			Account fromAccount = accountDao.findAccount(from);
			//�����ʺ�
			Account toAccount = accountDao.findAccount(to);
			//����ת�˺���ַ����
			fromAccount.setMoney(fromAccount.getMoney() - money);
			toAccount.setMoney(toAccount.getMoney() + money);
			
			//��������
			accountDao.updateAccount(fromAccount);
			int i = 10 / 0;//ģ���쳣
			accountDao.updateAccount(toAccount);
			
			ManagerThreadLocal.commitTransaction();//�ύ����
		} catch (Exception e) {
			e.printStackTrace();
			ManagerThreadLocal.rollback();//�ع�
		}finally {
			ManagerThreadLocal.close();
		}
	}

}
