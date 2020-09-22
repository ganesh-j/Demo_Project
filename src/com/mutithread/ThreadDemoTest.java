package com.mutithread;

public class ThreadDemoTest {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadDemo t1= new ThreadDemo();
		t1.start();
		
		t1.join();
		
		ThreadDemo t2= new ThreadDemo();
		t2.start();
		t2.start();
		
		
	}

}
