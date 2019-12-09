package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.model.CateModel;
import com.web.service.ICateService;

@Controller(value = "CateControllerOfAdmin")
public class CateController {
	@Autowired
	private ICateService cateservice;

	@RequestMapping(value = "/admin/cate", method = RequestMethod.GET)
	public String index() {

		return "admin/cate/index";
	}

	@RequestMapping(value = "/admin/cate/${name}", method = RequestMethod.GET)
	public String viewname(@PathVariable String name, Model model) {

		CateModel cate = new CateModel();
		cate = cateservice.findbyname(name);

		model.addAttribute("cate", cate);

		return "admin/cate/view";
	}

	@RequestMapping(value = "/admin/cate/${id}", method = RequestMethod.GET)
	public String viewid(@PathVariable Long id, Model model) {

		CateModel cate = new CateModel();
		cate = cateservice.findbyid(id);

		model.addAttribute("cate", cate);

		return "admin/cate/view";
	}

	@RequestMapping(value = "/admin/cate/${code}", method = RequestMethod.GET)
	public String viewcode(@PathVariable String code, Model model) {
		CateModel cate = new CateModel();
		cate = cateservice.findbycode(code);
		model.addAttribute("cate", cate);

		return "admin/cate/view";
	}

	@RequestMapping(value = "/admin/cate/add", method = RequestMethod.GET)
	public String add() {

		return "admin/cate/add";
	}

	@RequestMapping(value = "/admin/cate/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("cate") CateModel cate,Model model) {
		
		cateservice.add(cate);
		
		cate.setListResult(cateservice.findAll());
		
		model.addAttribute("cate", cate);
		return "admin/cate/index";
	}
	@RequestMapping(value="/admin/cate/delete/${id}",method=RequestMethod.DELETE)
	public String deleteid(@PathVariable Long id,Model model) {
		CateModel cate = new CateModel();
		
		 cateservice.delete(id);
		 cate.setListResult(cateservice.findAll());
		 model.addAttribute("cate",cate);
		return"admin/cate/index";
	}
	@RequestMapping(value="/admin/cate/delete/${name}",method=RequestMethod.DELETE)
	public String deletename(@PathVariable String name,Model model, CateModel cate) {
				 
		cateservice.delete(name);
		cate.setListResult(cateservice.findAll());
		model.addAttribute("cate",cate);
		return"admin/cate/index";
	}
}
