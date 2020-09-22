package com.demo.exception;

public class ThrowExceptionDemo {
	
	static void checkAgeForVoting(int age) throws AgeCustomException {
		if(age<18) {
			throw new AgeCustomException("Not valid age for voting");
		}else {
			System.out.println("Eligible");
		}
		
	}

	public static void main(String[] args) throws AgeCustomException {
	
		checkAgeForVoting(15);
		
		System.out.println("Normal flow");
		

	}

}
