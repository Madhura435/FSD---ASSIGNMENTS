package com.madhura_ness.spring_Ness;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentBean implements InitializingBean,DisposableBean {
private int id;
private String name;
private String email;
public StudentBean() {
	super();
}
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
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroy called");
}
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("init called");
}
@Override
public String toString() {
	return "StudentNess [id=" + id + ", name=" + name + ", email=" + email + "]";
}

}
