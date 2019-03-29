package com.JavaReview;

public class ClassFourTask2 {

	public static void main(String[] args) {
		//Write a program that prints the String "the time is 07:min and then all the mins till 7:30

		for (int i=0; i<=30; i++) {
			if (i <10) {
			System.out.println("the time is 7:0" +i);
			
			}else {
				System.out.println("The time is 7:" +i);
			}
		}
   int min =0;
   while (min <= 30) {
	   if (min < 10) {
		   System.out.println("The  time is 7:0" +min);
	  
	   }else {
		   System.out.println("The time is 7:30" +min);
	   		}
   		}
	}
}   
