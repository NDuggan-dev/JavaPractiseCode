package com.qa.conditionals;

public class TeamTask {

	public static void main(String[] args) {
		recursion(1);
	}
	
	public static void recursion(int num) {
		if(num <= 3000) {
			System.out.println("print no: " + num++ + " Team 4");
			recursion(num);
		}
	}
}
