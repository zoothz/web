package com.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="LoginControllerOfClient")
public class LoginController {
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView login = new ModelAndView("client/login");
		
		return login;
	}
	
}
