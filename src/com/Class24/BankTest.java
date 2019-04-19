package com.Class24;

public class BankTest {

public static void main(String[] args) {
		
		Bank  bank = new  Bank ();
		BOA  boa = new  BOA ();
		PNC pnc=new PNC();
		
		int  interestRate ;
		
		interestRate=bank.loadInterest();
		System.out.println("Bank charges interest="+interestRate);
		
		interestRate=boa.loadInterest();
		System.out.println("BOA charges interest="+interestRate);
		
		interestRate=pnc.loadInterest();
		System.out.println("PNC charges interest="+interestRate);
	}
}




