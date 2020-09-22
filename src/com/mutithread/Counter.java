package com.mutithread;

public class Counter {

	private int i = 0;

	public void increment() {
		synchronized (this) {
			i++;
		}

		//System.out.println(1);
		//System.out.println(2);
	}

	public  int getCount() {
		return i;

	}

	// i++

	// read the value of i
	// increment i add 1
	// assign back to i
}
