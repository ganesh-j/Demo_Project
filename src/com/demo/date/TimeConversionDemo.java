package com.demo.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeConversionDemo {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		ZonedDateTime delhiTime = ldt.atZone(ZoneId.of("Asia/Kolkata"));
		
		System.out.println("Start time :" +delhiTime);
		
		ZonedDateTime japanTime = delhiTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(3);
		
		System.out.println("End time :" + japanTime);

	}

}
