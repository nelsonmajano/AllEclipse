package com.Class8;

public class TaskForLoops1 {

	public static void main(String[] args) {
		
		for (int a =1; a<=100; a++) {
		
			System.out.println(a);
	}
	
	for (int b =100; b>=1; b--) {
		
		System.out.println(b);
	}
	//odd first way
	for (int c =1; c<=20; c++) {
		
		if (c%2!=0) 
			System.out.println(c);
		
	}
	//odd second way
	for (int d =1; d>=20; d+=2) {
		System.out.println(d);
	}
	// add -- counting down #4
	for (int e =20; e>=1; e-=2) {
		
		System.out.println(e);
			}
	for (int e =20; e>=1; e--) {
		
		if (e%2!=0) {
			 System.out.println(e);
			}
		}
	}
}