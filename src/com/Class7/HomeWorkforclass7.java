package com.Class7;

import java.util.Scanner;

public class HomeWorkforclass7 {

	public static void main(String[] args) {
		
		//Ask user to pay for a soda
		//keep asking user to pay for soda until entered price is not equal to 1.99
		//after user got a right amount print "Please enjoy your soda"
		
		
	Scanner scan;
	double sodaprice=1.99;
	
	scan= new Scanner(System.in);
	do {
	System.out.println("PLease enter you payment for soda");
		sodaprice=scan.nextDouble();
		
	}while(sodaprice!=1.99);
	
		System.out.println(" Please enjoy your soda");
	}
}