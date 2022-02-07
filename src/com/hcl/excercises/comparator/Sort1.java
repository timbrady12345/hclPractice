package com.hcl.excercises.comparator;
import java.util.*;
public class Sort1 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "Tim", 23));
		al.add(new Employee(2, "Othy", 27));
		al.add(new Employee(3, "Brady", 10));
		
		Collections.sort(al);
		for(Employee e : al) {
			System.out.println(e.id + " " + e.name + " " + e.age);
		}
	}

}
