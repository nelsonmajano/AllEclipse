package com.Class26;

public class SuperKeyWord {
String name="John";

public void sayName() {
	System.out.println("My name is "+name);
}
}
class ChildOFSuperKeyWord extends SuperKeyWord {
	
	String name="Michael";
	
	public void sayName() {
		System.out.println("My name is "+super.name);
		System.out.println("Child name is "+name);
	}

public void callingMethods() {
	sayName();//this.sayName
	super.sayName();
}
}