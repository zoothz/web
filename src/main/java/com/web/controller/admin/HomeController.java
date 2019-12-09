package com.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller(value="HomeControllerOfAdmin")
public class HomeController {
	
	@RequestMapping(value="/admin")
	public String index() {
		
		return "admin/index";
	}
}
