package com.hcl.excercises.java8examples.stream;

import java.util.*;

public class StreamEx {
	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<Person>();
		peopleList.add(new Person(1, "Tim", 21));
		peopleList.add(new Person(2, "Brian", 22));
		peopleList.add(new Person(3, "Scott", 13));
		peopleList.add(new Person(4, "Kyle", 15));
		peopleList.add(new Person(5, "Catherine", 11));
		long count = peopleList.stream().filter(p -> p.age > 14).count();
			System.out.print(count);
	}
}
