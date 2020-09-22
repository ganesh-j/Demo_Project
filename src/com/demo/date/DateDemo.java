package com.demo.date;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		Date date = new Date();
		
		System.out.println(date);
		
		long time = System.currentTimeMillis();
		
		Date date2 = new Date(time);
		
		System.out.println(date2);
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(" Time taken for main  method:" + (end-start));
		
		// dd - mm-yyyy 
		// yyyy -dd - mm
		

	}

}
