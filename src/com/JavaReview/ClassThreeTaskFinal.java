package com.JavaReview;

public class ClassThreeTaskFinal {

	public static void main(String[] args) {
		// Write a program to find out the user level of experience
        // Must use a switch statement with  a String variable named levelString and a int variable named level
        
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3

		String levelString;
		int level=0;
		
		switch (level) {
		
		case 1:
			levelString="Beginner";
			break;
		case 2:
			levelString="Intermediate";
			break;
		case 3:
			levelString="Expert";
			default:
			levelString="Invalid";
				System.out.println("You are in level? "+level);	
		}
	}
}
