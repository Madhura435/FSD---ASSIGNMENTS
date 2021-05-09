package com.madhura_ness.spring_Ness;
import java.util.*;
import java.io.*;
public class Test {
private int id;
private String name;
private List<String> list;
private Set<String> set;
private Map<String,String> map;
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
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public Set<String> getSet() {
	return set;
}
public void setSet(Set<String> set) {
	this.set = set;
}
public Map<String, String> getMap() {
	return map;
}
public void setMap(Map<String, String> map) {
	this.map = map;
}
@Override
public String toString() {
	return "Test [id=" + id + ", name=" + name + ", list=" + list + ", set=" + set + ", map=" + map + "]";
}

}
