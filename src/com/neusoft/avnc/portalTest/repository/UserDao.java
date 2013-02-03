package com.neusoft.avnc.portalTest.repository;

import org.springframework.stereotype.Repository;

import com.neusoft.avnc.portalTest.domain.User;
@Repository("userDao")
public class UserDao extends BaseDao implements IUserDao {
	
	@Override
	public Integer addUser(User user) {
		String sql = "insert into t_user(name,pwd) values('user-1','pwd-1')";
		this.getJdbcTemplate().execute(sql);
		Integer maxRows = this.getLastInsertId();
		System.out.println("当前最大行="+ maxRows);
		return this.getLastInsertId();
	}

}
