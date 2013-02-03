package com.neusoft.avnc.portalTest.controller;

import javax.annotation.Resource;

import com.neusoft.avnc.portalTest.domain.AppProperties;

public class BaseController {
	
	protected AppProperties appProperties;

	@Resource(name="appProperties")
	public void setAppProperties(AppProperties appProperties) {
		this.appProperties = appProperties;
	}
	
	
}
