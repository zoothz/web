package com.web.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.web.model.ProductModel;

public class ProductMapper implements RowMapper<ProductModel>{

	@Override
	public ProductModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductModel product = new ProductModel();
		
		product.setName(rs.getString("name"));
		product.setPrice(rs.getLong("price"));
		product.setImage(rs.getString("image"));
		
		return product;
	}

}
