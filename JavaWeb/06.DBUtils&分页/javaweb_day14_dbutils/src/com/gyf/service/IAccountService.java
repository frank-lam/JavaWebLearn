package com.gyf.service;

public interface IAccountService {

	/**
	 * ת��ҵ��
	 * @param from ת��
	 * @param to ����
	 * @param money ���
	 */
	public void transfer(String from,String to,float money)throws Exception;
}
