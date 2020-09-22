package com.demo.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2Demoi {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);	list.add(30); list.add(40);	list.add(15);
		list.add(60);	list.add(50); list.add(45);	list.add(35);
		
		
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		
		//evenNumbers = list.stream().filter((i) -> i%2 == 0).collect(Collectors.toList());
		
		//System.out.println(evenNumbers);
		
		Comparator<Integer> comp = (x,y)-> x.compareTo(y);
		
		//list.stream().sorted(comp).forEach((i)->System.out.println(i));
		
		Optional<Integer> min = list.stream().max(comp);
		
		if(min.isPresent()) {
			System.out.println(min.get());
		}
			
		
		
		

	}

}
