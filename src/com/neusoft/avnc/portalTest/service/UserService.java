package com.neusoft.avnc.portalTest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neusoft.avnc.portalTest.domain.User;
import com.neusoft.avnc.portalTest.repository.IUserDao;
@Service("userService")
public class UserService implements IUserService{

	private IUserDao userDao;

	public Integer addUser(User user) {
		return userDao.addUser(user);
	}

	public IUserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDao")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
