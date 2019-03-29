package com.JavaReview;

import java.util.Scanner;

public class ClassTwoTask4 {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter name");
		
		String name=input.nextLine();
	
		System.out.println("What is Gender");
		
		String gender=input.nextLine();
		
		System.out.println(" What is Age");
		
		int age=input.nextInt();
		
		System.out.println("What is mobile number");
		
		long mobilenumber=input.nextLong();
		
		System.out.println("Name " +name);
		System.out.println("Gender " +gender);
		System.out.println("Age "+age);
		System.out.println("Mobile number "+mobilenumber);
		
		
		
		
	}

}
