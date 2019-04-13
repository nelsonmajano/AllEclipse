package com.Class22;

public class Car {
 
	public static String make ="Toyota";
	String color;//declaring instance variable
	String model;
	int doors;
	
	Car() {//constructor with NO peremeters
		System.out.println(" I am a constructor");
		System.out.println(" Hello from con contrustor");
	}
public static void main(String[] args) {
	
	Car obj =new Car();
	hello();
	}
public static void hello() {
	//before you use a variable you have to initialize it
	String name;
	//System.out.println(name); compiler will give you error 
	
	System.out.println(" I am a static, hello method? ");
	}
}

