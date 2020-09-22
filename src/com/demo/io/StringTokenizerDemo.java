package com.demo.io;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
   String s ="Welcome,to,java,io,streams";
   
   StringTokenizer st = new StringTokenizer(s,",",true);
   
   while(st.hasMoreTokens()) {
	   System.out.println(st.nextToken());
   }
   
   

	}

}
