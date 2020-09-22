package com.demo.oops.second;

public interface Shape2 {
	
	default void printShape() {
		System.out.println("default ");
	}
	
	static int getCube(int n) {
		return n*n*n;
	}
	
	
	
	void draw();
	void getArea();

}
