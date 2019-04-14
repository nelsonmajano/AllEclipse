package com.Class22;

public class Child2 extends Parent {

	String hairType="curly";
	
	public static void main(String[] args) {
		
		Child2 childObject=new Child2();
		System.out.println("Child 2 eye color "+childObject.eyeColor);
		System.out.println("Child 2 hair color "+childObject.hairColor);
		System.out.println("Child 2 has "+childObject.nose+" nose");
		System.out.println("Child 2 has "+childObject.hairType+" hair types");
		childObject.sing();
		childObject.playSoccer();
		
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		
	}
	
	public void playSoccer() {
		System.out.println("Child 2 can play soccer");
	}
}