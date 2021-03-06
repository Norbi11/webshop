package com.shop.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.webshop.bll.UsersBl;
import com.shop.webshop.dom.Users;

@Controller
public class HomeController {
	
	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index(Model model) {
		model.addAttribute("appName", appName);
		return "index";
	}
}
