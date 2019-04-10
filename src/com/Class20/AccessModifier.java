package com.Class20;

public class AccessModifier {
	
	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		String reversed=obj.reversedString("hello");
		System.out.println(reversed);
	}
	/*create method that will take 1 peremeter as a String 
	 * and return reversed String.
	 * Method should be visibly only within same package.
	 * 
	 */

	protected String reversedString (String str) {
		 
		String reversed="";
		
		for (int i=str.length()-1; i>=0; i-- ) {
			
			reversed = reversed+str.charAt(i);
		}
		return reversed;
	}

/*
 * Create a method that will take a String and 
 * return whether String is palidrome or not.
 * Method should be available to all access to all classes within your projects.
 */

	public boolean isPalidrome(String str) {
		
		
	}



}
