package com.ssi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.ProductDAO;
import com.ssi.entities.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@RequestMapping("productdetails")
	public ModelAndView showProductDetails(@RequestParam("pcode") int pcode){
		Product product=dao.searchProductById(pcode);
		ModelAndView mv=new ModelAndView("productdetails.jsp");
		mv.addObject("prod", product);
		return mv;
	}
	@RequestMapping("search")
	public String showSearchForm(){
		return "search.jsp";
	}
	@RequestMapping("newproduct")
	public String showProductEntryForm(){
		return "productentry.jsp";
	}
	@RequestMapping("saveproduct")
	public ModelAndView saveProductData(@ModelAttribute("prod") Product product){
		dao.saveProduct(product);
		ModelAndView mv=new ModelAndView("productentryconfirm.jsp");
		return mv;
	}
}
