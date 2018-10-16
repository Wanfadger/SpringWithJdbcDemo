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
        employeeModel.setEmail("Ga.fahd@gmail.com");
        employeeModel.setUsername("wanfadger");
        employeeModel.setFirstname("Gawango");
        employeeModel.setLastname("Faad");
        employeeModel.setPassword("1234");
        employeeModel.setGender("F");
        employeeModel.setSalary(106400.00);
        
        
        
        if(employee.createEmployee(employeeModel)>0) {
        System.out.println("successfully added");	
        }else {
        	System.out.println("failed");
        }
        
        context.close();
    }
}
