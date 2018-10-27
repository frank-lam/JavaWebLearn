package com.gyf.service;

import com.gyf.domain.User;
import com.gyf.exception.UserException;

public interface IUserService {

	public void register(User user);
	public User login(String username,String password);
	public User login(User user) throws UserException;
	
	//�û��Ƿ����
	public User userExsit(User user);
	
}
