package com.hcl.excercises.java8examples;

import java.util.*;
import java.util.function.BiFunction;

interface inter{
	void printer();
}

class math {
	public static int add(int a, int b) {
		return a+b;
	}
}

public class MethodReferenceEx{
	static void printer2() {
		System.out.println("Printed from printer");
	}
	
	static void printer3() {
		System.out.println("Printed from thread");
	}
	
	public static void main(String[] str) {
		inter intprint = MethodReferenceEx::printer2;
		intprint.printer();
		
		Thread t = new Thread(MethodReferenceEx::printer3);
		t.start();
		
		BiFunction<Integer, Integer, Integer> adding = math::add;
		int product = adding.apply(25, 25);
		System.out.println("Printed from BiFunction example: " + product);
	}
}
