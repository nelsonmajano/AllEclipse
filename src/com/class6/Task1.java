package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter temperature");
		temp=scan.nextInt();
		 if (temp>=40 && temp<=80) {
			 System.out.println("is it raining");
			 rain=scan.nextBoolean();
			 if (rain) {
				activity="Watch a movie";
			 }else {
				 activity="Go hiking";
			 }
			 }else if (temp>25 && temp <40) {
				 System.out.println("is it snowing");
				 snow=scan.nextBoolean();
				 if (snow) {
					 activity = "snowboarding";
				 }else {
					 activity ="Lets code";
				 }
			 }else if (temp >=80) {
				 System.out.println("Is it sunny");
				 sunny= scan.nextBoolean();
				if (sunny) {
				 activity ="Go to the beach";
			 }else {
				 activity ="Do more coding";
			 }
		 }else {
			 System.out.println("Please enter different temperatur");
			  activity= "Unknown";
		 }
		
		 System.out.println("My activity for today is " +activity);
	 }
			
	}