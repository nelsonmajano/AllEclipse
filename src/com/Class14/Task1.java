package com.Class14;

public class Task1 {

	public static void main(String[] args) {
//		create a String that will hold a sentence. 
//		Write a program to get a new String without any spaces
//task1:

		String sentences="Have A Great Weekend";
        String newStr=sentences.replace(" ", "");
          System.out.println(newStr);
	
          
//task2:
//        Create a String that should be combination 
//        of letters, numbers and special characters. 
//        Find out how many alpha characters are there in the String.
	
          String str1="12Hello 3234 World 465^%";
  		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
  		System.out.println(replacedNoNumbers);
  		
  		String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
  		System.out.println(newString);
	

//task3:
// 		You have a String a="Is it Saturday? Is it
//		raining? Do we have a Java Class today?"
//		How would you find out how many sentences are in that String?

	String str="Is it saturday? Is it raining? Do we have a Java Class today?";
	String []sentences1=str.split("[?]");
	System.out.println(sentences1.length);
	
}
}



