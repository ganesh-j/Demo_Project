package com.mutithread;

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		
		Runnable r1 = ()->{
			for(int i =1; i<=1000; i++) {
				c.increment();
			}
		};
		
		Thread t1 = new Thread(r1);
		//Thread.sleep(2000);
		
		Runnable r2 = ()->{
			for(int i =1; i<=1000; i++) {
				c.increment();
			}
		};
		
		Thread t2 = new Thread(r2);
		
		Runnable r3 = ()->{
			for(int i =1; i<=1000; i++) {
				c.increment();
			}
		};
		
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		Thread.sleep(3000);
		
		System.out.println(c.getCount());

	}

}
