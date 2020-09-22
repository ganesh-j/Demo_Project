package com.demo.exception;

public class RunTimeExceptionDemo {

	public static void main(String[] args) {
		
		
		try {
		int a[] = new int[5];
		 a[2] = 10/2;
		System.out.println(a[2]);
		
		}catch (ArithmeticException e) {
			System.out.println("Exception occured while devision opertation" + e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured while array opertation" + e);
		}catch(Exception e) {
			System.out.println("generic excetion");
		}
		
		String s ="20";
		try {
		int a = Integer.parseInt(s);
		System.out.println(a);
		}catch(NumberFormatException e){
			System.out.println("provide number:" + e);
		}finally {
			System.out.println("Always executes");
		}

		
		System.out.println("remaining");
		
		
	}

}
