package com.shop.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.webshop.bll.UsersBl;
import com.shop.webshop.dom.Users;

@Controller
public class HomeController {
	
	@Autowired
	private UsersBl ubl;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Index() {
		/*if (ubl != null) {
			StringBuilder sb = new StringBuilder();
			for(Users user : ubl.GetAll()) {
				sb.append("Username: "+user.getUsername()+ "("+ user.getUid()+")"+"<br/>");
				sb.append("First name: "+user.getUfirstname()+"<br/>");
				sb.append("Last name: "+user.getUlastname()+"<br/>");
			}
			return sb.toString();
		}
		return "I'm running properly!";
		*/
		return "index";
	}
}
