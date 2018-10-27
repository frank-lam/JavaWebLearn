package com.gyf.dao;

import com.gyf.domain.Account;

public interface IAccountDao {

	@Deprecated
	public void updateAccount(String from,String to,float money) throws Exception;
	
	public void updateAccount(Account acc) throws Exception;
	
	public Account findAccount(String name) throws Exception;
}
