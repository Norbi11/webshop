package com.shop.webshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.webshop.bll.ProductsBl;
import com.shop.webshop.dom.Products;

@Controller
public class ProductController {
	
	@Autowired
	private ProductsBl pbl;
	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping(value = "/Products", method = RequestMethod.GET)
	public String Products(Model model) {
		List<Products> productList = (pbl == null) ? new ArrayList<Products>() : pbl.GetAll();
		model.addAttribute("productList", productList);
		return "Products";
	}
}
