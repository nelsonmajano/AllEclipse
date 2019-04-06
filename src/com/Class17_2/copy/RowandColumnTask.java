package com.Class17_2.copy;

public class RowandColumnTask {

	public static void main(String[] args) {
		/*Print pattern
		 * ******-->row=4, columns=6:
		 * *    *
		 * *    *
		 * ******
		 */
		
	for (int a=1; a<=4; a++) {
	for (int b=1; b<=6; b++) {
	
		if (a==1 || a==4 || b==1 || b==6) {
	System.out.print("*");
		}else {
	System.out.print(" ");
	}
	}
	System.out.println();
		}
	}
}
