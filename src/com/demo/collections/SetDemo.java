package com.demo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<Integer> marks = new TreeSet<Integer>();

		marks.add(30);
		marks.add(20);
		marks.add(25);
		marks.add(20);
		
		
		
		
		
		for(int i:marks ) {
			System.out.println(i);
		}
	}

}
