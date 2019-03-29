package com.Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*Create a grocery list: fruits{}
		 * 						veggies{}
		 * 						dairy{}
		 * Retrieve all values using 2 different loops
		 * 				
		 */
		String[][] groceryList = { 
		{"apples","bannans","oranges"},
		{"cucumber","onion","potato"},
		{"yogurt","cheese,","milk"}
		};
		
		for(String[] list:groceryList) {
			
			for(String item:list) {
				
				System.out.println(item);
			}
		}
	}

}
