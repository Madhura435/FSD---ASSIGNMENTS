package com.madhura_ness.spring_Ness;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
   //Employee e=(Employee)context.getBean("employee1");
   //System.out.format("%15s %15s %15s\n","id","name","email");
  // System.out.format("%15s %15s %15s\n",e.getId(),e.getName(),e.getEmail());
  // System.out.println(e);
  /*
   * 
   * setter based depededency injection
   *  Employee e=(Employee)context.getBean("employee1");
  
   Employee e1=(Employee)context.getBean("employee1");
   Test t=(Test)context.getBean("test1");
   Student s=(Student)context.getBean("student1");
   System.out.println(e);
   System.out.println(e1);
   System.out.println(t);
   System.out.println(s); */
   
    	//Constructor based depedency injection
    	
//    Customer c=(Customer)context.getBean("customer1");
//    School s=(School)context.getBean("school1");
//    System.out.println(c);
//    System.out.println(s);
    	
    	/*Caluculator f=(Caluculator)context.getBean("calculator1");
    	f.add();
    	System.out.println("********");
    	Caluculator f1=(Caluculator)context.getBean("calculator1");
    	f1.add();
    	System.out.println("********");
    	Caluculator f2=(Caluculator)context.getBean("calculator1");
    	f2.add();
    	System.out.println("********");
    	Caluculator f3=(Caluculator)context.getBean("calculator1");
    	f3.add();*/
    	/*AbstractApplicationContext	context1=new ClassPathXmlApplicationContext("config.xml");
        context1.registerShutdownHook();
        EmployeeBean r=(EmployeeBean)context1.getBean("employee4");
    	//System.out.println(r);
    	
    
    
        StudentBean y=(StudentBean)context1.getBean("student4");
//    System.out.println(y);*/
    	
    	ApplicationContext contextAu=new ClassPathXmlApplicationContext
    			("config1.xml");
    	EmployeeAutoWire ea=contextAu.getBean
    			("employeeAutoWire",EmployeeAutoWire.class);
    	/*in getbean firsparameter lowercase of className(EmployeeAutoWire ea)
    	 * 
    	 */
    	System.out.println(ea);
    	System.out.println(ea.getAdress());
    	
    }
}
