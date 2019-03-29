package com.class4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//take a number from a user and print that number
		//Scanner= ask system to provide input
		//system.in= key board enable key board input
		//
		int num=22;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter any number");
		int myNumber=scan.nextInt();
		
		System.out.println("The number you entered is"+myNumber);
		
		
		
	}
}
