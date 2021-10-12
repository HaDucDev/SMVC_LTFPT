package com.practice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.bean.Major;
import com.practice.bean.Student;


@Controller
@RequestMapping("/student/")
public class StudentController {
	@RequestMapping("index")
	public String index(ModelMap model) {
		Student student = new Student("Nguyễn Văn Tèo", 9.5, "WEB");
		model.addAttribute("student123", student);
		return "student2";

	}

//	@ModelAttribute("majors")
//	public Map<String, String> getMajors() {
//		Map<String, String> majors = new HashMap<>();
//		majors.put("APP", "Ứng dụng phần mềm");
//		majors.put("WEB", "Thiết kế trang web");
//		return majors;
//	}

	@ModelAttribute("majors")
	public List<Major> getMajors() {
		List<Major> majors = new ArrayList<>();
		majors.add(new Major("APP", "Ứng dụng phần mềm"));
		majors.add(new Major("WEB", "Thiết kế trang web"));
		return majors;
	}

}
