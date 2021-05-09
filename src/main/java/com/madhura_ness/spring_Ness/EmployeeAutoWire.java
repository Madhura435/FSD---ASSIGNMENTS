package com.madhura_ness.spring_Ness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAutoWire {

	@Value("1")
	private int id;
	@Value("Mark")
	private String name;
	@Autowired
	private AddressAutoWire adress;
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
	public AddressAutoWire getAdress() {
		return adress;
	}
	public void setAdress(AddressAutoWire adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "EmployeeAutoWire [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
}
