package com.akash.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akash.management.bean.StudentBean;
import com.akash.management.service.StudentService;

@Controller
@RequestMapping("/stud")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/student")
	public String showStudentForm() {
		return "student";
	}
	
	@PostMapping("/student")
	public String saveData(StudentBean bean) {
		try {
			service.saveData(bean);
		} catch (Exception e) {

		}
		return "student";
	}

	@GetMapping("/getStudList")
	public String getStudentList(Model map) {
		return "studentList";
	}
}
