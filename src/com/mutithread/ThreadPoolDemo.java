package com.mutithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<3000;i++) {
			//c.increment();
			es.submit(()->c.increment());
		}
		es.shutdown();
		
		es.awaitTermination(4, TimeUnit.SECONDS);
		
		
		System.out.println(c.getCount());
		

	}

}
