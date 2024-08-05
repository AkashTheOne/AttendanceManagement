package com.akash.management.controller;

import java.util.List;
import java.util.Map;

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

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
			logger.info("bean>>>>>>>", bean);
			service.saveData(bean);
		} catch (Exception e) {
			logger.error(e);
		}

		return "student";
	}

	@GetMapping("/getStudList")
	public String getStudentList(Model map) {
		List<Map<String, Object>> studentData = service.getStudentData();
		map.addAttribute("students", studentData);
		logger.info("map data {}", studentData);
		return "studentList";
	}

	@GetMapping("/editStudent")
	public String showEditStudentForm(Model map) {
		map.addAttribute("editdataMap", "data");
		return "editStudent";
	}

	@GetMapping("/fetchStudentData")
	public String fetchStudentData(HttpServletResponse response,HttpServletRequest request, Model map) {
		logger.info("getRollNo data {}", request.getParameter("rollNo"));
		List<Map<String, Object>> fetchStudentData = service.fetchStudentData(request.getParameter("rollNo"));
		map.addAttribute("students", fetchStudentData);
		map.addAttribute("editdataMap", "data");
		return "editStudent";
	}

	@PostMapping("/updateStudent")
	public String updateStudentData(StudentBean bean, Model map) {
		String updateStudentData = service.updateStudentData(bean);
		map.addAttribute("updateDataMap", updateStudentData);
		map.addAttribute("dataMap", "data");
		
		return "editStudent";
	}

}
