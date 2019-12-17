package com.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.OrderModel;

@Controller(value="OrderCOntrollerOfAdmin")
public class OrderController {
	
	
	@RequestMapping(value="/admin/order",method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("admin/order/index");
		
		
		return index;
	}
	
	@RequestMapping(value = "/admin/order/view",method = RequestMethod.GET)
	public ModelAndView view() {
		ModelAndView view = new ModelAndView("admin/order/view");
		
		return view;
	}
	
	@RequestMapping(value="/admin/order/add",method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView add = new ModelAndView("admin/order/add");
		
		
		return add;
	}
	
	@RequestMapping(value="/admin/order/add",method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("order") OrderModel order) {
		ModelAndView add = new ModelAndView("admin/order/add");
		
		
		return add;
	}
	
	
}
