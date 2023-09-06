package com.timandcalender;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateAndTimeConcepts {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current System Date is :"+ today);
		
		LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current India Date is :"+ indiaDate);
		
		LocalDate usDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current US Date is :"+ usDate);
		
		LocalDate firstDay2023 = LocalDate.of(2023,Month.JANUARY,1);
		System.out.println("First day of 2023 is :" + firstDay2023);
		
		try {
			LocalDate feb292023 = LocalDate.of(2023,Month.FEBRUARY,29);
			System.out.println("Day of 29 feb in 2023 is :" + feb292023);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		LocalDate epochDay = LocalDate.ofEpochDay(1000);
		System.out.println("1000th day from epoch day is :" + epochDay);
		
		LocalDate hundredth_day_of_2020 = LocalDate.ofYearDay(2020, 100);
		System.out.println("100th day from 2020 day is :" + hundredth_day_of_2020);
		
		
	}
}
