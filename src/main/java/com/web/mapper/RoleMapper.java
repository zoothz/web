package com.web.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.web.model.RoleModel;

public class RoleMapper implements RowMapper<RoleModel> {

	@Override
	public RoleModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoleModel role= new RoleModel();
		role.setName(rs.getString("name"));
		role.setCode(rs.getString("code"));
		return role;
	}

}
