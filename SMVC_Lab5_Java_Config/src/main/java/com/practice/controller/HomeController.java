package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.bean.User;

@Controller
@RequestMapping("/home/")
public class HomeController {
	@Autowired
	@Qualifier("sohai")
	User user;

	@RequestMapping("index")
	public String index(ModelMap model) {
		return "home/index";
	}

	@ModelAttribute("user")
	public User getUser() {
		return user;
	}
}
