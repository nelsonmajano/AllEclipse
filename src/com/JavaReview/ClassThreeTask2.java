package com.JavaReview;

import java.util.Scanner;

public class ClassThreeTask2 {

	public static void main(String[] args) {
		
//		/Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should equal 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
        // If the age is greater than 60 print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner

 Scanner scan;
 int age;
 
  scan=new Scanner(System.in);
  System.out.println("Please enter age");
  age=scan.nextInt();
  
  if (!(age>=18)) {   
      System.out.println("Your too young");
  }else if (age>=18 && age<=35) {
	  System.out.println("Young person");
  }else if (age==36 || age==99) {
      System.out.println("You are a Middle age Person");
  }else {
  System.out.println("Your too old");
		}	
	}
}
