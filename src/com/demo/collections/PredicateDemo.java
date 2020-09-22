package com.demo.collections;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> pr = (i) -> i %2==0;
		
		boolean var = pr.test(41);
		
		System.out.println(var);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even numbers");
		multipleCheck(pr,arr);
		
		System.out.println("Odd numbers");
		multipleCheck(pr.negate(),arr);
		
		Predicate<Integer> pr2  = (i)-> i>5;
		System.out.println("Even numbers and >5 ");
		multipleCheck(pr.and(pr2),arr);
		
		System.out.println("Even numbers OR  >5 ");
		multipleCheck(pr.or(pr2),arr);

	}

	private static void multipleCheck(Predicate<Integer> pr, int[] arr) {
	
			for(int i : arr) {
				if(pr.test(i)) {
					System.out.println(i);
				}
			}
	}

}
