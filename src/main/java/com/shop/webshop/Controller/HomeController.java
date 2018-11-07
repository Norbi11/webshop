package com.shop.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.webshop.bll.UsersBl;
import com.shop.webshop.dom.Users;

@RestController
public class HomeController {
	
	@Autowired
	private UsersBl ubl;
	@RequestMapping("/")
	public String Index() {
		return "I'm running properly!";
	}
}
