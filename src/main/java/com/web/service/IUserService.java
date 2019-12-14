package com.web.service;

import java.util.List;

import com.web.model.UserModel;

public interface IUserService {
	List<UserModel> findAll();
	UserModel findbyID(Long id);
	UserModel findbyUsername(String username);
	UserModel findbyPhone(String phone);
	void update (UserModel user);
	void delete(Long id);
	void add(UserModel user);
	boolean login(String username,String password);
}
