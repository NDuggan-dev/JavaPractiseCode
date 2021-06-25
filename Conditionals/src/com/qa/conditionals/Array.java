package com.qa.conditionals;

public class Array {
	
	public static void main(String[] args) {
		
		//Create an array that will hold 10 integer values
		int[] tenValueArray = new int[10];
		
		//Populate the array with values
		tenValueArray[0] = 5;
		tenValueArray[1] = 5;
		tenValueArray[2] = 5;
		tenValueArray[3] = 5;
		tenValueArray[4] = 5;
		tenValueArray[5] = 5;
		tenValueArray[6] = 5;
		tenValueArray[7] = 5;
		tenValueArray[8] = 5;
		tenValueArray[9] = 5;
		
		//for every object in the array
		for(int i : tenValueArray) {
			//print each element
			System.out.println(i);
		}
				
		
		//for loop populating integer array
		for(int index = 0; index < tenValueArray.length; index++) {
			tenValueArray[index] = 5;
			System.out.println(tenValueArray[index]);
		}
		
		for(int i = 0; i < tenValueArray.length; i++) {
			tenValueArray[i] = tenValueArray[i] * 10;
		}
		
		//for every object in the array
		for(int i : tenValueArray) {
			//print each element
			System.out.println(i);
		}
	}
}
