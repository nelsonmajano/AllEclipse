package com.Class9;

import java.util.Scanner;

public class HomeWorkTask2 {

	public static void main(String[] args) {
		/*Ask user to enter the item they want to buy and  the price for the item. Then ask user to pay for it. 
		Every time user enters money accumulate the amount and tell user how much is left to pay off the amount. 
		Whenever user done with payments tell them "Thank you for shopping!"*/

		Scanner scan;
		int price, payment, sum=0;
		String item;
		scan= new Scanner (System.in);
		System.out.println("Please enter the item you would like to buy");
	    item=scan.nextLine();
		
		System.out.println("Please enter the price for your item");
		price=scan.nextInt();
		
		do {
			System.out.println("Please pay for yout item");
			payment=scan.nextInt();
			
			sum=sum+payment;
			System.out.println("You still need to pay "+(price-sum));
			
			}while (sum<price);
		System.out.println("Thank you for shopping with us");
		}
	}
