package com.Class14;

public class StringManipulations1 {

	public static void main(String[] args) {
	
		//toCharArray()
		
		String Str= "Saturday";
		
		char[] array=Str.toCharArray();
		for (int i=0; i<array.length; i++) {
		
			System.out.println(array [i]);
			}
	for (char c :array) {
		System.out.println(c);
	}
//
	for (int i=array.length-1; i>=0; i--) {
	System.out.println(array[i]);
	}
}
}