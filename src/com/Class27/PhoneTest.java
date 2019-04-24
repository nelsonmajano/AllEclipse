package com.Class27;

public class PhoneTest {

	public static void main(String[] args) {
		
		//Phone obj=new Phone(); ---> cannot instantiate Phone because it is a abstract class
		Phone phone1=new iPhone();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.viewPictures();
		
		Phone phone2=new iPhone();
		phone2.makeCall();
		phone2.sendText();
		phone2.unlockPhone();
		phone2.viewPictures();
	
	
	
	
	}
}
