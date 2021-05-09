package com.madhura_spring_orm_dao;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.madhura_spring_orm_entities.Employee;



public class Employeedao {

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int addEmployee(Employee e)
	{
		Integer rows=(Integer)hibernateTemplate.save(e);
		return rows;
	}
	public List<Employee> getAllEmployess()
	{
		List<Employee> ea=hibernateTemplate.loadAll(Employee.class);
		return ea;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e=hibernateTemplate.get(Employee.class, id);
		return e;
	}
	@Transactional
	public void updateEmployee(Employee updateEmployee)
	{
		hibernateTemplate.update(updateEmployee);
	}
	@Transactional
	public void deleteEmployee(int id)
	{
		Employee e=hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(e);
	}

	
}






