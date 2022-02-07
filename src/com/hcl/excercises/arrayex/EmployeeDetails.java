package com.hcl.excercises.arrayex;

public class EmployeeDetails{

	private int id;
	private String name;
	private String city;
	
	EmployeeDetails(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	EmployeeDetails(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
