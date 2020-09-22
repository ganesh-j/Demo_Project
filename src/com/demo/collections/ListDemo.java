package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();
		
		marks.add(10);
		marks.add(30);
		marks.add(15);
		marks.add(20);
		
		System.out.println("Before sort");
		
		for(Integer i : marks) {
			System.out.println(i);
		}
		
		Collections.sort(marks);
		
		System.out.println("After sort");
		
		for(Integer i : marks) {
			System.out.println(i);
		}
		
		
		
		
		
	
		/*
		 * Integer[] arr = new Integer[marks.size()]; arr = marks.toArray(arr);
		 * 
		 * List<Integer> m2 = new ArrayList<Integer>(); m2=Arrays.asList(arr);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //System.out.println(marks.get(3)); for(int mark : marks) {
		 * System.out.println(mark); }
		 * 
		 * 
		 * Iterator itr = marks.iterator(); while(itr.hasNext()) { int mark = (int)
		 * itr.next(); System.out.println(mark);
		 * 
		 * }
		 * 
		 * marks.forEach(a -> { if (a % 2 == 0) { System.out.println(a + 2); } else {
		 * System.out.println(a + 7); } });
		 * 
		 */
			
		
		
		
		
	}

}
