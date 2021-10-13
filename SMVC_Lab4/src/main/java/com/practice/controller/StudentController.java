package com.practice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
	
	@RequestMapping("index2")
	public String index2(ModelMap model) {
	Student sv1 = new Student("Bạch Liên Nhi", 8.5, "Ứng dụng phần mềm");
	Student sv2 = new Student("THHD", 9.5, "Thiết kế trang web");
	Student sv3 = new Student("Nguyễn Huyền Linh", 8.5, "Thiết kế trang web");
	List<Student> list = new ArrayList<>();
	list.add(sv2);
	list.add(sv3);
	Map<String, Student> map = new HashMap<>();
	map.put("BLN", sv2);
	map.put("NHL", sv3);
	
	model.addAttribute("bean", sv1);
	model.addAttribute("list", list);
	model.addAttribute("map", map);
	return "student/index2";
	}
}
