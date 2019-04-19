package com.Class23;

public class AreaTask {
	/*area of rectangle - width* length(5*4)
	 *area of square - width*width(4)
	 *area of box - width*length*height(3*4*5)
	 */
	
//	public void getArea(int a, int b) {
//		System.out.println("the area of a rectangle is "+(a*b));
//		return a*b; <-------COMPILER WILL GIVE YOU AN ERROR IF YOU DO THIS!!!

	
	public void getArea(int a) {
		System.out.println("the area of a square is "+(a*a));
	}
	
	public void getArea(int a, int b, int c) {
		System.out.println("the area of a box is "+(a*b*c));
	}
}

