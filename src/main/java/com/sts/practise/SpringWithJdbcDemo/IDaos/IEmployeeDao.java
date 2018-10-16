package com.sts.practise.SpringWithJdbcDemo.IDaos;

import java.util.List;

import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;

public interface IEmployeeDao {
public abstract int createEmployee(EmployeeModel employeeModel);
public abstract EmployeeModel getEmployeeById(EmployeeModel employeeModel);
public abstract int deleteEmployeeById(EmployeeModel employeeModel);
public abstract int updateEmployeeEmailById(EmployeeModel employeeModel);
public abstract List<EmployeeModel> getAllEmployees();
}
