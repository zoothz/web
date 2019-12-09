package com.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.dao.ICateDao;
import com.web.mapper.CateMapper;
import com.web.model.CateModel;

@Repository
public class CateDao implements ICateDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public List<CateModel> findAll() {
		String sql= "select * from cate";
		return jdbctemplate.query(sql,new CateMapper());
	}

	@Override
	public CateModel findbyid(Long id) {
		String sql = "select * from cate where id = ?";
		return jdbctemplate.queryForObject(sql, new CateMapper(),id);
	}

	@Override
	public CateModel findbyname(String name) {
		// TODO Auto-generated method stub
		String sql = "select * from cate where name= ?";
		return jdbctemplate.queryForObject(sql,new CateMapper(),name);
	}

	@Override
	public CateModel findbycode(String code) {
		// TODO Auto-generated method stub
		String sql = "select * from cate wehere code = ?";
		return jdbctemplate.queryForObject(sql,new CateMapper(),code);
	}

	@Override
	public void add(CateModel cate) {
		// TODO Auto-generated method stub
		String sql = "insert into cate(name,code)";
		jdbctemplate.update(sql,cate.getName(),cate.getCodel());
	}

	@Override
	public void update(CateModel cate) {
		String sql ="update cate set name=?,code =?";
		jdbctemplate.update(sql,cate.getName(),cate.getCodel());
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		String sql = "delete cate where id = " +id;
		jdbctemplate.update(sql);
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		String sql="delete cate where name = "+name;
		jdbctemplate.update(sql);
	}

}
