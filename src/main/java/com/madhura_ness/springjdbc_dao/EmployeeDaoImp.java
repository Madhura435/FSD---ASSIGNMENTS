package com.madhura_ness.springjdbc_dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.madhura_ness.springjdbc_entities.Employee;

public class EmployeeDaoImp implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		String query="insert into employee(id,name,email) values(?,?,?)";
		int result=jdbcTemplate.update(query,e.getId(),e.getName(),e.getEmail());
		return result;
	}
	
	

	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		String sql="update employee set name='"+employee.getName()+
				"',email='"+employee.getEmail()+"'where id="+id;
		int f=jdbcTemplate.update(sql);
		
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql="delete from employee where id="+id;
		jdbcTemplate.update(sql);
	}
/*
 * As explained in the javadoc of the class as well as in the upgrade/migration guide it explains that you should use the varargs method.

jdbcTemplate.queryForObject("select * from student_id = ?", studentRowMapper, studentId);
and

List<Student> students = return jdbcTemplate.query("select * from class_room_id = ?", st
 */
	public Employee getEmployee(int id){
		// TODO Auto-generated method stub
		String sql = "select * from employee where id = ?";

        return jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(), new Object[]{id});
	}

	public List<Employee> getEmployes() {
		// TODO Auto-generated method stub
		String sql="select * from Employee order by id";
		List<Employee> r=jdbcTemplate.query(sql,new EmployeeRowMapper());
		return r;
	}


	
	public class EmployeeRowMapper implements RowMapper<Employee> {

	    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

	    	Employee e= new Employee();
	        e.setId(rs.getInt(1));
	        e.setName(rs.getString(2));
	       e.setEmail(rs.getString(3));
	        

	        return e;

	    }
	}
}
