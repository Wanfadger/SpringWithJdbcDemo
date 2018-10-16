package com.sts.practise.SpringWithJdbcDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sts.practise.SpringWithJdbcDemo.IService.IEmployeeService;
import com.sts.practise.SpringWithJdbcDemo.models.EmployeeModel;
import com.sts.practise.SpringWithJdbcDemo.service.impl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("springConfig.xml");
        System.out.println("Hello world");
        IEmployeeService  employee = context.getBean("employeeService" , EmployeeServiceImpl.class);
        
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setEmail("Galiwango.fahad@gmail.com");
        employeeModel.setFirstname("Galiwango");
        employeeModel.setLastname("Fahad");
        employeeModel.setPassword("123");
        employeeModel.setGender("M");
        employeeModel.setSalary(1000.00);
        
        
        
        employee.createEmployee(employeeModel);
        
        context.close();
    }
}
