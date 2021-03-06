package com.sts.practise.SpringWithJdbcDemo.models;

public class EmployeeModel {
	private int employeeId;
	private String firstname,lastname,username,email,password;
	private String gender;
	private Double salary;
	
	
	public EmployeeModel() {
		super();
	}
	
	
	public EmployeeModel(int employeeId) {
		super();
		this.employeeId = employeeId;
	}

	 




	public EmployeeModel(int employeeId, String email) {
		super();
		this.employeeId = employeeId;
		this.email = email;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	

}
