package com.neusoft.avnc.portalTest.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neusoft.avnc.portalTest.domain.User;
@Repository("userDao")
/**
 * 
 * <br>Title:User数据库操作类
 * <br>Description:包含增删改查等
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-2-6
 */
public class UserDao extends BaseDao implements IUserDao {
	/**
	 * 添加用户
	 * <br>Description:添加用户
	 * <br>Author:曲锐(qur@neusoft.com)
	 * <br>Date:2013-2-6
	 * @see com.neusoft.avnc.portalTest.repository.IUserDao#addUser(com.neusoft.avnc.portalTest.domain.User)
	 */
	public Integer addUser(User user) {
		Session session = sessionFactory.openSession();
		session.save(user);
		return user.getId();
	}
	
}
