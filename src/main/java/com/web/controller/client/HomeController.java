package com.web.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.CateModel;
import com.web.service.impl.CateService;

@Controller(value="HomeControllerOfClient")
public class HomeController {
	
	@Autowired
	private CateService cateservice;
	
	@RequestMapping(value="/trangchu")
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("client/index");
		
		CateModel cate = new CateModel();
		cate.setListResult(cateservice.findAll());
		
		index.addObject("cate",cate);
		
		
		return index;
	}
	
}
