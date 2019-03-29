package com.Class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		String str="Student";
		
		//char character=str.charAt(7);
		//System.out.println(character);
		
		for (int i=0; i<str.length(); i++ ) {
			System.out.println(str.charAt(i)+",");
			}
		System.out.println();
		
	//indexOf()=returns an index of specified character
		System.out.println("-----indexOf()-----");
		String str1="Sunday";
		
		int index=str1.indexOf("d");
		System.out.println(index);
		
		String str2="Syntax Technologies";
		
		System.out.println(str2.indexOf("Syntax"));//0
		System.out.println(str2.indexOf("Technologies"));//7
		System.out.println(str2.indexOf(" "));//6
		System.out.println(str2.indexOf("w"));//-1
		
		//substring() - gives anothetr string from your current String
		System.out.println("------ -------");
		
		String str3="Today is Sunday Java class";
		
		String newString=str3.substring(9);
		System.out.println(newString);
		
		System.out.println(str3.substring(0, 5));//Today
		System.out.println(str3.substring(9, 20));//SundayJava
		System.out.println(str3.substring(16, 20));//Java
	    System.out.println(str3.substring(21));//class
	}
}
		
