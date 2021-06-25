package com.qa.conditionals;

public class EnhancedForLoops {

	public static void main(String[] args) {
		//
		String[] nArray = {"Niall", "Dean"};
		String[] sArray = {"Niall", "Dean", "Si", "Crouchy", "Niall"};
		printArray(sArray);
		printArray(nArray);		
		for(String s : sArray) {
			System.out.println(s);
		}
		
		int[] iArray = new int[20]; 
		int k = 1;
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = k++;
		}
		
		for(int i : iArray) {
			i = i*i;
			System.out.println(i);
		}
		
		for(int i :iArray) {
			if(returnTrueIfEven(i)) {
				i = i * i * i;
				System.out.println(i);
			} else {
				i = i * i;
				System.out.println(i);
			}
		}
		
		System.out.println(returnTrueIfEven(12));
		System.out.println(returnTrueIfEven(11));
	}
		
	public static void printArray(String[] stringArray) {
			for(String str : stringArray) {
				System.out.println(str);
		}
	}
	
	public static boolean returnTrueIfEven(int intValue) {
		if((intValue % 2) == 0) {
			return true;
		}else {
			return false;
		}
	}	
}
