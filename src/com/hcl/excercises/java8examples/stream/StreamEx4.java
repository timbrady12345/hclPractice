package com.hcl.excercises.java8examples.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx4 {

	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<Person>();
		peopleList.add(new Person(10000, "Tim", 31));
		peopleList.add(new Person(50000, "Brian", 32));
		peopleList.add(new Person(7000, "Scott", 23));
		peopleList.add(new Person(15000, "Kyle", 45));
		peopleList.add(new Person(30000, "Dyle", 90));
		peopleList.add(new Person(400, "Catherine", 11));
		double totalSalary = peopleList.stream().collect(Collectors.summingDouble(p -> p.salary));
		System.out.println(totalSalary);
	}
}
