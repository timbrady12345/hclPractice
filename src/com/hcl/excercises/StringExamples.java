package com.hcl.excercises;
import java.util.StringTokenizer;

public class StringExamples {

	public static void main(String[] args) {
		
		System.out.print("Split Name Tokenizer:\n");
		StringTokenizer nameSplit = new StringTokenizer("Timothy_Andrew_Brady", "_");
		while(nameSplit.hasMoreTokens()) {
			System.out.println(nameSplit.nextElement());
		}
		
		System.out.print("\nSplit Date Tokenizer:\n");
		StringTokenizer dateSplit = new StringTokenizer("02/03/2022", "/");
		while(dateSplit.hasMoreTokens()) {
			System.out.println(dateSplit.nextElement());
		}
		
		System.out.print("\nStringBuilder Insertion:\n");
		StringBuilder strInsert = new StringBuilder("Timothy Andrew Brady");
		strInsert.append(" information to append");
		System.out.println(strInsert);
		
		System.out.print("\nString Replacement:\n");
		String name = new String("Timothy_Andrew_Brady");
		System.out.println(name.replace('_', ':'));
		
	}
}
