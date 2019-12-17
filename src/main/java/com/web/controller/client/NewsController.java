package com.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="NewsControllerOfClient")
public class NewsController {
	
	

	@RequestMapping(value="/news",method = RequestMethod.GET)
	public ModelAndView index () {
		ModelAndView index = new ModelAndView("client/news/index");
		
		
		return index;
	}
}
