package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value="/admin/user",method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView index = new ModelAndView("admin/user/index");
		UserModel user = new UserModel();
		
		user.setListResult(userservice.findAll());
		
		index.addObject("user",user);
		
		return index;
	}
	@RequestMapping(value="/admin/user/view",method=RequestMethod.GET)
	public ModelAndView viewID(@RequestParam(value="id")Long id, @ModelAttribute("user") UserModel user) {
		ModelAndView viewid = new ModelAndView("admin/user/view");
		
		if(id != null) {
			user = userservice.findbyID(id);
		}
		viewid.addObject("user",user);
		
		return viewid;
	}
	@RequestMapping(value="/admin/user/${phone}",method = RequestMethod.GET)
	public String viewphone(@PathVariable String phone,Model model) {
		UserModel user = new UserModel();
		user = userservice.findbyPhone(phone);
		model.addAttribute("user",user);
		
		return"admin/user/view";
	}
	
	@RequestMapping(value="/admin/user/add",method = RequestMethod.GET )
	public ModelAndView add() {
		ModelAndView add = new ModelAndView("admin/user/add");
		return add;
	}
	@RequestMapping(value="/admin/user/add",method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("user") UserModel user,Model model) {
		ModelAndView add = new ModelAndView("admin/user/index");
		
		user.setListResult(userservice.findAll());
		
		userservice.add(user);
		model.addAttribute("user",user);
		
		add.addObject("user", model);
		return add;
	}
}	
