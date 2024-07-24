package com.akash.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stud")
public class StudentController {
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/student")
	public String saveData() {
		return "student";
	}
	
	@GetMapping("/getStudList")
	public String getStudentList(Model map) {
		return "studentList";
	}
}
