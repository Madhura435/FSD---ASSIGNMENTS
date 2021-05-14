package com.madhura.fullstackbackendness.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhura.fullstackbackendness.entity.Employee;
import com.madhura.fullstackbackendness.exception.ResourceNotFoundException;
import com.madhura.fullstackbackendness.repository.EmployeeRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepositary;
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return employeeRepositary.findAll();
	}
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeRepositary.save(employee);
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById
	(@PathVariable Long id)
	{
		Employee empoyeebyid=employeeRepositary.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Employee not found with id "+id));
		return ResponseEntity.ok(empoyeebyid);
		
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee e2)
	{
		
		Employee e=employeeRepositary.findById(id).orElseThrow(() ->new ResourceNotFoundException("Employee not found with id "+id));
		e.setFirstName(e2.getFirstName());
		e.setLastName(e2.getLastName());
		e.setEmailId(e2.getEmailId());
		Employee updateemployee=employeeRepositary.save(e);
		return ResponseEntity.ok(updateemployee);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable long id)
	{
		Employee e3=employeeRepositary.findById(id).orElseThrow(() ->new ResourceNotFoundException("Employee not found with id "+id));
		employeeRepositary.delete(e3);
		Map<String,Boolean> response=new HashMap();
		response.put("Deleted employee wih id "+id,Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}



