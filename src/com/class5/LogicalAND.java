package com.class5;

import java.util.Scanner;

public class LogicalAND {

	public static void main(String[] args) {
		
		
		Scanner myScanner;
		int age;
		
		myScanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=myScanner.nextInt();
		
		if (age>=1 && age<3) {
			System.out.println("you are a baby");
		}else if (age>=3 && age<5) {
			System.out.println("you are a toddler");
		}else if (age>5 && age<13) {
			System.out.println("you are a kid");
		}else if (age>13 && age <20) {
		System.out.println("you are an adult");
		}else {
			System.out.println("you are a senior");
			}
		}
}