package com.web.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.web.model.NewsModel;

public class NewsMapper  implements RowMapper<NewsModel>{

	@Override
	public NewsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		NewsModel news = new NewsModel();
		news.setTitle(rs.getString("title"));
		news.setThumbal(rs.getString("thumbal"));
		news.setShortDescription(rs.getString("shortdescription"));
		news.setContent(rs.getString("content"));
		news.setCateID(rs.getLong("cateid"));
		news.setCateCode(rs.getString("catecode"));
		news.setCreatedDate(rs.getTimestamp("createddate"));
		news.setCreatedBy(rs.getString("createdby"));
		news.setModifiedDate(rs.getTimestamp("modifieddate"));
		news.setModifiedBy(rs.getString("modifiedby"));
		return news;
	}

}
