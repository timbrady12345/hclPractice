package com.hcl.excercises.java8examples;

public class LambdaEx {

	interface math{
		int duo(int a, int b);
	}

		public static void main(String[] args){
			math add = (a,b) -> a + b ;
			math sub = (a,b) -> a - b ;
			math mul = (a,b) -> a * b ;
			math div = (a,b) -> a / b ;
			System.out.println(add.duo(2,3));
			System.out.println(sub.duo(10,3));
			System.out.println(mul.duo(10,3));
			System.out.println(div.duo(12,3));
		}

}
