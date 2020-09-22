package com.demo.exception;

public class AgeCustomException  extends Exception{
	
	AgeCustomException(String msg){
		super(msg);
		System.out.println("Custom exception constrcutor");
	}

}
