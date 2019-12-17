package com.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="HomeControllerOfClient")
public class HomeController {
	
	
	@RequestMapping(value="/trangchu")
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("client/index");
		
		
		
		return index;
	}
	
}
