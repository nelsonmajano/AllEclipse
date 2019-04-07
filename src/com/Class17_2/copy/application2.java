package com.Class17_2.copy;

import com.Class17.calculator;

public class application2 {

	public static void main(String[] args) {
        ScannerMethod scnMthd = new ScannerMethod();
        
        
        calculator operations = new calculator();
        
        int x = 10, y = 100;
        
        int d = operations.sum(x, y);
        
        System.out.println(d);
         }

}