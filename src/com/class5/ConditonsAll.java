package com.class5;

import java.util.Scanner;

public class ConditonsAll {

	public static void main(String[] args) {
		//*Ask user to enter price and boolean value for sale
		//Based on the sale we will check the price
		//if the price<20 -->apply discount 20%and give final price
		//if price is >100 less 500--> apply discount-->apply 50% and give final price
		
		
		
		
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalprice;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		
		System.out.println("Please enter price of item");
		price=scan.nextInt();
		
		if(sale) {
			System.out.println("Lets check all discounts");
			
			if (price<20) {
				discount=20;
				finalprice=price-(price*0.2);
			}else if (price>=100 && price<500) {
				discount=30%
				finalprice=price-(price);
			}
		}
	
