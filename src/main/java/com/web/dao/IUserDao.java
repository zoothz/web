package com.web.dao;

import java.util.List;

import com.web.model.UserModel;

public interface IUserDao {
	List<UserModel> findAll();
	UserModel findbyID(Long id);
	UserModel findbyUsername(String username);
	UserModel findbyphone(String phone);
	void update (UserModel user);
	void delete(Long id);
	void add(UserModel user);
	boolean login(String username,String password);
}
