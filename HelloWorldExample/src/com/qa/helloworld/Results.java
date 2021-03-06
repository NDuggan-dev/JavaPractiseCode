package com.qa.helloworld;

public class Results {
	public static void main(String[] args) {
		percentage(results(75, 25, 30));
	}
	
	public static int results(int bioResult, int chemResult, int phyResult) {
		System.out.println("Biology result " + bioResult + "/150" );
		System.out.println("Chemistry result " + chemResult + "/150" );
		System.out.println("Physics result " + phyResult + "/150" );
		int totalMark = (phyResult + bioResult + chemResult);
		System.out.println("Total Mark " + totalMark + "/450" );
		return totalMark;
	}
	
	public static void percentage(int totalMark) {
		double doubleTotalMark = totalMark;
		double percent = (doubleTotalMark/450)*100;
		int iPrecent = (int) Math.round(percent);
		System.out.println("Overall percent: " + iPrecent + "%");
	}
	

}
