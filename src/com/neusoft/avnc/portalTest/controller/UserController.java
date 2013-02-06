package com.neusoft.avnc.portalTest.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.avnc.portalTest.domain.User;
import com.neusoft.avnc.portalTest.service.IUserService;
@Controller
public class UserController extends BaseController{
	private IUserService userService;
	
	@RequestMapping("/editUser")
	public ModelAndView editUser(HttpServletRequest request){
		
		return new ModelAndView(appProperties.getTheme()+"/editUser","user",new User());
	}
	
	@RequestMapping("/saveUser")
	public ModelAndView saveUser(HttpServletRequest request){
		ModelMap modelMap = new ModelMap();
		System.out.println("User controller run!!!");
		User user = new User();
		user.setName("pwd");
		user.setPwd("aaaa");
		userService.addUser(user);
		return new ModelAndView(appProperties.getTheme()+"/user","message","asdffd");
	}
	
	public IUserService getUserService() {
		return userService;
	}
	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
