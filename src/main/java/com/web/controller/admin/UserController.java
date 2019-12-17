package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.UserModel;
import com.web.service.IUserService;

@Controller

public class UserController {
	@Autowired
	private IUserService userservice;
	
	@RequestMapping(value= {"/admin/user","/admin/user/view"},method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("admin/user/index");
		UserModel user = new UserModel();
		
		user.setListResult(userservice.findAll());
		
		index.addObject("user",user);
		
		return index;
	}
	@RequestMapping(value="/admin/user/view/{id}",method=RequestMethod.GET)
	public ModelAndView viewID(@PathVariable Long id) {
		ModelAndView viewid = new ModelAndView("admin/user/view");
		UserModel user = new UserModel();
		user = userservice.findbyID(id);
		viewid.addObject("user",user);
		
		return viewid;
	}
	@RequestMapping(value="/admin/user/view/{name}",method=RequestMethod.GET)
	public ModelAndView viewUser(@RequestParam String username) {
		ModelAndView view = new ModelAndView("admin/user/index");
		UserModel user= new UserModel();
		user =  userservice.findbyUsername(username);
		user.setListResult(userservice.findAll());
		view.addObject("user",user);
		return view;
	}
	
	
	@RequestMapping(value="/admin/user/add",method = RequestMethod.GET )
	public ModelAndView add() {
		ModelAndView add = new ModelAndView("admin/user/add");
		return add;
	}
	
	@RequestMapping(value="/admin/user/add",method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("user") UserModel user, @RequestParam String username) {
		ModelAndView add = new ModelAndView("admin/user/index");
		user.setListResult(userservice.findAll());
		
		if(user.getUsername() !=username) {
			userservice.add(user);
		}
		add.addObject("user",user);
		return add;
	}
}	
