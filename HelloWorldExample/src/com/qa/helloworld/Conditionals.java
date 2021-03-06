package com.qa.helloworld;

public class Conditionals {

	public static void main(String[] args) {
		int bioResult = 100;
		int chemResult = 120;
		int physResult = 30;
		calculatorRevisited(1,3);
		results(bioResult, chemResult, physResult);
		checkOverallPass(bioResult, chemResult, physResult);
		
		

	}

	private static void calculatorRevisited(double value1, double value2) {
		if(value1 < value2) {
			System.out.println(value1/value2);
		}
	}
	
	public static void results(int bioResult, int chemResult, int phyResult) {
		System.out.println("Biology result " + bioResult + "/150");
		System.out.println("Chemistry result " + chemResult + "/150" );
		System.out.println("Physics result " + phyResult + "/150" );
		int totalMark = (phyResult + bioResult + chemResult);
		System.out.println("Total Mark " + totalMark + "/450" );
	}
	
	public static boolean checkPassSubject(int subject) {
		boolean passed;
		if(subject > 60) {
			passed = true;
		} else {
			passed = false;
		}
		return passed;
	}
	
	public static int convertToPercent(int mark) {
		double doubleTotalMark = mark;
		if(doubleTotalMark > 150) {
			double percent = (doubleTotalMark/450)*100;
			int iPercent = (int) Math.round(percent);
			return iPercent;
		} else {
			double percent = (doubleTotalMark/150)*100;
			int iPercent = (int) Math.round(percent);
			return iPercent;
		}
	}
	
	public static void passedOrFailed(String subject, boolean passed, int percent) {
		if(passed) {
			System.out.println("Congratulations you passed: " + subject + " with " + percent + "%"); 
		} else {
			System.out.println("Unfortunately you have failed: " + subject + " with " + percent + "%");
		}
	}
	
	public static void checkOverallPass(int bioResult, int chemResult, int physResult) {
		int totalMark = (physResult + bioResult + chemResult);
		
		int totalMarkPerc = convertToPercent(totalMark);
		int chemMarkPerc = convertToPercent(chemResult);
		int bioMarkPerc = convertToPercent(bioResult);
		int physMarkPerc = convertToPercent(physResult);
		
		boolean chemPass = checkPassSubject(chemMarkPerc);
		boolean physPass = checkPassSubject(physMarkPerc);
		boolean bioPass = checkPassSubject(bioMarkPerc);
		boolean totalPass = checkPassSubject(totalMarkPerc);
		
		if(totalPass && chemPass && physPass && bioPass) {
			passedOrFailed("Overall", totalPass, totalMarkPerc);
	}	else if(!totalPass) {
			passedOrFailed("Overall", totalPass, totalMarkPerc);
			passedOrFailed("Chemistry", bioPass, chemMarkPerc);
			passedOrFailed("Biology", physPass, bioMarkPerc);
			passedOrFailed("Physics", chemPass, physMarkPerc);
	}	else {
		System.out.println("Error: cannot give feedback on results.");
		}
	}
	
	
}
