package com.Class20;

public class AccessModifier {
	
	private String name="John";
	String name1="Bilal";
	protected String name2="Asha";
	public String name3="Tatiana";

    public static void main(String[] args) {
        
        AccessModifier obj=new AccessModifier();
        String reversed=obj.reverseString("Hello");
        System.out.println(reversed);
        
        boolean isPalindrome=obj.isPalindrome("hello");
        System.out.println(isPalindrome);
        
        String[] array=obj.getWordsFromString("Have a good night students");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------------");
        for (String word:array) {
            System.out.println(word);
        }
        obj.sayHello();
    }
    
    /*Create a method that will take 1 parameter as a String 
     * and return reversed String.
     *  Method should be visibly only within same package*/
    protected String reverseString(String str) {
        String reversed="";
         for (int i =str.length()-1; i>=0; i--) {
             reversed=reversed+str.charAt(i);
         }
        return reversed;
    }
    /* Create a method that will take a String and 
     * return whether String is palindrome or not. 
     * Method should be available to all classes within your projects.
     */
    public boolean isPalindrome(String str) {
        boolean flag=false;
        String reversed=reverseString(str);
        if (reversed.equalsIgnoreCase(str)) {
            flag= true;
        }
        return flag;
    }
    /*Create a method that will take a string and 
     * return an array of words from that string. 
     * Method should be available only within same class.
     */
    
    private String[] getWordsFromString(String str) {
        String[] words=str.split(" ");
        return words;
    }
    void sayHello() {
    	System.out.println("Hello Students");
    	
}
}