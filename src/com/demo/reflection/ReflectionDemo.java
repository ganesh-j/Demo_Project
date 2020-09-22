package com.demo.reflection;

public class ReflectionDemo {
	
	public static void msg() {
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		
		try {
			Class c = Class.forName("com.demo.reflection.ReflectionDemo"); // first way
			
			//ReflectionDemo rd = new ReflectionDemo();
			
			//Class c = rd.getClass();  // second way
			
			//Class c = ReflectionDemo.class; //third way
			
			ReflectionDemo rd2 = (ReflectionDemo) c.newInstance(); //second way of creating object
			rd2.msg();
			System.out.println(c.getName());
		} catch (Exception e) {
			System.out.println(e.toString() +" exception occured");
		}
		

	}

}
