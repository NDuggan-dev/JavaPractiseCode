package com.qa.conditionals;

public class QuestionOne {

	public static void main(String[] args) {
		System.out.println(addOrMultiply(1, 2, false));

	}
	
	public static int addOrMultiply(int value1, int value2, boolean tOrF) {
		if(tOrF) {
			return value1 + value2;
		} else {
			return value1*value2;
		}
	}

}
