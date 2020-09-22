package com.demo.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
    LocalDateTime ld = LocalDateTime.now();
    
    System.out.println(ld);
    
    System.out.println(ld.plusMonths(2));
    
    System.out.println(ld.plusYears(3));
    
    System.out.println(ld.minusDays(4));

	}

}
