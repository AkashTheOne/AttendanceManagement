package com.akash.management.service;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.management.bean.StudentBean;
import com.akash.management.repo.StudentRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StudentService {

	private static final Logger logger = LogManager.getLogger(StudentService.class);

	@Autowired
	private StudentRepo repo;

	public void saveData(StudentBean bean) {
		repo.saveData(bean);
	}

	public List<Map<String, Object>> getStudentData() {
		List<Map<String, Object>> studentData = null;
		try {
			studentData = repo.getStudentData();
			logger.info("studentData: {} ",studentData);
		} catch (Exception e) {
			logger.error("Exception occured in StudentService class method getStudentData ",e);
		}
		return studentData;
	}
	
	public String updateStudentData(StudentBean bean) {
		return repo.updateStudentData(bean);
	}
	
	public String checkStudentRoll(StudentBean bean) {
		String checkStudentRoll = repo.checkStudentRoll(bean);
		if(!checkStudentRoll.isEmpty()) {
			return checkStudentRoll;
		}
		return "";
	}

	public List<Map<String, Object>> fetchStudentData(String rollNo) {
		List<Map<String, Object>> studentData = null;
		try {
			
			studentData = repo.fetchStudentData(rollNo);
			logger.info("studentData: {} ",studentData);
		} catch (Exception e) {
			logger.error("Exception occured in StudentService class method getStudentData ",e);
		}
		return studentData;
		
	}
	
	
}
