package com.hcl.excercises.comparator;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	
	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Employee e) {
		if (age == e.age) {
			return 0;
		}else if(age > e.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
