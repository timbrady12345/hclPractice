package com.hcl.excercises;

import java.util.stream.IntStream;

public class ParallelEx {
	public static void main(String[] args) {
		System.out.println("Normal Printing Method");
		
		IntStream range = IntStream.rangeClosed(1, 10);
		range.forEach(System.out::println);
		
		System.out.println("Parallel (faster) Printing Method");
		
		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.parallel().forEach(System.out::println);
	}
}
