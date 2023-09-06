package com.timandcalender;

import java.time.LocalDate;
import java.time.LocalTime;

public class FunctionOfLocalDateApi {
 public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	
	System.out.println("Year:"+today.getYear()+" is a leap year or not "+today.isLeapYear());
	
	System.out.println("Current Time Is : "+ today.atTime(LocalTime.now()));
	
	System.out.println("10 days after today will be :"+ today.plusDays(10));
	System.out.println("20 weeks after today will be :"+ today.plusWeeks(20));
	System.out.println("45 Months after today will be :"+ today.plusMonths(35));
	
	System.out.println("10 days before today was be :"+ today.minusDays(10));
	System.out.println("20 weeks before today was be :"+ today.minusWeeks(20));
	System.out.println("45 Months before today was be :"+ today.minusMonths(35));
	
	
}
}
