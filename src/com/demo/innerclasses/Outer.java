package com.demo.innerclasses;

public class Outer {
	
	  static class Inner{
		 void msg() {
			 System.out.println("Member Inner class method");
		 }
	 }
	
	
	void m() {
		System.out.println("Random method");
	}

	public static void main(String[] args) {
		
		Outer md = new Outer();
		
		Outer.Inner mic = new Outer.Inner(); //md.new Inner();
		mic.msg();

	}

}
