package com.Class19;

public class Mininum {

	//Create a class called Minimum
	//	in it create a method called minOfValues
	//	make it static.
	//  With your previous Application class call method and pass an array argument 
	//and print out result.

static int minOfValues(int[] x ){
        
        int min = x[0];
        
        for(int y: x) {
            
            if(y<min) {
                min = y;
            }
        }
        
        
        return min;  
    }

		/*
         * Write a program to find the maximum and minimum value of an array.
         */
static int maxOfValues(int[] j) {
        
	
	int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

        int max = array[0];
        int min = array[0];
        {
        for (int j1 = 0; j1 < array.length; j1++) {

            if (array[j1] >= max) {

                max = array[j1];
            }
            if (array[j1] <= min) {
                min = array[j1];
            }
        }
       return max;
        }
}
}
        
