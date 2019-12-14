package com.web.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.web.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserModel user= new UserModel();
		user.setId(rs.getLong("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFullname(rs.getString("fullname"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setPhone(rs.getString("phone"));
		user.setCreatedDate(rs.getTimestamp("createddate"));
		user.setCreatedBy(rs.getString("createdby"));
		user.setModifiedDate(rs.getTimestamp("modifieddate"));
		user.setModifiedBy(rs.getString("modifiedby"));
		user.setStatus(rs.getInt("status"));
		user.setRole(rs.getLong("role"));
		return user;
	}

}
