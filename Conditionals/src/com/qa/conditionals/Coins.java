package com.qa.conditionals;


import java.math.*;

public class Coins {

	public static void main(String[] args) {
		String str = "yesterdy it was raining today it is sunny";
		String[] str1 = str.split(" ");
		change(50.20, 91);
		change(132, 203);
		change(50.20, 68.01);
	}
	public static double[] giveChange(double change, double giveCha) {
		double count = 0;
		double[] countChange = new double[2];
		BigDecimal changeBg;
		BigDecimal giveChaBg;
		while(change >= giveCha) {
			changeBg = BigDecimal.valueOf(change);
			giveChaBg = BigDecimal.valueOf(giveCha);
			changeBg = changeBg.subtract(giveChaBg);
			change = changeBg.doubleValue();
			count++;
		}
		countChange[0] = count;
		countChange[1] = change;
		return countChange;
	}
	
	public static void change(double price, double paid) {
		double twentyPoundTotal = 0;
		double tenPoundTotal = 0;
		double fivePoundTotal = 0;
		double twoPoundTotal = 0;
		double	onePoundTotal = 0;
		double fiftyPenceTotal = 0;
		double twentyPenceTotal = 0;
		double tenPenceTotal = 0;
		double fivePenceTotal = 0;
		double twoPenceTotal = 0;
		double onePenceTotal = 0;
		BigDecimal paidBg;
		BigDecimal priceBg;
		paidBg = BigDecimal.valueOf(paid);
		priceBg = BigDecimal.valueOf(price);
		paidBg = paidBg.subtract(priceBg);
		double change = paidBg.doubleValue();
		while(change != 0) {
			double[] data = giveChange(change, 20); 
			twentyPoundTotal = data[0]; change = data[1];
			data = giveChange(change, 10); 
			tenPoundTotal = data[0]; change = data[1];
			data = giveChange(change, 5); 
			fivePoundTotal = data[0]; change = data[1];
			data = giveChange(change, 2); 
			twoPoundTotal = data[0]; change = data[1];
			data = giveChange(change, 1); 
			onePoundTotal = data[0]; change = data[1];
			data = giveChange(change, 0.50); 
			fiftyPenceTotal = data[0]; change = data[1];
			data = giveChange(change, 0.20); 
			twentyPenceTotal = data[0]; change = data[1];
			data = giveChange(change, 0.10); 
			tenPenceTotal = data[0]; change = data[1];
			data = giveChange(change, 0.05); 
			fivePenceTotal = data[0]; change = data[1];
			data = giveChange(change, 0.02); 
			twoPenceTotal = data[0]; change = data[1];
			data = giveChange(change, 0.01); 
			onePenceTotal = data[0]; change = data[1];
		}
		ifGreaterThanPrint(twentyPoundTotal, "?20");
		ifGreaterThanPrint(tenPoundTotal, "?10");
		ifGreaterThanPrint(fivePoundTotal, "?5");
		ifGreaterThanPrint(twoPoundTotal, "?2");
		ifGreaterThanPrint(onePoundTotal, "?1");
		ifGreaterThanPrint(fiftyPenceTotal, "50p");
		ifGreaterThanPrint(twentyPenceTotal, "20p");
		ifGreaterThanPrint(tenPenceTotal, "10p");
		ifGreaterThanPrint(fivePenceTotal, "5p");
		ifGreaterThanPrint(twoPenceTotal, "2p");
		ifGreaterThanPrint(onePenceTotal, "1p");
		
	}
	public static void ifGreaterThanPrint(double val, String valName) {
		if(val > 0) {
			System.out.println(val + " x " +  valName);
		}
	}

}
