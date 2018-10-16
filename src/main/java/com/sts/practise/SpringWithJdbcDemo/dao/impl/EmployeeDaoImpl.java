package com.sts.practise.SpringWithJdbcDemo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sts.practise.SpringWithJdbcDemo.IDaos.IEmployeeDao;
import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
    @Autowired
	private JdbcTemplate jdbcTemplate;
    
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int createEmployee(EmployeeModel employeeModel) {
	  final	String SQL = "INSERT INTO employee (firstname,lastname,username,email,password,salary,gender) VALUES(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(SQL,new Object[] {employeeModel.getFirstname(), employeeModel.getLastname() , employeeModel.getUsername() , employeeModel.getEmail(),employeeModel.getPassword(),
				employeeModel.getSalary() , employeeModel.getGender()});
	}

//	public int createEmployee(EmployeeModel employeeModel) {
//		Connection connection = null;
//		PreparedStatement pStatement;
//		
//		try {
//			connection = dataSource.getConnection();
//			String sql = "INSERT INTO employee (firstname,lastname,username,email,password,salary,gender) VALUES(?,?,?,?,?,?,?)";
//			pStatement = connection.prepareStatement(sql);
//			//bind values
//			pStatement.setString(1, employeeModel.getFirstname());
//			pStatement.setString(2, employeeModel.getLastname());
//			pStatement.setString(3, employeeModel.getUsername());
//			pStatement.setString(4, employeeModel.getEmail());
//			pStatement.setString(5, employeeModel.getPassword());
//			pStatement.setString(7, employeeModel.getGender());
//			pStatement.setDouble(6, employeeModel.getSalary());
//	    int status = pStatement.executeUpdate();
//	    if(status>0) {
//	    	System.out.println("EmployeeDaoImpl.createEmployee() successfully added");
//	    }else {
//	    	System.out.println("failed");
//	    }
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		// TODO Auto-generated method stub
//		return 0;
//	}

	public EmployeeModel getEmployeeById(EmployeeModel employeeModel) {
		final String SQL = "SELECT * FROM employee WHERE employee_id=?";
		return jdbcTemplate.queryForObject(SQL, new EmployeeRawMapper(), employeeModel.getEmployeeId()) ;
	}

	public int deleteEmployeeById(EmployeeModel employeeModel) {
      final String SQL = "DELETE  FROM employee WHERE employee_id=?";
      
		return jdbcTemplate.update(SQL, new Object[] {employeeModel.getEmployeeId()});
	}

	public int updateEmployeeEmailById(EmployeeModel employeeModel) {
		final String SQL="UPDATE employee set email=? WHERE employee_id=?";
		
		return jdbcTemplate.update(SQL, new Object[] {employeeModel.getEmail() , employeeModel.getEmployeeId()});
	}

	
	public List<EmployeeModel> getAllEmployees() {
		final String SQL = "SELECT * FROM employee";
		
		return jdbcTemplate.query(SQL, new EmployeeRawMapper());
		
	}

}
