package com.class5;

public class NestedifPractice {

	public static void main(String[] args) {
		//*check if user has credit card==>
		// check what is the balance if balance us more then 1000--> pay off
		//else "you are good"*/
		boolean creditCard=true;
		int balance =900;
		
		if(creditCard) {
			System.out.println("Lts check the balance");
			if (balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are good");
			}
		}else {
			System.out.println("Do you wang a credit card");
			}
		}
	}


