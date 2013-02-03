package com.neusoft.avnc.portalTest.repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class BaseDao extends JdbcDaoSupport{
	/**
	 * 注入dataSource
	 * @param dataSource
	 */
	@Resource(name="dataSource")
	public void setSqlMapClientForOverRied(DataSource dataSource){
        super.setDataSource(dataSource);
    }
	/**
	 * 取得最后插入的自增字段值
	 * @return Integer 
	 */
	public Integer getLastInsertId(){
		return this.getJdbcTemplate().queryForInt("select last_insert_id()");
	}
}
