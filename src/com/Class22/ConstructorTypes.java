package com.Class22;

public class ConstructorTypes {

	ConstructorTypes(){
		System.out.println(" I am a constructor with no peremeters");
	}
	ConstructorTypes(String str) {//str a local variable to a constructor
		System.out.println(" I am a constructor with peremeters "+str);
	}
	ConstructorTypes(int  a, String str){
		System.out.println("I am a constructor with two peremeters "+a+" and "+str);
		
		
	}
	public static void main(String[] args) {
		
		ConstructorTypes obj1= new ConstructorTypes("String");
		
		ConstructorTypes obj2= new ConstructorTypes("String");
		
		ConstructorTypes obj3= new ConstructorTypes(123,"String");
		
		
	}
}
