package com.Class17_2.copy;

public class ColumnPattern {

	public static void main(String[] args) {
		// print 4 rows 
		ColumnPattern column=new ColumnPattern();
		
		column.Printpattern();
	}
	void Printpattern() {
		for (int a =0; a<4; a++) {
		for (int b=0; b<=a; b++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
