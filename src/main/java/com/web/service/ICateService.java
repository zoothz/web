package com.web.service;

import java.util.List;

import com.web.model.CateModel;

public interface ICateService {
	List<CateModel> findAll();
	CateModel findbyid(Long id);
	CateModel findbyname(String name);
	CateModel findbycode(String code);
	void add(CateModel cate);
	void update(CateModel cate);
	void delete(Long id);
	void delete(String name);
}
