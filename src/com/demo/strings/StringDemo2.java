package com.demo.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = "abc";
		
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = "xyz";
		
		//Integer Long String Boolean 
		
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		
		s2 = s1.concat(s3); 
		
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s2);
		
		
		
		


		
		
		
	}

}
