package com.JavaReview;

public class ClassFiveTask2 {

	public static void main(String[] args) {
		/**Write a program that prints the following pattern
		 * ....1
		 * ...2
		 * ..3
		 * .4
		 * 5
		 */
		
		
		for (int a=1; a<=5; a++) {
			for(int b= 1; b<=(5-a); b++) {
				System.out.print(".");
			}
		for(int l= 1; l<=a; l++);
		System.out.println(a);
		}
		System.out.println();

	}



//----------------------------------------------------------------------------------------------------------------------------------------------------------

										//ELEMENTS OF THE ARRAYS TASK 

								/*Write a program to sum the values of an array 
								 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
								 */

	int [] numbers= {1,2,3,4,5,6,7,8,9,10};
	int [] numbers1= new int[10];
	
	int sum= 0;
	
	for (int i=0; i < numbers.length; i++) {
		
		sum = sum + numbers[i];
		}
System.out.print
}
}

