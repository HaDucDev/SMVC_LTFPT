package com.practice.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/")
public class StudentController {
	@Autowired
	ServletContext application;

	@RequestMapping("index")
	public String index(HttpServletRequest request, HttpSession session) {
		application.setAttribute("name", "Bạch Liên Nhi");
		application.setAttribute("level", 2);
		session.setAttribute("name", "THHD");
		session.setAttribute("level", 4);
		request.setAttribute("name", "Nguyễn Huyền Linh");
		request.setAttribute("level", 3);
		session.setAttribute("salary", 1000);
		request.setAttribute("photo", "images/sv.png");
		return "student/index";
	}
}