package com.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.ICateDao;
import com.web.model.CateModel;
import com.web.service.ICateService;

@Service
public class CateService implements ICateService{
	@Autowired
	private ICateDao catedao;
	@Override
	public List<CateModel> findAll() {
		// TODO Auto-generated method stub
		return catedao.findAll();
	}

	@Override
	public CateModel findbyid(Long id) {
		// TODO Auto-generated method stub
		return catedao.findbyid(id);
	}

	@Override
	public CateModel findbyname(String name) {
		// TODO Auto-generated method stub
		return catedao.findbyname(name);
	}

	@Override
	public CateModel findbycode(String code) {
		// TODO Auto-generated method stub
		return catedao.findbycode(code);
	}

	@Override
	public void add(CateModel cate) {
		// TODO Auto-generated method stub
		catedao.add(cate);
	}

	@Override
	public void update(CateModel cate) {
		// TODO Auto-generated method stub
		catedao.update(cate);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		catedao.delete(id);
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		catedao.delete(name);
	}

}
