package com.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.IUserDao;
import com.web.mapper.UserMapper;
import com.web.model.UserModel;

@Repository
@Transactional
public class UserDao implements IUserDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<UserModel> findAll() {
		String sql = "select * from account";
		return jdbctemplate.query(sql, new UserMapper());
	}

	@Override
	public UserModel findbyID(Long id) {
		String sql = "select * from account where id =?";

		return jdbctemplate.queryForObject(sql, new UserMapper(), id);
	}

	@Override
	public UserModel findbyUsername(String username) {
		String sql = "select * from account where username =?";
		return jdbctemplate.queryForObject(sql, new UserMapper(), username);
	}

	@Override
	public void update(UserModel user) {
		String sql = "update account set  password=?, fullname=?,email =?, address =?,phone=?";
		jdbctemplate.update(sql, user.getPassword(), user.getFullname(), user.getEmail(), user.getAddress(),
				user.getPhone());
	}

	@Override
	public void delete(Long id) {
		String sql = "delete account wehre id =" + id;
		jdbctemplate.update(sql);

	}

	@Override
	public void add(UserModel user) {
		String sql = "insert into account(username,password,fullname,email,address,phone";
		jdbctemplate.update(sql, user.getUsername(), user.getPassword(), user.getFullname(), user.getEmail(),
				user.getAddress(), user.getPhone());

	}

	@Override
	public UserModel findbyphone(String phone) {
		String sql = "select * from account where phone = ?";
		return jdbctemplate.queryForObject(sql, new UserMapper(), phone);
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		//String  sql="select * from account where username = ?,password = ?";
		
		return false;
	}

	

}
