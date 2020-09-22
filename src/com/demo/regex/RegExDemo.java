package com.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
      //Pattern 
		
		
		Pattern p = Pattern.compile("abc");
		
		Matcher m = p.matcher("aa abc kjkjabc abcde");
		
		
		while(m.find()) {
			System.out.println(m.group() +" start pos : " + m.start()+" ends it:" +m.end());
		}
		
		//boolean ispresent = m.matches();
		
		//System.out.println(ispresent);
		
		
		//boolean isPresent = Pattern.compile("a*").matcher("").matches();	
		//System.out.println(isPresent);
		
		//System.out.println(Pattern.matches("[0-9]{10}", "76976123796586"));
		//System.out.println(Pattern.matches("[0-9]{10}", "1234567890"));
		//System.out.println(Pattern.matches("[6-9][0-9]{9}", "9234567890"));
		//System.out.println(Pattern.matches("[6-9]\\d{9}", "9234567890"));
		
		// begin @ domain. com/in/uk
		
		//System.out.println(Pattern.matches("[a-z./-]{5,10}@[a-z]{4,9}.(com|uk|org)", "abc-dd@yahoo.uk"));
		

	}

}
