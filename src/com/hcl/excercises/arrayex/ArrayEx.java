package com.hcl.excercises.arrayex;

import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		//An arraylist is used here to enter data into a list and allow for easy access of details from
		//the EmployeeDetails object
		ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>();
		al.add(new EmployeeDetails(10, "Timothy", "Woodbury"));
		al.add(new EmployeeDetails(4, "Andrew", "Kingstown"));
		al.add(new EmployeeDetails(7, "Brady", "Vernon"));
		
		for(EmployeeDetails e : al) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getCity());
		}System.out.print("\n");
		
		//A map would be used to enter information in Key-Value pairs (K, V) where the user
		//could query for a key and be returned the value based on the requested key
		
		//A Hashset would be used to store the data in an unordered list and would also not allow
		//for duplicate values to be entered into the list. 
		
//		Set<EmployeeDetails> m = new HashSet<EmployeeDetails>();
//		m.add(new EmployeeDetails(10, "Timothy"));
//		m.add(new EmployeeDetails(4, "Andrew"));
//		m.add(new EmployeeDetails(7, "Brady"));
//		
//		for(EmployeeDetails e : m) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getCity());
//		}System.out.print("\n");
	}
}
