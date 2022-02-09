package com.hcl.excercises.java8examples.stream;

import java.util.*;

public class StreamEx3 {

	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<Person>();
		peopleList.add(new Person(10000, "Tim", 31));
		peopleList.add(new Person(50000, "Brian", 32));
		peopleList.add(new Person(7000, "Scott", 23));
		peopleList.add(new Person(15000, "Kyle", 45));
		peopleList.add(new Person(30000, "Dyle", 90));
		peopleList.add(new Person(400, "Catherine", 11));
		Person personA = peopleList.stream().max((person1, person2) -> person1.salary > person2.salary ? 1 : -1)
				.get();
		Person personB = peopleList.stream().min((person1, person2) -> person1.salary > person2.salary ? 1 : -1)
				.get();
		System.out.println(personA.name);
		System.out.println(personB.name);
	}
}
