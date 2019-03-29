package com.Class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		//Prompt user to ask the name 3 times 
		//Print  "You are doing great____"

	Scanner scan;
	String name;
	scan = new Scanner(System.in);
	int a =1;
	
	while (a<=3) {
		System.out.println("Please enter your name");
		
		System.out.println("Pleae enter your name");
		name =scan.nextLine();
		System.out.println("you are doing great " +name);
		
		a++;		
		}	
	}
}
