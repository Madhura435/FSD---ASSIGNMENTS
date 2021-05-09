package com.madhura_ness.spring_Ness;

public class Student {
private int id;
private String name;
private String email;
private Address address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
}

}
