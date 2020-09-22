package com.demo.strings;

public class StringMethods {

	public static void main(String[] args) {
		
         String s= "Hello friends";
         
         System.out.println("length :" + s.length());
         
         //System.out.println(s.substring(6,10));
         
         System.out.println(s.replace('H', 'W'));
         
         String[] arr = s.split(" ");
        
         for(String ss : arr) { //for(int i= 0 ; i< arr.length ; i++)
        	// System.out.println(ss);
         }
         

	}

}
