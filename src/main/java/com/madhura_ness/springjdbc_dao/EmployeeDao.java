package com.madhura_ness.springjdbc_dao;

import java.util.*;
import com.madhura_ness.springjdbc_entities.Employee;

public interface EmployeeDao {
public int addEmployee(Employee e);
public void updateEmployee(int id,Employee e);
public void deleteEmployee(int id);
public Employee getEmployee(int id);
public List<Employee> getEmployes();
}
