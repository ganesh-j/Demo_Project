package com.mutithread;

public class ThreadDemoTest2 {
	
	public static void display() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		
		ThreadDemo2 td= new ThreadDemo2();
		Thread t1= new Thread(td);
		t1.start();
		
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(" child thread 2 using anonymous inner class");
			}
		};
		
		t2.start();
		
		Runnable r = ()->System.out.println("child thread using lambda expression");
		Thread t3= new Thread(r);
		t3.start();
		
		
		Runnable r2 = ThreadDemoTest2 :: display;
		
		Thread t4= new Thread(r2);
		t4.start();
		

	}

}
