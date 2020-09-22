package com.demo.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
       LocalDate ldt = LocalDate.now();
       
       LocalDate ldt2 = LocalDate.of(2020,04,22);
       
       Period p = Period.between(ldt2, ldt);
       
       System.out.println(p.getMonths());

	}

}
