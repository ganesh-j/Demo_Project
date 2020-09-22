package com.demo.oops.second;

public class MethodOverLoadDemo {

	public  static void add(int a, double b) {
		System.out.println(" int addition :" + (a+b));
	}
	
	public  static void add(long a, long b) {
		System.out.println(" long addition :" + (a+b));
	}
	
	public  static void  add(int a, int b, int c) {
		System.out.println(" int addition :" + (a+b+c));
		
	}
	
	public static void main(String[] args) {
		
			add(2,3d);
	}

}
