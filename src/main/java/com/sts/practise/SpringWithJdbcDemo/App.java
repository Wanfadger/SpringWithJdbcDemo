package com.sts.practise.SpringWithJdbcDemo;

import java.util.List;

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
       //retrieving single value 
//       EmployeeModel employeeModel2 = employee.getEmployeeById(new EmployeeModel(1)); 
//       System.out.println("fname "+employeeModel2.getFirstname() +" lastname "+employeeModel2.getLastname());
        
//        if(employee.createEmployee(employeeModel)>0) {
//        System.out.println("successfully added");	
//        }else {
//        	System.out.println("failed");
//        }
//        
       
        //retrieving all table recored
       
        List<EmployeeModel> employeeList = employee.getAllEmployees();
        System.out.println("\t\t EMPLOYEE DETAILS \t\t");
        for(EmployeeModel emp : employeeList) {
        	System.out.println("firstname: "+emp.getFirstname()+"\t lastname: "+emp.getLastname()+"\t username: "+emp.getUsername()+"\t email: "+emp.getEmail()+"gender: "+emp.getGender());
        }
        
        employee.updateEmployeeEmailById(new EmployeeModel(2,"fg@g.com"));
        if(employee.deleteEmployeeById(new EmployeeModel(3))>0) {
        	System.out.println("deleted successfully");
        }else {
          System.out.println("failed to delete");
        }
          
        context.close();
    }
}
