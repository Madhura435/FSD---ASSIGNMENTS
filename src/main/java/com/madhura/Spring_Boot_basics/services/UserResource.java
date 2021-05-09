package com.madhura.Spring_Boot_basics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.madhura.Spring_Boot_basics.Exceptions.UserNotFoundException;
import com.madhura.Spring_Boot_basics.dao.UserDaoResource;
import com.madhura.Spring_Boot_basics.entities.User;

import java.util.*;

@RestController
public class UserResource {

@Autowired	
private UserDaoResource dao;	
	
@GetMapping("/users")	
public List<User> AllUsers()
{
	return dao.findAll();
}
@GetMapping("/users/{id}")
public User getUserById(@PathVariable Integer id) {
	User u=dao.findOne(id);
	if(u==null)
	{
		throw new UserNotFoundException("User Not Found");
	}
	return u;
}

@PostMapping("/users")
public void createUser(@RequestBody User u)
{
	dao.save(u);
}

@PutMapping("/users/{id}")
public void updateUser(@PathVariable int id,@RequestBody User u)
{
	boolean result=dao.update(id, u);
	if(result==true)
	{
		
	}
	else
	{
		throw new UserNotFoundException("User not found");
	}
}

@DeleteMapping("/users/{id}")
public void deleteUser(@PathVariable int id)
{
	boolean result=dao.delete(id);
	if(result==true)
	{
		
	}
	else
	{
		throw new UserNotFoundException("User not found");
	}
}

}
