package jdbcc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
public class MainM {
	static Scanner s=new Scanner(System.in);
	
public static void main(String[] args) throws Exception {
	EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
	//EmployeeDao dao=new EmployeeDaoImpl();
//    Employee employee = new Employee(3, "madhura", "madhura@gmail.com");
//   dao.addEmployee(employee);
	/*Scanner s=new Scanner(System.in);
	System.out.println("Enter EmpId: ");
	int id=s.nextInt();
	System.out.println("Enter Employee Name:");
	String name=s.next();
	System.out.println("Enter Employee Email");
	String email=s.next();
	Employee employee = new Employee(id,name,email);
	dao.addEmployee(employee);*/
	//dao.deleteEmployee(1);
	int option=0;
	System.out.println("Hello Employee");
	String m="No";
	do
	{
	System.out.println("please select any one option \n1.insert 2.update"
			+ " 3. delete 4.get Employee by id  5. list of Employees");
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
			Employee employee = new Employee(id,name,email);
			dao.addEmployee(employee);
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
			Employee employee = new Employee(y,name,email);
			dao.updateEmployee(y,employee);
			break;
			
		}
		case 3:
		{
			System.out.println("Please enter Employee id");
			int y=s.nextInt();
			dao.deleteEmployee(y);
			break;
		}
		case 4:
		{
			System.out.println("Please enter Employee id");
			int y=s.nextInt();
			Employee e=dao.getEmployeeById(y);
			System.out.println(e);
			break;
		}
		case 5:
		{
			System.out.format("%-15s %-15s %-15s\n","EId","EName","Email"); 
			List<Employee> r=dao.getEmployees();
			for(Employee i:r)
			{
				System.out.format
				("%-15s %-15s %-15s\n",i.getEmpId(),i.getName(),i.getEmail());
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
