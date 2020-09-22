package com.demo.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String date = "18/10/2019 10:20:30";

		LocalDateTime ldt = LocalDateTime.parse(date,dtf);
		
		LocalDateTime ldt2 = LocalDateTime.of(2020,04,22,10,10,10);
		
		System.out.println(ldt);
		
		System.out.println(ldt2);
		
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
		
		String date1 = "Jul-31-2020";

		LocalDate ldt1 = LocalDate.parse(date1,dtf1);
		
		System.out.println(ldt1);
		
	}

}
