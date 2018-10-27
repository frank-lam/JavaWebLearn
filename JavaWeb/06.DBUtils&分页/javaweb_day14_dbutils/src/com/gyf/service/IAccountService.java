package com.gyf.service;

public interface IAccountService {

	/**
	 * 转账业务
	 * @param from 转出
	 * @param to 输入
	 * @param money 金额
	 */
	public void transfer(String from,String to,float money)throws Exception;
}
