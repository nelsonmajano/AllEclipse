package com.JavaReview;

public class ClassFiveTask1 {

	public static void main(String[] args) {
		
		/*write a program  that prints the following pattern
		 * 12345678910
		 * 2468101214161820
		 * 36912151821242730
		 * 481216202428323640
		 * 5101520253035404550
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(i*j +" "); 
			}
				System.out.println();
		}


	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------//	
		
		
		
		/**Write a prgram that prints the following pattern
		 * ....1
		 * ...22
		 * ..333
		 * .4444
		 * 55555
		 * 
		 */

		 for(int i =1; i<=5; i++) {
	            for(int k = 1; k<=(5-i); k++) {
	                System.out.print(".");
	            }
	            for(int l = 1; l<=i; l++) {
	                
	                System.out.print(i);
	            }
	            
	            System.out.println();
	}
}
}