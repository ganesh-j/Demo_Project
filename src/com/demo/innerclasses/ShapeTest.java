package com.demo.innerclasses;

public class ShapeTest {

	public static void main(String[] args) {
		
		
		Shape circle= new Shape() {

			@Override
			public void draw() {
			System.out.println("Drawing cirle : Annoymous inner class");
				
			}

			@Override
			public void color() {
				// TODO Auto-generated method stub
				
			}
		};
		
		circle.draw();
		circle.color();
		
		Shape polygon= new Shape() {

			@Override
			public void draw() {
			System.out.println("Drawing ciPolygonrle : Annoymous inner class");
				
			}

			@Override
			public void color() {
			System.out.println(" shape color is red");
				
			}
		};
		
		polygon.draw();
		polygon.color();
		
	//	Shape rectandle =()->System.out.println("Rectangle drawing : Lamda expression");
		//rectandle.draw();
		
	}
	

}
