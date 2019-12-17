package com.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.model.CateModel;
import com.web.service.ICateService;

@Controller(value = "CateControllerOfAdmin")
public class CateController {
	@Autowired
	private ICateService cateservice;

	@RequestMapping(value = "/admin/cate", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView index =new ModelAndView("admin/cate/index");
		
		
		return index;
	}

	@RequestMapping(value = "/admin/cate/${name}", method = RequestMethod.GET)
	public ModelAndView viewname(@RequestParam String name,@ModelAttribute("cate")CateModel cate) {
		ModelAndView viewname = new ModelAndView("admin/cate/view");
		
		cate = cateservice.findbyname(name);
		viewname.addObject("cate",cate);
		return viewname;
	}

	@RequestMapping(value = "/admin/cate/${id}", method = RequestMethod.GET)
	public ModelAndView viewid(@PathVariable Long id,@ModelAttribute("cate") CateModel cate) {
		ModelAndView viewid = new ModelAndView("admin/cate/view");
		
		cate = cateservice.findbyid(id);
		
		viewid.addObject("cate",cate);

		return viewid;
	}

	@RequestMapping(value = "/admin/cate/view/${code}", method = RequestMethod.GET)
	public ModelAndView viewcode(@RequestParam String code, @ModelAttribute("cate") CateModel cate ) {
		ModelAndView viewcode = new ModelAndView("admin/cate/view");
		
		cate = cateservice.findbycode(code);
		
		viewcode.addObject("cate",cate);
		
		return viewcode;
	}

	@RequestMapping(value = "/admin/cate/add", method = RequestMethod.GET)
	public ModelAndView add() {
		
		ModelAndView add = new ModelAndView("admin/cate/add");
		return add;
	}

	@RequestMapping(value = "/admin/cate/add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("cate") CateModel cate) {
		ModelAndView add =new ModelAndView("admin/cate/index");
		
		cateservice.add(cate);
		
		add.addObject("cate",cate);
		return add;
	}
	@RequestMapping(value="/admin/cate/delete/${id}",method=RequestMethod.GET)
	public ModelAndView deleteid(@PathVariable Long id,@ModelAttribute("cate") CateModel cate) {
		ModelAndView delete = new ModelAndView("admin/cate/index");
		
		cate.setListResult(cateservice.findAll());
		cateservice.delete(id);
		 
		delete.addObject("cate",cate);
		return delete;
	}
	@RequestMapping(value="/admin/cate/delete/${name}",method=RequestMethod.DELETE)
	public ModelAndView deletename(@RequestParam String name,@ModelAttribute("cate") CateModel cate) {
		ModelAndView deletename =new ModelAndView("admin/cate/index");
		cateservice.findbyname(name);
		cateservice.delete(name);
		cate.setListResult(cateservice.findAll());
		deletename.addObject("cate",cate);
		
		return deletename;
	}
}
