package com.Class17_2.copy;

public class PatternNestedLoopTask {

	public static void main(String[] args) {
		/*I want to print pattern
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */

		for (int a=5; a>1; a--) {
			for (int b=5; b>0; b--) {
				System.out.print(b);
			}
				System.out.println();
		}
	}
}
