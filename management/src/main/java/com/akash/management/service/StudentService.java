package com.akash.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.management.bean.StudentBean;
import com.akash.management.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	public void saveData(StudentBean bean) {
		repo.saveData(bean);
	}
}
