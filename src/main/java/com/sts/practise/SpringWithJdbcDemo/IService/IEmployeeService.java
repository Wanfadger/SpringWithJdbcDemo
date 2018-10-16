package com.sts.practise.SpringWithJdbcDemo.IService;

import java.util.List;

import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;

public interface IEmployeeService {
	public abstract int createEmployee(EmployeeModel employeeModel);
	public abstract EmployeeModel getEmployeeById(EmployeeModel employeeModel);
	public abstract int deleteEmployeeById(EmployeeModel employeeModel);
	public abstract int updateEmployeeEmailById(EmployeeModel employeeModel);
	public abstract List<EmployeeModel> getAllEmployees();
}
