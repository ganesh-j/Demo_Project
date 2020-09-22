package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String> empMap = new HashMap<Integer,String>();
		
		
		Map<String,Integer> subMarks = new TreeMap<String, Integer>();
		 
		empMap.put(4,"xyz");
		empMap.put(1,"ABC");
		empMap.put(2,"ABC");
		empMap.put(1,"ABC");
		empMap.put(3,"DEF");
		
		subMarks.put("java",28);
		subMarks.put("python ",48);
		subMarks.put("c",27);
		
		
		
		
		for(Entry<Integer, String>  entry : empMap.entrySet()) {
			System.out.println(" "+ entry.getKey() + "  " + entry.getValue() );
		}
		
		

	}

}
