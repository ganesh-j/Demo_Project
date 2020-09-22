package com.demo.strings;

public class StringDemo {

	
	
	
	public static void main(String[] args) {
		
		String s= "delhi";
		String ss2 = "delhi";//no extra memory
		
		String s2 = new String("delhi"); 
		s2.intern();
		String s22 = new String("delhi"); // extra memory
		
		char array[] = {'d','e','l','h','i'};
		
		
		String s3 = new String(array);
		byte byteArray[] = {65,66,67}; // 123456 - >MD5 - >ABCJJ##$7657657hfhf
		
		String s4 = new String(byteArray);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
	
	


}
