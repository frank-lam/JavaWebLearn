package com.gyf.service.impl;

import com.gyf.dao.IUserDao;
import com.gyf.dao.impl.UserDaoImpl;
import com.gyf.domain.User;
import com.gyf.exception.UserException;
import com.gyf.service.IUserService;

public class UserServiceImpl implements IUserService{

	IUserDao userDao = new UserDaoImpl();
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userDao.insert(user);
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.findUser(username, password);
	}
	
	@Override
	public User login(User user) throws UserException{
		// TODO Auto-generated method stub
		User u = userDao.findUser(user.getUsername(), user.getPassword());
		if(u == null){
			throw new UserException("用户或者密码不存在");
		}
		return u;
	}

	@Override
	public User userExsit(User user) {
		// TODO Auto-generated method stub
		return userDao.findUser(user.getUsername());
	}

}
