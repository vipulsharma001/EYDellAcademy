package com.timandcalender;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatter {
	public static void main(String[] args) {
		long number = 50000L;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Number Format using Locale is :"+nf.format(number));
		
		NumberFormat italyNF = NumberFormat.getCurrencyInstance();
		System.out.println("Number Format using italy Locale is :"+ italyNF.format(number));
		
		NumberFormat defaultCurrency = NumberFormat.getInstance();
		System.out.println("Number Format using italy Locale is :"+ defaultCurrency.format(number));
		
		NumberFormat defaultItalianCurrency = NumberFormat.getInstance();
		System.out.println("Number Format using italy Locale is :"+ defaultItalianCurrency.format(number));
		
		Currency usd = Currency.getInstance("USD");
		NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Number Format using italy Locale is :"+ usCurrency.format(number));
//		Date currencyDate = new Date();
//		DateFormat germanDF = DateFormat.getDateInstance(DateFormat.FULL ,Locale.GERMANY);
//		System.out.println("Date Format using Germany is :"+ germanDF.format(currencyDate));
		
		
		
		
		
	}
}
