package com.demo.oops;

public class StaticDemo {

	 static int count;
	
	public  int incrementCount() {
		return count++;
	}
	
	public static void printSomething() {
		System.out.println("static method");
	}
	
	public static int  square(int n) {
		return n*n;
	}
	
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		
		int count = sd.incrementCount();
		
		StaticDemo sd2 = new StaticDemo();
		
		
		
		StaticDemo.printSomething();
		int m= StaticDemo.square(5);
		System.out.println(m);
		
	}

}
