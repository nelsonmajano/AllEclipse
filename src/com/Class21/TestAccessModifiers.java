package com.Class21;

import com.Class20.AccessModifier;

public class TestAccessModifiers {

	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.isPalindrome("Hello"); //accessing public method in different package
		System.out.println(obj.name3);////accessing public variable in different package
	}
}
