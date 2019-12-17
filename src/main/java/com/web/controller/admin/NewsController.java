package com.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="NewsControllerOfAdmin")
public class NewsController {

	@RequestMapping(value="/admin/news",method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("admin/news/index");
		
		
		
		return index;
	}
}
