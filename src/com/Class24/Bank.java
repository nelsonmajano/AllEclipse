package com.Class24;

public class Bank {
	//parent Class
	
	public  int  loadInterest () {
			return 0;
		}
	}
	//1 child class
	class BOA extends Bank{
		@Override//annotation
		public  int  loadInterest () {
			return 2;
		}
	}
	//2 child class
	class PNC extends Bank{
		@Override
		public  int  loadInterest () {
			return 3;
		}
	}