package com.akash.management.bean;

public class StudentBean {

	private String rollNo;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public StudentBean() {
		super();
	}

	public StudentBean(String rollNo, String firstName, String lastName, String emailId) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "StudentBean [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + "]";
	}
	
}
