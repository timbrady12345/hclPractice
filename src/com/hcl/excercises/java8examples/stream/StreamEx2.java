package com.hcl.excercises.java8examples.stream;

import java.util.*;
import java.util.function.Predicate;

public class StreamEx2 {

	static Predicate<Person> pre1 = p -> p.age > 30; 
	static Predicate<Person> pre2 = p -> p.salary > 10000; 
	static Predicate<Person> pre3 = p -> p.name.startsWith("B"); 
	static Predicate<Person> pre4 = p -> p.name.startsWith("D"); 
	
	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<Person>();
		peopleList.add(new Person(10000, "Tim", 31));
		peopleList.add(new Person(50000, "Brian", 32));
		peopleList.add(new Person(7000, "Scott", 23));
		peopleList.add(new Person(15000, "Kyle", 45));
		peopleList.add(new Person(30000, "Dauri", 90));
		peopleList.add(new Person(400, "Catherine", 11));
		peopleList.stream().filter(pre1)
		.filter(pre2)
		.filter(pre3)
			.map(pm -> pm.name)
			.forEach(System.out::println);
		peopleList.stream().filter(pre1)
		.filter(pre2)
		.filter(pre4)
			.map(pm -> pm.name)
			.forEach(System.out::println);
	}
}
