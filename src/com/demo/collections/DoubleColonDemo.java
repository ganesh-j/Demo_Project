package com.demo.collections;

public class DoubleColonDemo {
	
	
	DoubleColonDemo(){
		System.out.println("Default area");
	}
	
	public static void rectArea() {
		System.out.println("Area = l*b");
	}
	
	
	public  void circleArea() {
		System.out.println("Area = pi *r *r ");
	}
	

	public static void main(String[] args) {
		
		Shape s = DoubleColonDemo ::rectArea;
		s.calculateArea();
		
		DoubleColonDemo d = new DoubleColonDemo();
		Shape s2 = d :: circleArea;
		s2.calculateArea();
		
		Shape s3 = DoubleColonDemo:: new;
		s3.calculateArea();

	}

}
