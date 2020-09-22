package com.demo.exception;

import java.io.IOException;

public class ExceptionPropagationDemo {

	void m() throws IOException {
		throw new java.io.IOException("DEVICE EXCEPTION");
	}
	
	void n() throws IOException {
		m();
	}
	
	void p() throws IOException {
		n();
	}
	
	
	public static void main(String[] args) throws IOException {
		
       ExceptionPropagationDemo ex = new ExceptionPropagationDemo();
      try {
       ex.p();
      }catch(Exception e) {
    	  System.out.println("Exception occured");
     }
       
       System.out.println(" Remaining flow");

	}

}
