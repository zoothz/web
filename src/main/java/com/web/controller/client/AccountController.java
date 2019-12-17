package com.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
		
	@RequestMapping(value="/account",method = RequestMethod.GET)
	public ModelAndView view() {
		ModelAndView setting = new ModelAndView("client/account/index");
		
		
		return setting;
	}
	@RequestMapping(value="/account/update",method = RequestMethod.GET)
	public ModelAndView update () {
		ModelAndView update = new ModelAndView("client/account/edit");
		
		
		return update;
	}
}
