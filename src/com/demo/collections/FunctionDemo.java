package com.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> function = (s) -> s.length();
		
		System.out.println("length :" + function.apply("Hello"));
		
		Function<String, String> f2 = (s) ->{
			System.out.println(s);
			return s.toUpperCase();
		};
		
		Consumer<String> con = (s)-> System.out.println( "Length of string " + s.length() );
		
          List<String>  list= new ArrayList<String>();
          list.add("ABC");
          list.add("xyz");
          list.add("def");
          
          for(String s : list) {
        	  con.accept(s);
          }
          
		Supplier<String> sup = ()-> "Hello from Supplier";
		System.out.println(sup.get());
		
		
		
		
		
		
	}

}
