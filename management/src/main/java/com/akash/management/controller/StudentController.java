package com.akash.management.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private static final Logger logger = LogManager.getLogger(StudentController.class);

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

	@PostMapping("/saveStudent")
	public String saveData(StudentBean bean) {
		try {
			logger.debug("bean>>>>>>>",bean);
			service.saveData(bean);
		} catch (Exception e) {
			logger.error(e);
		}
		
		return "student";
	}

	@GetMapping("/getStudList")
	public String getStudentList(Model map) {
		return "studentList";
	}
}
