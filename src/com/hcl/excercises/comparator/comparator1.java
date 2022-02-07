package com.hcl.excercises.comparator;

import java.util.*;

public class comparator1 {
	public static void main(String args[]) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Sandy", "MCA/07/LHK", 26));
		studentList.add(new Student("Bumbo", "RFC/78/DBE", 84));
		studentList.add(new Student("Pongus", "BDI/48/OGF", 53));
		studentList.add(new Student("BokChoy", "OJD/43/KNM", 10));
		Collections.sort(studentList);
		Iterator<Student> iterator=studentList.iterator();
		while(iterator.hasNext()) {
			Student student=(Student)iterator.next();
			System.out.println("Name: " + student.getName()+
					", " + "Info: "+student.getInformation()+
					", Number: "+student.getNummy());
		}
	}
}
