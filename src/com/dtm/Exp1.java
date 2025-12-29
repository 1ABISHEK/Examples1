package com.dtm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exp1 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate dmy = LocalDate.of(2000, Month.SEPTEMBER, 20);
		System.out.println(dmy);
		
		LocalDate w = ld.plusWeeks(1);
		System.out.println(w);
		
		Period pd = Period.between(dmy, ld);
		System.out.println(pd);
		
		DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		String formatedDate = dt.format(dfmt);
		System.out.println(formatedDate);
		
		ZonedDateTime zndt = ZonedDateTime.now();
		System.out.println(zndt);
		
		ZoneId znid = ZoneId.of("Asia/Tokyo");
		System.out.println(znid);
		
		ZonedDateTime tk = ZonedDateTime.now(znid);
		System.out.println(tk);
	}

}
 