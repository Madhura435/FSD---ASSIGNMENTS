package com.madhura_ness.spring_Ness;

public class School {
private int id;
private String name;
private Address address;
public School(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "School [id=" + id + ", name=" + name + ", address=" + address + "]";
}



}
