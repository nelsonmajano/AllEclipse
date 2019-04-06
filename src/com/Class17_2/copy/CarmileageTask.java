package com.Class17_2.copy;

public class CarmileageTask {

	public static void main(String[] args) {
	//99999
		CarmileageTask car=new CarmileageTask();
		
		car.PrintMileage();
	}
	void PrintMileage() {
for (int a=0; a<=9; a++) {
	for (int b= 0; b<=9; b++) {
		for (int c = 0; c<=9; c++) {
			for (int d=0; d<=9; d++) {
				System.out.println(a+""+b+""+c+""+d);
					}
				}
			}
		}
	}
}