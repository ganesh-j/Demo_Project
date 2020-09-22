package com.demo.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LocalDateToString {

	public static void main(String[] args) {
		
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        
        LocalDateTime ld = LocalDateTime.now();
        
        try {
        System.out.println(dtf.format(ld));
        }catch (Exception e) {
			System.out.println("exception occured");
		}

	}

}
