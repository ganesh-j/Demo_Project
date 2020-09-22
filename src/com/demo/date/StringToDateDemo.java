package com.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateDemo {

	public static void main(String[] args) {
		
		String s = "22-12-2018 10:20";
		
		SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		
		try {
			Date d = sdt.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
