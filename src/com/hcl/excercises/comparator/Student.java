package com.hcl.excercises.comparator;

public class Student implements Comparable<Student>{
	private String name;
	private String information;
	private int nummy;
	
	Student(String name, String information, int nummy) {
		this.name = name;
		this.information = information;
		this.nummy = nummy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public int getNummy() {
		return nummy;
	}
	public void setNummy(int nummy) {
		this.nummy = nummy;
	}

	public int compareTo(Student s) {
		if (nummy == s.nummy) {
			return 0;
		}else if(nummy > s.nummy) {
			return 1;
		}else {
			return -1;
	}

	}
}
