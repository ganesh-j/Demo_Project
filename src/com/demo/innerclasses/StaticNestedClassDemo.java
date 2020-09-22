package com.demo.innerclasses;

public class StaticNestedClassDemo {
	
	 static class Inner{
		 void msg() {
			 System.out.println("Static nested class method");
		 }
	 }
	
	
	void m() {
		System.out.println("Random method");
	}


	public static void main(String[] args) {
		StaticNestedClassDemo.Inner snc = new StaticNestedClassDemo.Inner();
		snc.msg();
		
	}

}
