package com.Class13;

public class StringReview {

	public static void main(String[] args) {
		
//		Create a String and print it in reverse order (Sunday → yadnuS).
//

	
	
		 String []day= {"S","u","n","d","a","y"};
	        String [] reverse= new String [6];
	        for (int i=5; i>=0; i--) {
	        
	            reverse [5-i]=day[i];
	        }
	        for (int a=0; a<6; a++) {
	System.out.print(reverse[a]);
	        }
	    }
	
	}
