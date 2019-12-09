package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.model.UserModel;
import com.web.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userservice;
	
	@RequestMapping(value="/admin/user",method = RequestMethod.GET)
	public String index() {
		UserModel user = new UserModel();
		
		user.setListResult(userservice.findAll());
		
		return"admin/user/index";
	}
	@RequestMapping(value="/admin/user/${id}",method=RequestMethod.GET)
	public String viewid(@PathVariable Long id, Model model) {
		UserModel user = new UserModel();
		user = userservice.findbyID(id);
		model.addAttribute("user",user);
		return "admin/user/view";
	}
	@RequestMapping(value="/admin/user/${phone}",method = RequestMethod.GET)
	public String viewphone(@PathVariable String phone,Model model) {
		UserModel user = new UserModel();
		user = userservice.findbyPhone(phone);
		model.addAttribute("user",user);
		
		return"admin/user/view";
	}
	
	@RequestMapping(value="/admin/user/add",method = RequestMethod.GET )
	public String add() {
				
		return "admin/user/add";
	}
	@RequestMapping(value="/admin/user/add",method=RequestMethod.POST)
	public String add(@ModelAttribute("user") UserModel user,Model model) {
		userservice.add(user);
		user.setListResult(userservice.findAll());
		model.addAttribute("user",user);
		
		return "admin/user/index";
	}
}	
