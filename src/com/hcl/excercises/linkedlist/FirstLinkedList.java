package com.hcl.excercises.linkedlist;

import java.util.LinkedList;

public class FirstLinkedList{
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		System.out.println(cars.getLast());
		cars.addLast("Mazda");
		System.out.println(cars);
		System.out.println(cars.getLast());
		cars.removeLast();
		System.out.println(cars);
		System.out.println(cars.getLast());
	}
}
//​​​​​​​​