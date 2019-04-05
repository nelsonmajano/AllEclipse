package com.Class16;

public class Phone {
	String Iphone, Android, Nokia;
	
	
	public static void main (String[] args) {
		
		Phone phone1= new Phone();
		phone1.Iphone=("Ten plus");
		phone1.Android=("Galaxy");
		phone1.Nokia=("little square");
	
		phone1.call();
		phone1.text();
		phone1.play();
		 System.out.println("-----second object----");
		
		Phone phone2=new Phone();
		 phone2=new Phone();
		 phone2.Iphone=("Six plus");
		 phone2.Android=("Note");
		 phone2.Nokia=("idk");
	}
	void call() {
		System.out.println("Car can drive");
		}
	void text() {
		System.out.println("Car can reverse");
	}
	void play() {
		System.out.println("Car can stop");
	}
}
