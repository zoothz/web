package com.web.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.web.model.CateModel;

public class CateMapper implements RowMapper<CateModel> {

	@Override
	public CateModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		CateModel cate = new CateModel();
		cate.setName(rs.getString("name"));
		cate.setCodel(rs.getString("code"));
		cate.setCreatedDate(rs.getTimestamp("createddate"));
		cate.setCreatedBy(rs.getString("createdby"));
		cate.setModifiedDate(rs.getTimestamp("modifieddate"));
		cate.setModifiedBy(rs.getString("modifiedby"));
		
		return cate;
	}

}
