package com.Class17_2.copy;

public class ClockTask {

	public static void main(String[] args) {
		ClockTask clock=new ClockTask();
		
		clock.printTime();
	}
	void printTime() {
		for (int h=0; h<24; h++) {
			
			for (int m=0; m<60; m++) {
				
				if (m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}
	}
}
