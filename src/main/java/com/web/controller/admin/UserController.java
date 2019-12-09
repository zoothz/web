package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.dao.IUserDao;
import com.web.model.UserModel;

@Controller
public class UserController {
	@Autowired
	private IUserDao userdao;
	
	@RequestMapping(value="/admin/user",method = RequestMethod.GET)
	public String index() {
		UserModel user = new UserModel();
		
		user.setListResult(userdao.findAll());
		
		return"admin/user/index";
	}
}
