package com.Class14;

public class GroupTask {

	private static Object str1;
	private static Object str2;

	public static void main(String[] args) {
		//1. Write a program to swap 2 numbers without a 
		//temporary variable swap 2 strings without a temporary varibale?? 

		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("The value of a="+a+" value of b="+b);

		String str1="Hello";//5
		String str2="World";//5
		
		str1=str1+str2;//HelloWorld-->10
		str2=str1.substring(0, str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());
		
		System.out.println("The value of str1="+str1+" value of str2="+str2);
		
	        
	        
	        //2.write a java program to find the second largest number 
	       // in the array? Maximum and minimum number in the array?
	        
	        int[] array = { 1, 23, 56, 78, 67, 89, 87 };

	        int highest = 0;
	        int secondHighest = 0;

	        // Loop over the array
	        for (int i = 0; i < array.length; i++) {

	            // If we've found a new highest number... 
	            if (array[i] > highest) {

	                // ...shift the current highest number to second highest
	                secondHighest = highest;

	                // ...and set the new highest.
	                highest = array[i];
	            } else if (array[i] > secondHighest)
	                // Just replace the second highest
	                secondHighest = array[i];
	            
	        }
	        System.out.println(secondHighest);
	//part 3. find out how many alpha characters present is a string;
	        String str2 = "nelson";
	        String NoNum = str2.replaceAll("[^a-z]", "");
	        System.out.println(NoNum.length());
	
	//part 4 
	  //1st part.How to find out the part of the string from a string?
	     
	        String ss ="# STRING_VALUES #";
	        String[] parts = ss.split("#");
	        System.out.println(parts[1].trim());
	 
	 //2nd part //what is substring?
	        String str = "# STRING_VALUES #";
	    	String result = str.substring(2,str.length()-2);
	    	       
	 //3rd part //find the number of words in string?
	    	String numbers = "#STRING_VALUES #";
	    	
	   //part 5
	    	//Write a program to reverse string? Reverse a string word by word?
	    	 System.out.println("---Task 5 | Part 1---");

	           String str1="This is in reverse:";
	           System.out.println(str1);
	           char [] array1=str1.toCharArray();
	           for (int i=array1.length-1;i>=0;i--) {
	           System.out.print(array1[i]);
	       }
	           System.out.println("");
	           System.out.println("---Task 5 | Part 2---");

	           String str3="This is in reverse:";
	           System.out.println(str3);
	           String [] array3=str3.split(" ");
	           for (int i=array1.length-1;i>=0;i--) {

	           System.out.print(array1[i]);


	}
	}}


