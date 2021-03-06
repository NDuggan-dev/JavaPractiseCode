package com.qa.conditionals;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(unique(1, 3, 2));
		System.out.println(unique(3, 3, 3));
		System.out.println(unique(1, 2, 1));
	}
	
	public static int unique(int val1, int val2, int val3) {
		int sum = 0;
		sum += checkAddValue(val1, val2, val3);
		sum += checkAddValue(val2, val1, val3);
		sum += checkAddValue(val3, val1, val2);
		return sum;
	}
	
	public static int checkAddValue(int checkVal, int val2, int val3) {
		int value = 0;
		if(checkVal != val2 && checkVal != val3) {
			value += checkVal;
			return value;
		} else {
			return value;
		}
	}
}
