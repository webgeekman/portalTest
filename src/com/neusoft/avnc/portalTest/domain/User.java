package com.neusoft.avnc.portalTest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 用户Entity
 * <br>Title:用户实体bean
 * <br>Description:生成用户实体bean，数据库映射
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-2-6
 */
@Entity //设置此类为实体mapping 
@Table(name="t_user") //映射数据库表
public class User extends BaseDomain{
	@Id //设置为主键
	@GeneratedValue(strategy=GenerationType.AUTO)//设置为自增字段
	private Integer id;
	private String name;
	private String pwd;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
