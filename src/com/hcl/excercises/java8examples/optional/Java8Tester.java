package com.hcl.excercises.java8examples.optional;

import java.util.Optional;

public class Java8Tester {
	public static void main(String args[]) {
		Java8Tester java8Tester = new Java8Tester();
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		Optional<Integer> a = Optional.ofNullable(value1);
		
		Optional<Integer> b = Optional.of(value2);
		System.out.println(java8Tester.sum(a,b));
	}
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());
	
		Integer value1 = a.orElse(new Integer(0));
		
		Integer value2 = b.get();
		return value1 + value2;
	}
}
