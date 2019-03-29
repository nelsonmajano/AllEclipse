package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
/*
 * Ask user to enter city and temperature in Fahrenheit 
 * Your program should convert F-->C
 * Your program should say "Temperature in the city ___is
 */
	public static void main(String[] args) {
		String cityname;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityname=myScanner.nextLine();
		
		System.out.println("Please enter tempearture in Fahrenheit");
		
		temp=myScanner.nextInt();
		//formula (F -32) x 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("the temperature in the city"+cityname+"is"+convertedTemp);
		
		
		
				
		
				
		
	}
}
