package com.qa.helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(sumOfTwoAddedNumbers(7, 5));
		System.out.println(sumOfTwoMultipliedNumbers(7,5));
		System.out.println(sumOfTwoSubtractedNumbers(7,5));
		System.out.println(sumOfTwoDividedNumbers(7,5));
		
	}


public static String printMessage() {
	return "Hello World";
}

public static int sumOfTwoAddedNumbers(int value1, int value2) {
	int sum = value1 + value2;
	return sum;
}

public static int sumOfTwoMultipliedNumbers(int value1, int value2) {
	int sum = value1 * value2;
	return sum;
}

public static int sumOfTwoSubtractedNumbers(int value1, int value2) {
	int sum = value1 - value2;
	return sum;
}

public static double sumOfTwoDividedNumbers(double value1, double value2) {
	double sum = value1/value2;
	return sum;
}

}