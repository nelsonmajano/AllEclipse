package com.Class15;

public class IQ8 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program first 10 numbers of FIbonacci series.
		 */
		
	int a=0;
	int b=1;
	int c=0;
	
	for (int i=0; i<10; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(a);
		}
	}

}
