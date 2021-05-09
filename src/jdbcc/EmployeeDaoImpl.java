package jdbcc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDaoImpl implements EmployeeDao {

	private static Statement statement = null;
    private Connection conn;
    
    public EmployeeDaoImpl() throws SQLException {
       conn = ConnectionFactory.getConnection();
        statement = conn.createStatement();
    }
	
	@Override
	public void addEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into employee values("+employee.getEmpId()+
				", '"+employee.getName()+"','"+employee.getEmail()+"'"+")";
		int count=0;
		count=statement.executeUpdate(sql);
		if(count>0)
		{
			System.out.println("Employee saved");
		}
		else
		{
			System.out.println("Not completed");
		}
	}

	@Override
	public void updateEmployee(int id,Employee employee) 
			throws SQLException {
		// TODO Auto-generated method stub
		String sql="update employee set name='"+employee.getName()+
				"',email='"+employee.getEmail()+"'where id="+id;
		int count=0;
		count=statement.executeUpdate(sql);
		if(count>0)
		{
			System.out.println("Employee Updated");
		}
		else
		{
			System.out.println("Not completed");
		}
		
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		String sql="delete from employee where id="+id;
		int count=0;
		count=statement.executeUpdate(sql);
		if(count>0)
		{
			System.out.println("Employee deleted");
		}
		else
		{
			System.out.println("Not completed");
		}
	}

	@Override
	public Employee getEmployeeById(int empId) throws SQLException {
		// TODO Auto-generated method stub
		Employee e=null;
		String sql="select * from employee where id="+empId;
		ResultSet rs=statement.executeQuery(sql);
		if(rs.next())
		{
			e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		return e;
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> l=new ArrayList();
		String sql="select * from employee order by id";
		ResultSet rs=statement.executeQuery(sql);
		
		while(rs.next())
		{
			l.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		return l;
	}

}
