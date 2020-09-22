package com.demo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		List<Integer> evenList = new ArrayList<Integer>();
		
		Predicate<Integer> pr = (i) -> i %2==0;


		evenList = list.stream().filter(pr).collect(Collectors.toList());
		
		List<String> strings = new ArrayList<String>();
		strings.add("ANCVHGJ");
		strings.add("ANBC");
		strings.add("A8CVBNVJKJLKN");
		strings.add("AJV");
		
		Map<String,Integer>  nameLength = new HashMap<String,Integer>();
		
		
		//List<String> lowerCaseStrings = new ArrayList<String>();
		
		
		//lowerCaseStrings = strings.stream().map((s) -> s.toLowerCase()).collect(Collectors.toList());
		//System.out.println(lowerCaseStrings);
		
		nameLength = strings.stream().map((s)->s + "Hi")
				.collect(Collectors.toMap((s) -> s.toLowerCase(), (s)->s.length()));
		
		System.out.println(nameLength);
		
		
		
	}

}
