package com.qa.conditionals;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> meat = new ArrayList();
		meat.add("Chicken");
		meat.add("Duck");
		meat.add("Beef");
		meat.add("Steak");
		
		
		Collections.sort(meat);
		
		for(String m : meat) {
			System.out.println(m);
		}
		System.out.println(meat);
		
		
		for(int i = 0; i < meat.size(); i++) {
			System.out.println(meat.get(i));
		}
		
		for(String m : meat) {
			System.out.println(m);
		}
		
		meat.get(0);
		meat.set(2, "Pork");
		meat.remove(2);	
		meat.add("Pork");
		meat.add("Turkey");
		
		@SuppressWarnings("unchecked")
		ArrayList<String> meatCopy = (ArrayList<String>) meat.clone();
		System.out.println(meatCopy);
	}

}
