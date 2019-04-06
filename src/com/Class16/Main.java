package com.Class16; 

public class Main {
String breed, name, color;

	public static void main(String[] args) {

		Main dog1 = new Main();
		dog1.breed = "Husky";
		dog1.color = "Black";
		dog1.name = "cody";
		dog1.bark();
		dog1.run();
		dog1.play();

		Main dog2 = new Main();
		dog2.breed = "Bulldog";
		dog2.color = "White";
		dog2.name = "Rocky";
		dog2.bark();
		dog2.run();
		dog2.play();

		Main dog3 = new Main();
		dog3.breed = "Labrador";
		dog3.color = "Brown";
		dog3.name = "Rocko";
		dog3.bark();
		dog3.run();
		dog3.play();

	}

	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");

	}

	void play() {
		System.out.println(breed + " can play");
}
}