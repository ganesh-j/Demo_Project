package com.demo.oops.second;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Circle drawn");
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.printShape();
	}
	

}
