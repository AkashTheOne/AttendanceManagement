package com.akash.management.repo;

import java.util.List;
import java.util.Map;

import com.akash.management.bean.StudentBean;

public interface StudentRepo{
	
	public void saveData(StudentBean bean);
	
	public List<Map<String,Object>> getStudentData();

	public String updateStudentData(StudentBean bean);
	
	public String checkStudentRoll(StudentBean bean);

	public List<Map<String, Object>> fetchStudentData(String rollNo);
	
}
