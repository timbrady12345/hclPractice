package com.hcl.excercises.comparator;

import java.util.*;

class Patient implements Comparable<Patient>{
	int patientID;
	String patientName;
	int age;

	Patient(int patientID, String patientName, int age) {
		this.patientID = patientID;
		this.patientName = patientName;
		this.age = age;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	class NameCompare implements Comparator<Patient> {
		public int compare(Patient p1, Patient p2) {
			return p1.getPatientName().compareTo(p2.getPatientName());
		}
	}

	@Override
	public int compareTo(Patient o) {
		if (age == o.age) {
			return 0;
		}else if(age > o.age) {
			return 1;
		}else {
			return -1;
		}
	}
}