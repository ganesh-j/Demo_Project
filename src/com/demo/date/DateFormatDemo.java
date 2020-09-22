package com.demo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {
		
      SimpleDateFormat sdt = new SimpleDateFormat("MMM-dd-yyyy");
      
      
      SimpleDateFormat sdt2 = new SimpleDateFormat("YYYY-dd-MM hh:mm:ss z");
      Date date = new Date();
      
      String formattedDate = sdt.format(date);
      System.out.println(formattedDate);
      
      
      String formattedDate2 = sdt2.format(date);
      System.out.println(formattedDate2);
      

	}

}
