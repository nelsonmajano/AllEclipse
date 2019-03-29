package com.Class7;

import java.util.Scanner;

public class HwReplit7_1 {

	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		
	    scan=new Scanner(System.in);
		System.out.println("enter name of instructor");
		name=scan.nextLine();
		 
		switch (name) {
		 
		case  "Shiva":
		name="Will take care of Java Assignment";
		break;
		case  "Sandish":
		name="Will take care of SDLC Assignment";
		break;
		case "Weqas":
			name="Will take care of Selenium Assignment";
			break;
		case "Asel":
			name="Will take care of every Assignment";
			break;
		default:
			name="James or John";
			System.out.println(" Invalid instructor selected");
					}
				}
	      }
     