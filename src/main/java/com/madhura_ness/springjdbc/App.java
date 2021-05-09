package com.madhura_ness.springjdbc;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhura_ness.springjdbc_dao.EmployeeDaoImp;
import com.madhura_ness.springjdbc_entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	Scanner s=new Scanner(System.in);
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	EmployeeDaoImp dao=ctx.getBean("empdao",EmployeeDaoImp.class);
    	
    	
    	
    	int option=0;
    	System.out.println("Hello Employee");
    	String m="No";
    	
    	do
    	{
    	System.out.println("please select any one option \n1.insert 2.update"
    			+ " 3. delete 4.get 5.get Employee list");
    	option=s.nextInt();
    		switch(option)
    		{
    		case 1:
    		{
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
    			System.out.println("employee record inserted");
    			break;
    		}
    		case 2:
    		{
    			System.out.println("Please enter Employee id");
    			int y=s.nextInt();
    			System.out.println("Enter updated Employee Name:");
    			String name=s.next();
    			System.out.println("Enter Updated Employee Email");
    			String email=s.next();
    			Employee employee = new Employee();
    			
    			employee.setId(y);
    			employee.setName(name);
    			employee.setEmail(email);
    	        
    			dao.updateEmployee(y,employee);
    			System.out.println("employee record at "+y+" updated");
    			break;
    			
    		}
    		case 3:
    		{
    			System.out.println("Please enter Employee id");
    			int y=s.nextInt();
    			dao.deleteEmployee(y);
    			System.out.println("employee record at "+y+" deleted");
    			break;
    		}
    		case 4:
    		{
    			System.out.println("Please enter Employee id");
    			int y=s.nextInt();
    			Employee e=dao.getEmployee(y);
    			System.out.println(e);
    			break;
    		}
    		case 5:
    		{
    			System.out.format("%-15s %-15s %-15s\n","EId","EName","Email"); 
    			List<Employee> r=dao.getEmployes();
    			for(Employee i:r)
    			{
    				System.out.format
    				("%-15s %-15s %-15s\n",i.getId(),i.getName(),i.getEmail());
    			}
    			break;
    		}
    		default:
    		{
    			System.out.println("Please Enter Correct option");
    		}
    		}
    		
    		
    		System.out.println("Do you want to continue(Yes/No)");
    		m=s.next();
    		
    	}while(m.equals("Yes"));
    	
    	System.out.println("Thank You For Visting");
    	
    	
    }
}
