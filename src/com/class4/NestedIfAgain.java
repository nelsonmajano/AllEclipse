package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		
		double gpa= 3.6;
		double expectedGpa=3.7;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("congradulations");
			if (gpa>expectedGpa) {
				System.out.println("you are hired");
			}else {
				System.out.println("unfortunetly we connot hire you");
				}
		}else {
			System.out.println("Please get yout degree");
			
		}
				
				
		

	}

}
