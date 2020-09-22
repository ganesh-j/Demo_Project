package com.demo.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		System.out.println(queue.poll());
		queue.offer("AB");
		queue.offer("BC");
		queue.offer("BA");
		queue.offer("DE");
		queue.offer("XY");
		queue.offer("MN");
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.offer("NB");
		System.out.println(queue);
		
		
		
		
		
		
		
	}

}
