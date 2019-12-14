package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.IUserDao;
import com.web.model.UserModel;
import com.web.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService{
	
	@Autowired
	private IUserDao userdao;
	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}

	@Override
	public UserModel findbyID(Long id) {
		// TODO Auto-generated method stub
		return userdao.findbyID(id);
	}

	@Override
	public UserModel findbyUsername(String username) {
		// TODO Auto-generated method stub
		return userdao.findbyUsername(username);
	}

	@Override
	public void update(UserModel user) {
		userdao.update(user);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userdao.delete(id);
	}

	@Override
	public void add(UserModel user) {
		// TODO Auto-generated method stub
		userdao.add(user);
	}

	@Override
	public UserModel findbyPhone(String phone) {
		// TODO Auto-generated method stub
		return userdao.findbyphone(phone);
	}

	@Override
	public boolean login(String username,String password) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
