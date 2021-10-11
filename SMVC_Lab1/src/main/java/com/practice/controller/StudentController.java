package com.practice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/student/form")
	public String showForm()
	{
		return "/student/form";
	}
	
	@RequestMapping("student/save")
	public String saveData(HttpServletRequest request)
	{
		// lấy dữ liệu từ form
		String name=request.getParameter("name");
		String mark=request.getParameter("mark"); 
		String major=request.getParameter("major");
		// gán dữ liệu lấy đươc với tham số và sẽ truyền nó đến trang tiếp theo
		request.setAttribute("name", name);
		request.setAttribute("mark", mark);
		request.setAttribute("major", major);
		
		return "student/sucess";
	}
	
	
	

}
