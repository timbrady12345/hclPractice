package com.hcl.excercises.java8examples.optional;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[6] = "optional example";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		}else
			System.out.println("string not present");
	}
}
