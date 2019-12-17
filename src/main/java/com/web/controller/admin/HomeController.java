package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.UserModel;
import com.web.service.impl.UserService;
@Controller(value="HomeControllerOfAdmin")
public class HomeController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/admin/home")
	public String index() {
		
		return "admin/index";
	}
	
	@RequestMapping(value= {"/admin","/admin/login"},method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView login = new ModelAndView("admin/login");
		
		return login;
	}
	
	@RequestMapping(value="/admin",method= RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("account") UserModel user,@RequestParam String username, @RequestParam String password) {
		
		ModelAndView login= new ModelAndView("admin/home");
		userservice.findbyUsername(username);
		
		return login;
	}
}
