package com.shop.webshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.webshop.bll.UsersBl;
import com.shop.webshop.dom.Users;

@Controller
public class UserController {
	
	@Autowired
	private UsersBl ubl;
	@Value("${spring.application.name}")
	private String appName;
	
	@RequestMapping(value = "/Users", method = RequestMethod.GET)
	public String Users(Model model) {
		List<Users> userList = (ubl == null) ? new ArrayList<Users>() : ubl.GetAll();
		model.addAttribute("userList", userList);
		return "Users";
	}
}
