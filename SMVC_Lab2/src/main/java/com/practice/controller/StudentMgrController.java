package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student-mgr")
public class StudentMgrController {
	@RequestMapping()
	public String index(ModelMap model) {
		model.addAttribute("message", "Bạn gọi index()");
		return "/student/student-mgr";

	}

	@RequestMapping(params = "btnInsert")
	public String insert(ModelMap model) {
		model.addAttribute("message", "Bạn gọi insert()");
		return "/student/student-mgr";
	}

	@RequestMapping(params = "btnUpdate")
	public String update(ModelMap model) {
		model.addAttribute("message", "Bạn gọi update()");
		return "/student/student-mgr";
	}

	@RequestMapping(params = "btnDelete")
	public String delete(ModelMap model) {
		model.addAttribute("message", "Bạn gọi delete()");
		return "/student/student-mgr";
	}

	@RequestMapping(params = "lnkEdit")
	public String edit(ModelMap model) {
		model.addAttribute("message", "Bạn gọi edit()");
		return "/student/student-mgr";
	}
}
