package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.bean.Student;

@Controller
@RequestMapping("/student/")
public class StudentController {
	@RequestMapping("index")
	public String index(ModelMap model) {
		Student student= new Student("Nguyễn Văn Tèo",9.5,"WEB");
		model.addAttribute("student123", student);
		return "student2";

	}

}
