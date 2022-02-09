package com.hcl.excercises.java8examples;

interface methods {
	//Default Method in interface
	default void def() {
		System.out.println("Default method is called");
	}
	//static method defined
	static void stPrint(String str) {
		System.out.print(str);
	}
}

interface functionalMethod {
	//Abstract method in interface -- function of method is not defined yet
		void abPrint(String str);
}

public class DefaultMethodEx implements methods, functionalMethod{
	//function of method is defined
	public void abPrint(String str) {
		System.out.println(str + " :)");
	}
		
	public static void main(String[] args) {
		DefaultMethodEx mx = new DefaultMethodEx();
		mx.def();
		mx.abPrint("Printing from the abstract method");
		//static method is called
		methods.stPrint("A static string");
	}
	
}
