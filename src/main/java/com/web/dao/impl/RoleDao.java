package com.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.dao.IRoleDao;
import com.web.mapper.RoleMapper;
import com.web.model.RoleModel;

@Repository
public class RoleDao implements IRoleDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public List<RoleModel> findAll() {
		String sql = "select * from role ";
		return jdbctemplate.query(sql,new RoleMapper());
	}

	@Override
	public RoleModel findbyname(String name) {
		String sql = "select * from web.role where name =?";
		return jdbctemplate.queryForObject(sql, new RoleMapper(),name);
	}

	@Override
	public void add(RoleModel role) {
		String sql = "insert into role(name,code) values(?,?)";
		jdbctemplate.update(sql,role.getName(),role.getCode());
	}

	@Override
	public void update(RoleModel role) {
		String sql = "update from role set name=?,code = ?";
		jdbctemplate.update(sql,role.getName(),role.getCode());
	}

	@Override
	public void delete(Long id) {
		RoleModel role = new RoleModel();
		String sql = "DELETE FROM role WHERE id =?";
		jdbctemplate.update(sql,role.getId());
	}

}
