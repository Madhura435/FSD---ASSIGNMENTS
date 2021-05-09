package com.madhura_ness.spring_Ness;

public class Address {
private String houseNo;
private String city;
private String Country;
public Address(String houseNo, String city, String country) {
	this.houseNo = houseNo;
	this.city = city;
	Country = country;
}
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
