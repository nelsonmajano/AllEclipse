package com.Class15;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		/*
		 * Write anJava Program find whether a String is palindrome or not?
		 * (dad, mom, madam)
		 *
		 */
		
		Scanner scan=new Scanner (System.in);
	    System.out.println("Please Enter any word to check if its a polindrome");
	    String word=scan.nextLine();
	    
	    String reverse1="";
	    for (int i=word.length()-1; i>=0; i--) {
	        reverse1+=word.charAt(i);
	    }
	    if (word.equalsIgnoreCase(reverse1)) {
	        System.out.println("The word is a palindrome");
	    }else {
	        System.out.println("its all good");
	    }
	}

}
