package com.Class7;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		
		int a=10;
		
		do { //Executes first then checks condition
			System.out.println("Hello");
			a++;
			
		} while(a<15);
		//------------------------------------------
		
		int b= 10;
		
		while (b<15) {//Check condition and then executes
			System.out.println("Bye");
			b++;
		}
	}
}