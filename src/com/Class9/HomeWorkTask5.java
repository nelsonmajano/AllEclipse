package com.Class9;

import java.util.Scanner;

public class HomeWorkTask5 {

	public static void main(String[] args) {
//		Write a guessing game where the user has to guess a secret number between 1 and 20. 
//		After every guess input, the program tells the user whether their number was too large or too small. 
//		The program will keep asking the user to enter the number until he finds the correct number. 
//		When the correct answer is found the system should display "Congratulations!!. You got it!".

		
		Scanner scan;
		int secret, userNumber;
		
		secret=13;
		scan=new Scanner(System.in);
		System.out.println("Please Enter the number from 1 to 20");
		do {
			
			userNumber=scan.nextInt();
		
		if (userNumber<secret) {
			System.out.println("Number is too samll");
		}else if (userNumber>secret) {
			System.out.println("Number is too large");
		}
	} while(secret!=userNumber);
		{
	System.out.println("Congratulation! you got it!");
	}
  }
}