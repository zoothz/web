package com.web.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.UserModel;
import com.web.service.IUserService;

@Controller
public class AccountController {
	
	@Autowired
	private IUserService userservice;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)	
	public ModelAndView register() {
		
		ModelAndView reg = new ModelAndView("client/register");
		
		return reg;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("account")UserModel user){
		ModelAndView reg = new ModelAndView("client/index");
		
		userservice.add(user);
		
		return reg;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login() {
		
		ModelAndView login = new ModelAndView("client/login");
		
		return login;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("account")UserModel user) {
		ModelAndView login = new ModelAndView("client/index");

		
		 userservice.login(user.getUsername(), user.getPassword());
		
		 
		
		return login;
	}
}
