package com.Class26;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I have no parameters");
	}
	ThisWithConstructor(String str){
		this();
		System.out.println("I have 1 String parameters "+str);
	}
		ThisWithConstructor(String str1, String str2){
		this(str1);
			System.out.println("I have 2 String parameters "+str1+" "+str2);
	}
		public static void main(String[] args) {
			
	
}
}