package com.JavaReview;

public class ClassThreeTask1 {

	public static void main(String[] args) {
		
//		/ Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear winter clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		
		
		int temp=0;
		
		if (temp>=100) {
		System.out.println("Stay inside it's too hot");
	}else if (temp>=50 && temp<=99) {
		System.out.println("Wear winter clothes");
	}else if (temp>=30 && temp<=49) {
		System.out.println("Wear winter clothes");
	}else if (temp>=10 && temp<=29) {
	System.out.println("Stay inside it's too cold");
	}else {
		System.out.println("Call for help it's too cold outside");
		}
	}
}