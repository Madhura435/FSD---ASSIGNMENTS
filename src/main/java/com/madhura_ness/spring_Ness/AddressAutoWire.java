package com.madhura_ness.spring_Ness;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressAutoWire {
	@Value("House no1")
	private String houseNo;
	@Value("City1")
	private String city;
	@Value("Country1")
	private String Country;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", Country=" + Country + "]";
	}

}
