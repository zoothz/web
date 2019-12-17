package com.web.dao;

import java.util.List;

import com.web.model.RoleModel;

public interface IRoleDao {
	List<RoleModel> findAll();
	RoleModel findbyname(String name);
	void add(RoleModel role);
	void update(RoleModel role);
	void delete(Long id);
}
