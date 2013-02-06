package com.neusoft.avnc.portalTest.controller;

import javax.annotation.Resource;

import com.neusoft.avnc.portalTest.domain.AppProperties;
/**
 * Controller基类
 * <br>Title:Controller基类
 * <br>Description:编写具有共用性质的方法
 * <br>Author:曲锐(qur@neusoft.com)
 * <br>Date:2013-2-6
 */
public class BaseController {
	
	protected AppProperties appProperties;
	
	@Resource(name="appProperties")
	public void setAppProperties(AppProperties appProperties) {
		this.appProperties = appProperties;
	}
	
	
}
