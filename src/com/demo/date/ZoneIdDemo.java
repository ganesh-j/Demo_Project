package com.demo.date;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZoneIdDemo {

	public static void main(String[] args) {
		 
		ZoneId zid = ZoneId.of("Australia/Queensland");
		LocalDateTime ldt = LocalDateTime.now(zid);
		
		System.out.println(ldt);
		
		
		ZoneId zid2 = ZoneId.of("Asia/Tokyo");
		LocalDateTime ldt2 = LocalDateTime.now(zid2);
		
		System.out.println(ldt2);

	}

}
