package com.akash.management.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.akash.management.bean.StudentBean;

@Repository
public class StudentImp implements StudentRepo {

	private static final Logger logger = LogManager.getLogger(StudentImp.class);

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveData(StudentBean bean) {
		String query = """
				INSERT INTO STUDENTS (ROLLNO, FIRSTNAME, LASTNAME, EMAILID)
				VALUES (:ROLLNO, :FIRSTNAME, :LASTNAME, :EMAILID);
				""";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("ROLLNO", Integer.valueOf(bean.getRollNo()));
		paramMap.put("FIRSTNAME", bean.getFirstName());
		paramMap.put("LASTNAME", bean.getLastName());
		paramMap.put("EMAILID", bean.getEmailId());

		namedParameterJdbcTemplate.update(query.toString(), paramMap);

	}

	public List<Map<String, Object>> getStudentData() {

		StringBuilder query = new StringBuilder();
		query.append("SELECT ROLLNO, FIRSTNAME, LASTNAME, EMAILID FROM STUDENTS");
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(query.toString());
		return queryForList;

	}

	public String updateStudentData(StudentBean bean) {
		String query = """
				UPDATE STUDENTS SET FIRSTNAME = :FIRSTNAME, LASTNAME = :LASTNAME, EMAILID = :EMAILID
				WHERE ROLLNO = :ROLLNO
				""";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("ROLLNO", Integer.valueOf(bean.getRollNo()));
		paramMap.put("FIRSTNAME", bean.getFirstName());
		paramMap.put("LASTNAME", bean.getLastName());
		paramMap.put("EMAILID", bean.getEmailId());

		return namedParameterJdbcTemplate.update(query.toString(), paramMap) > 0 ? "Student data updated successfully"
				: "Student data not updated successfully";
	}

	public String checkStudentRoll(StudentBean bean) {

		StringBuilder query = new StringBuilder();
		query.append("SELECT COUNT(*) FROM STUDENTS WHERE WHERE ROLLNO = :ROLLNO");

		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("ROLLNO", Integer.valueOf(bean.getRollNo()));

		int count = namedParameterJdbcTemplate.queryForObject(query.toString(), paramMap, Integer.class);
		return count > 0 ? "" : "Roll number does not exist";
	}

	
    public List<Map<String, Object>> fetchStudentData(String rollNo) {
		String query = """
				SELECT ROLLNO, FIRSTNAME, LASTNAME, EMAILID FROM STUDENTS WHERE ROLLNO = :ROLLNO
				""";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("ROLLNO", Integer.valueOf(rollNo));

        return namedParameterJdbcTemplate.queryForList(query, paramMap);
    }
}
