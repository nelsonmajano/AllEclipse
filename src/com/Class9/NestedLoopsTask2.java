package com.Class9;

public class NestedLoopsTask2 {

	public static void main(String[] args) {

		for(int i=0; i<=5;  i++) {
			System.out.println(i);
		}
		
		/*I want to print pattern
		 * 12345 --> 4 roes & 5 columns 
		 * 12345
		 * 12345
		 * 12345
		 */
	
		for (int i=1; i<5; i++) {
			for (int y=1; y<6; y++) {
		System.out.print(y); //12345
			}
			System.out.println();
			}
		

/*1111111
 2222222
 3333333
 4444444
 5555555
 6666666
 7777777
*/

for (int i=1; i<7; i++) {
	
	for (int y=1; y<=7; y++) {
		System.out.print(i);
	}
	System.out.println();
			}
		}
	}