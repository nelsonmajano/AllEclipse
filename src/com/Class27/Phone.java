package com.Class27;

public abstract class Phone {// Abstract class
	
	public void makeCall(){
		System.out.println("Phone can make a call");
}
	public void sendText() {
		System.out.println("Phone can send text");
}
    public abstract void unlockPhone();
    public abstract void viewPictures();
}
	class Iphone extends Phone{//concrete class - is class that is inherited from a abstract 
		//class or implemented by interface and providing implementation of all 
		//unimplemented / abstract classes

	@Override
	public void unlockPhone() {
	System.out.println("To unlock Iphone we can use FaceId or FingerPrint");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view Pictures on Iphone can go to Images");
		
	}
	
}
	class Samsung extends Phone{

		@Override
		public void unlockPhone() {
			System.out.println("To unlock samsung we need password ");
			
		}

		@Override
		public void viewPictures() {
			System.out.println("To view pictures we have to go to gallery");
			
		}
		
	}