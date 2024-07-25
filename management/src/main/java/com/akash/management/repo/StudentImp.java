package com.akash.management.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import com.akash.management.bean.StudentBean;

@Repository
public class StudentImp implements StudentRepo{

	@Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void saveData(StudentBean bean) {
		StringBuilder query = new StringBuilder();
		
		query.append("INSERT INTO STUDENTS (ROLLNO, FIRSTNAME, LASTNAME, EMAILID)");
		query.append("VALUES (:ROLLNO, :FIRSTNAME, :LASTNAME, :EMAILID)");
		
		Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("ROLLNO", Integer.valueOf(bean.getRollNo()));
        paramMap.put("FIRSTNAME", bean.getFirstName());
        paramMap.put("LASTNAME", bean.getLastName());
        paramMap.put("EMAILID", bean.getEmailId());

        namedParameterJdbcTemplate.update(query.toString(), paramMap);
				
	}
}
