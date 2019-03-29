package com.class4;

public class Nestedif {
/*
 * Write a program to check work eligibility 
 * if user is younger than <16--> not allowed to work 
 * otherwise --> allow to work. if user is younger than 64--> got to work
 * 									otherwise -->enjoy your life
 *
 */
	public static void main(String[] args) {
	
		int age=18;
		int eligibleAge=16;
		int retirementAge=64;
		if (age<eligibleAge) {
			System.out.println("you are too young, no work for you");
			}else {
				System.out.println("you are eligible at work");
				if (age<retirementAge) {
					System.out.println("go work hard");
				}else {
					System.out.println("Please enjoy yout life . You do need to work");
					
					
					
					
				}
			}
		
		
	}
	
		
	

}
