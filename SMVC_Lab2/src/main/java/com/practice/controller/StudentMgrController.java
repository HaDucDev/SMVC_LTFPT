package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.bean.Student;

@Controller
@RequestMapping("/student-mgr")
public class StudentMgrController {
	@RequestMapping()
	public String index(ModelMap model) {
		model.addAttribute("message", "Bạn gọi index()");
		return "/student/student-mgr";

	}

	@RequestMapping(params = "btnInsert")
	public String insert(ModelMap model, 
			@RequestParam("name") String name,@RequestParam("mark") Double mark,
			@RequestParam("major") String major) {
		model.addAttribute("message", "Bạn gọi insert()");
		model.addAttribute("name", name);
		model.addAttribute("mark", mark);
		model.addAttribute("major", major);
		return "/student/sucess";
	}

	@RequestMapping(params = "btnUpdate")
	public String update(ModelMap model, Student student) {
		model.addAttribute("message", "Bạn gọi update()");
		model.addAttribute("student123",student);
		return "/student/sucess";
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
