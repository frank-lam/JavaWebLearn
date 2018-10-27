package com.gyf.dao;

import com.gyf.domain.User;

public interface IUserDao {

	public void insert(User user);
	
	public User findUser(String username,String password);
	public User findUser(String username);
}
