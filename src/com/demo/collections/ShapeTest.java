package com.demo.collections;

public class ShapeTest {

	public static void main(String[] args) {

		Shape s = new Circle();
		s.calculateArea();

		Shape rectAngle = new Shape() {

			@Override
			public void calculateArea() {

				System.out.println("area of rect angle");

			}

		};

		rectAngle.calculateArea();

		Shape square = () -> System.out.println("Area of square");
		square.calculateArea();

		ArithmeticOperation ai = (a, b) -> {
			System.out.println("Additon through lambda");
			return a + b;
		};
		int c = ai.addition(3, 8);
		

	}

}
