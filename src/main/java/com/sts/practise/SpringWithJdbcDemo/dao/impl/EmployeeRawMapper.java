package com.sts.practise.SpringWithJdbcDemo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;

public class EmployeeRawMapper implements RowMapper<EmployeeModel> {

	public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setEmployeeId(rs.getInt("employee_id"));
		employeeModel.setFirstname(rs.getString("firstname"));
		employeeModel.setLastname(rs.getString("lastname"));
		employeeModel.setUsername(rs.getString("username"));
		employeeModel.setEmail(rs.getString("email"));
		employeeModel.setGender(rs.getString("gender"));
		employeeModel.setSalary(rs.getDouble("salary"));
		return employeeModel;
	}



}
