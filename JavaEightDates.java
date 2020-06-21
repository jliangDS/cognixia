package com.cognixia.jump.corejava.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaEightDates {

	public static void main(String[] args) {
		
		localDateExample();
		localTimeExample();
		localDateTimeExample();
		zonedDateTimeExample();
		
	}
	
	public static void localDateExample() {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// clearly give a date to save
		LocalDate ld = LocalDate.of(2018, 12,  22);
		System.out.println(ld);
		
		// plus methods to create new date object with added time
		LocalDate newLd = ld.plusDays(20);
		System.out.println("20 days after: " + newLd);
		
		// minus methods create new date object with time take off
		LocalDate newLd2 = ld.minusWeeks(7);
		System.out.println("7 weeks back: " + newLd2);
		
		// get methods to get parts of the date
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getYear());
	}
	
	public static void localTimeExample() {
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime time = LocalTime.of(13, 30);
		System.out.println(time);
		
		LocalTime time2 = LocalTime.of(13, 30, 12, 5632);
		System.out.println(time2);
		
		System.out.println(lt.plusHours(20));
		System.out.println(lt.getNano());
	}
	
	public static void localDateTimeExample() {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldt2 = LocalDateTime.of(2019, 7, 21, 9, 15);
		System.out.println(ldt2);
		
		ldt.getDayOfMonth();
	}
	
	public static void zonedDateTimeExample() {
		
		// date and time to store
		LocalDateTime ldt = LocalDateTime.of(2005, 10, 7, 10, 45);
		
		// time zone
		ZoneId id = ZoneId.of("Europe/Paris");
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, id);
		
		System.out.println(zdt);
		
		// all the time zones available
		System.out.println(ZoneId.getAvailableZoneIds());
		
		for(String zone : ZoneId.getAvailableZoneIds()) {
			System.out.println(zone);
		}
		
	
		
	}
	
}
