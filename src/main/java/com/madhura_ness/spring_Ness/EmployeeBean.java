package com.madhura_ness.spring_Ness;

public class EmployeeBean {
public int id;
public String name;
public String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "EmployeeBean [id=" + id + ", name=" + name + ", email=" + email + "]";
}

public void init()
{
	//the name of the function be anything
	System.out.println("init called");
}
public void destroy()
{
	//the name of the function be anythings
	System.out.println("destroy called");
}
}
