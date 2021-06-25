package com.qa.conditionals;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
		System.out.println(fizzBuzz(6));
		System.out.println(fizzBuzz(10));
		System.out.println(fizzBuzz(4));

	}
	
	public static String fizzBuzz(int val) {
		if(val % 3 == 0 && val % 5 == 0) {
			return "FizzBuzz";
		} else if(val % 3 == 0) {
			return "Fizz";
		} else if(val % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(val);
		}
	}

}
