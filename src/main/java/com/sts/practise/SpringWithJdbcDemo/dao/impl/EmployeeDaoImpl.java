package com.sts.practise.SpringWithJdbcDemo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.sts.practise.SpringWithJdbcDemo.IDaos.IEmployeeDao;
import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;

public class EmployeeDaoImpl implements IEmployeeDao {
  
	private DataSource dataSource;
	
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int createEmployee(EmployeeModel employeeModel) {
		Connection connection = null;
		PreparedStatement pStatement;
		
		try {
			connection = dataSource.getConnection();
			String sql = "INSERT INTO employee (firstname,lastname,username,email,password,salary,gender) VALUES(?,?,?,?,?,?,?)";
			pStatement = connection.prepareStatement(sql);
			//bind values
			pStatement.setString(1, employeeModel.getFirstname());
			pStatement.setString(2, employeeModel.getLastname());
			pStatement.setString(3, employeeModel.getUsername());
			pStatement.setString(4, employeeModel.getEmail());
			pStatement.setString(5, employeeModel.getPassword());
			pStatement.setString(7, employeeModel.getGender());
			pStatement.setDouble(6, employeeModel.getSalary());
	    int status = pStatement.executeUpdate();
	    if(status>0) {
	    	System.out.println("EmployeeDaoImpl.createEmployee() successfully added");
	    }else {
	    	System.out.println("failed");
	    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return 0;
	}

	public EmployeeModel getEmployeeById(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteEmployeeById(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateEmployeeById(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<EmployeeModel> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
