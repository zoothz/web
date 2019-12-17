package com.web.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="OrderControllerOfClient")
public class OrderController {

	@RequestMapping(value="/order",method = RequestMethod.GET)
	public ModelAndView index () {
		ModelAndView index = new ModelAndView("client/order/index");
		
		
		return index;
	}
}
