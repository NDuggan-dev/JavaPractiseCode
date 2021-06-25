package com.qa.conditionals;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(play(10, 21));
		System.out.println(play(20, 18));
		System.out.println(play(22, 1));
		System.out.println(play(22, 23));

	}
	
	public static int play(int num1, int num2) {
		if(num1 > 21 && num2 > 21) {
			return 0;
		} else {
			if((num1 > num2 && num1 <= 21) || (num1 <= 21 && num2 > 21)) {
				return num1;
			}else {
				return num2;
			}
		}
	}
}
