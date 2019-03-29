package com.Class9;

public class ColumnPattern {

	public static void main(String[] args) {
		// print 4 rows 
		
		for (int a =0; a<4; a++) {
		for (int b=0; b<=a; b++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
