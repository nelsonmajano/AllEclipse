package com.Class27;

import com.Class26.Students;

public class Student {

	
//	1. Write program as a student class that has instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student by the displayInfo method.	

String name;
String address;


public Student(String name, String address) {
this.name=name;
this.address=address;
}
public void displayInfo() {
	System.out.println("Full name is "+name+" and address is "+address);
	
}
public static void main(String[] args) {
	
	Student obj=new Student("Nelson Majano ", "virginia");
	obj.displayInfo();
}
}
