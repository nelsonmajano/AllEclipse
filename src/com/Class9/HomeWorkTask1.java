package com.Class9;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main (String[] args) {
		/*1. Write a program that reads a range of integers (start and end point), provided by a user and then from that range 
		prints the sum of the even and odd integers*/

	Scanner scan;
	int startRange, endRange;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter Start range");
    startRange=scan.nextInt();
    
    System.out.println("Please enter End point");
    endRange=scan.nextInt();
    
    int sumOdd=0, sumEven=0;
    for (int x=startRange; x<=endRange; x++) {
     
    	if (x%2==0) {
    		sumEven+=x;
    	}else {
    		sumOdd+=x;
    	}
    	}
	System.out.println("odd total is: " +sumOdd+ "Even total is: "+sumEven);
	}	
}

