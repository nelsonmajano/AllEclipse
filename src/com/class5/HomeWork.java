package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		//Create a program that will take a boolean value from user make the 
		//Variable isTrue. if the inputs is True or False then output should read.
		//First Output: "Input the boolean value"
		//Final Output: "The value is_____"
		
		boolean isTrue;
		
		Scanner boolinput= new Scanner(System.in);
		
		System.out.println("Input the boolean value");
		
		isTrue= boolinput.nextBoolean();
		
		System.out.println("The value is " +isTrue);
				
	}

}
