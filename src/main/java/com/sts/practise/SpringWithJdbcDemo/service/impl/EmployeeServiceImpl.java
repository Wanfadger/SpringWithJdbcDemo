package com.sts.practise.SpringWithJdbcDemo.service.impl;

import java.util.List;

import com.sts.practise.SpringWithJdbcDemo.IDaos.IEmployeeDao;
import com.sts.practise.SpringWithJdbcDemo.IService.IEmployeeService;
import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;

public class EmployeeServiceImpl implements IEmployeeService {
private IEmployeeDao iEmployeeDao;


	
	public IEmployeeDao getiEmployeeDao() {
	return iEmployeeDao;
}

public void setiEmployeeDao(IEmployeeDao iEmployeeDao) {
	this.iEmployeeDao = iEmployeeDao;
}

	public int createEmployee(EmployeeModel employeeModel) {
	
		return iEmployeeDao.createEmployee(employeeModel);
	}

	public EmployeeModel getEmployeeById(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return iEmployeeDao.getEmployeeById(employeeModel);
	}

	public int deleteEmployeeById(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return iEmployeeDao.deleteEmployeeById(employeeModel);
	}

	public int updateEmployeeEmailById(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return iEmployeeDao.updateEmployeeEmailById(employeeModel);
	}

	public List<EmployeeModel> getAllEmployees() {
		// TODO Auto-generated method stub
		return iEmployeeDao.getAllEmployees();
	}

}
