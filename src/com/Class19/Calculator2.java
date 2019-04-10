package com.Class19;

public class Calculator2 {

	
	   
	int sum(int x, int y, int c) {
	        return (x + y + c);
	    }
	    
	   public int average(int x, int y, int c) {

	        return (x + y + c)/3;
	    }
	   int min(int a, int b, int c) {
	        
	        int min = a;
	        
	        if(b<a) {
	            min = b;
	        }
	        if(c<min) {
	            min = c;
	        }
	            
	        return min;
	        
	    }
	    
	    int max(int a, int b, int c) {
	        int max = a;
	        
	        if(b>a) {
	            max = b;
	        }
	        if(c>max) {
	            max = c;
	        }
	            
	        return max;
	        
	    }
}
