package com.web.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.CateModel;
import com.web.service.impl.CateService;

@Controller(value="HomeControllerOfClient")
public class HomeController {
	
	@Autowired
	private CateService cateservice;
	
	@RequestMapping(value="/trangchu")
	public String home(Model model) {
		
		CateModel cate= new CateModel();
		cate.setListResult(cateservice.findAll());
		
		model.addAttribute("cate",cate);
		return "client/index";
	}
}
