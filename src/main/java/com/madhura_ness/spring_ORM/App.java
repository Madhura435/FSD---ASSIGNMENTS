package com.madhura_ness.spring_ORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhura_spring_orm_dao.Employeedao;
import com.madhura_spring_orm_entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext
        		("config.xml");
       Employeedao dao=ctx.getBean("employeedao",Employeedao.class);
       
       Scanner s=new Scanner(System.in);
       System.out.println("Welcome to Ness get Employee data");
       boolean flag=true;
       while(flag)
       {
    	   System.out.print("Press 1:Add Employee ");
    	   System.out.print("Press 2:get All Employees ");
    	   System.out.print("Press 3:Get Employee by id ");
    	   System.out.print("Press 4:Delete Employee ");
    	   System.out.print("Press 5:update Employee ");
    	   System.out.print("Press 6:Exit\n");
    	   try
    	   {
    		   int input=s.nextInt();
    		   switch (input) {
			case 1:
				System.out.println("Enter EmpId: ");
    			int id=s.nextInt();
    			System.out.println("Enter Employee Name:");
    			String name=s.next();
    			System.out.println("Enter Employee Email");
    			String email=s.next();
    			Employee employee = new Employee();
    			employee.setId(id);
    			employee.setName(name);
    			employee.setEmail(email);
    			dao.addEmployee(employee);
    			System.out.println("new record inserted");
				break;
           case 2:
        	   System.out.format("%-15s %-15s %-15s\n","EId","EName","Email"); 
   			List<Employee> r=dao.getAllEmployess();
   			for(Employee i:r)
   			{
   				System.out.format
   				("%-15s %-15s %-15s\n",i.getId(),i.getName(),i.getEmail());
   			}
				break;
           case 3:
        	   System.out.println("Please enter Employee id");
      			int y=s.nextInt();
      			Employee e=dao.getEmployeeById(y);
      			System.out.println(e);
				break;
           case 4:
        	   System.out.println("Please enter Employee id");
   			int u=s.nextInt();
   			dao.deleteEmployee(u);
   			System.out.println("Employee of "+u+" recorded deleted");
				break;
           case 5:
        	   System.out.println("Please enter Employee id");
   			int y1=s.nextInt();
   			System.out.println("Enter updated Employee Name:");
   			String name1=s.next();
   			System.out.println("Enter Updated Employee Email");
   			String email1=s.next();
   			Employee employee1= new Employee();
   			
   			employee1.setId(y1);
   			employee1.setName(name1);
   			employee1.setEmail(email1);
   	        
   			dao.updateEmployee(employee1);
   			System.out.println("update done successfully");
				break;
           case 6:
        	   System.out.println("Thank you for visting!!--");
        	   flag=false;
				
			default:
				break;
			}
    		   
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println(e);
    	   }
       }
    }
}
