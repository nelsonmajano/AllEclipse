package com.Class21;

public class Employee {
	static String CEO="Sumair";
int eID;
int salary;

	public static void main(String[] args) {
	Employee employee1= new Employee();
	
	employee1.eID=123;
	employee1.salary=100000;
	employee1.empInfo();
	
	Employee employee2= new Employee();
	employee2.eID= 321;
	employee2.salary=200000;
	employee2.empInfo();
	
	}
public void empInfo() {
	System.out.println("Employee ID " +eID+ " salary "+salary+ " CEO of the company " +CEO);
}
}

