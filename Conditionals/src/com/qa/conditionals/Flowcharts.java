package com.qa.conditionals;

public class Flowcharts {

	public static void main(String[] args) {
		aLoop();
		aLoopTwo();
		printOneToTenTenTimes();
	}

	public static void aLoop() {
		for(int a = 100; a <= 200; a++) {
			System.out.println("A");
		}
	}
	
	public static void aLoopTwo() {
		for(int a = 100; a <= 200; a++) {
			if(a % 2 == 0) {
				System.out.println("-");
			}else {
				System.out.println("*");
			}
			a++;
		}
	}
	public static void printOneToTenTenTimes() {
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k < 10; k++) {
				System.out.println(k + 1);
			}
		}
	}
	
	
}
