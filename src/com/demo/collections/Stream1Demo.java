package com.demo.collections;

import java.util.stream.Stream;

public class Stream1Demo {

	public static void main(String[] args) {
		
		
       Stream<Integer> stream = Stream.of(1,2,3,4,6,3,9);
       
       stream.forEach((i)->System.out.println(i));
       //stream.forEach(System.out :: println);

	}

}
