package com.Class17;

public class NoMainMethod {
String str;
int num;

void hello() {
	System.out.println("Hello");
}
void bye() {
System.out.println("Bye");
}
public static void main(String[]args) {//method signature
	
NoMainMethod obj=new NoMainMethod(); //method body
obj.hello(); //we calling a method hello
obj.bye();
}

}