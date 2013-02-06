package com.neusoft.avnc.portalTest.repository;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Dao基类
 * <br>Title:Dao基类
 * <br>Description:实现Dao共通方法
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-2-6
 * @param <T>
 */
public class BaseDao<Table>{
	/**
	 * Hibernate会话工厂
	 */
	@Autowired
	protected SessionFactory sessionFactory;
	
}
