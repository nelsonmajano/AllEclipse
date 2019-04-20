package com.Class26;

public class SuperWithConstructors {
	SuperWithConstructors() {
		System.out.println("I am a parent class constructor");
	}
	SuperWithConstructors(String str) {
		System.out.println("I am a parent class constructor with 1 parameter");
	}
	
}

class ChildOfSuperWithConstructor extends SuperWithConstructors {
	
	ChildOfSuperWithConstructor() {
		super("Hello");
		System.out.println("I am a child class constructor");
	}
}