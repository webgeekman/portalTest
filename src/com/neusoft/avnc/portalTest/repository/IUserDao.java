package com.neusoft.avnc.portalTest.repository;

import com.neusoft.avnc.portalTest.domain.User;
/**
 * 用户Dao接口
 * <br>Title:用户Dao接口
 * <br>Description:定义接口
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-2-6
 */
public interface IUserDao {
	/**
	 * 添加用户
	 * <br>Description:添加用户
	 * <br>Author:曲锐(qur@neusoft.com)
	 * <br>Date:2013-2-6
	 * @param user
	 * @return Integer
	 */
	public Integer addUser(User user);
}
