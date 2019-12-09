package com.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value="HomeControllerOfClient")
public class HomeController {
	
	@RequestMapping(value="/trangchu")
	public String home() {
		
		return "client/index";
	}
}
