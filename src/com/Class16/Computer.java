package com.Class16;

public class Computer {
 boolean mouse, keyboard;
 int screen, ram;
 String os, brand;
 
public static void main(String[] args) {
	
	Computer comp1= new Computer();
	comp1.mouse=true;
	comp1.keyboard=true;
	comp1.screen=8;
	comp1.os="Windows";
	comp1.brand="HP";
	
	comp1.watchMovie();
	comp1.doJavacoding();
	comp1.playMusic();
	System.out.println("-----second object----");
	
	//2nd object
	Computer comp2=new Computer();
	comp2.mouse=false;
	comp2.keyboard=false;
	comp2.screen=4;
	comp2.os="MAc Os";
	comp2.brand="Apple";
	
	comp2.watchMovie();
	comp2.doJavacoding();
	comp2.playMusic();
}
void watchMovie() {
	System.out.println("We can watch movie on a computer "+brand);
}
void doJavacoding() {
System.out.println("We can do Java coding on our computer");
}
void playMusic() {
	System.out.println("We can play music on our computer "+brand);
}
}