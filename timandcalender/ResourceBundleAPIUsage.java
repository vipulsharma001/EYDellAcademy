package com.timandcalender;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAPIUsage {
	public static void main(String[] args) {
		ResourceBundle rs = ResourceBundle.getBundle("com.timandcalender.TestBundle");
		displayValues(rs);
		
//		@SuppressWarnings("deprecation")
		Locale swedishLocale =new Locale("sv","SE");
		ResourceBundle rs2 = ResourceBundle.getBundle("com.timandcalender.TestBundle",swedishLocale);
		displayValues(rs2);
	}
	static void displayValues(ResourceBundle bundle)
	{
		System.out.println("Hello Messgae : "+ bundle.getString("my.hello"));
		System.out.println("Hello Messgae : "+ bundle.getString("my.bye"));
		System.out.println("Hello Messgae : "+ bundle.getString("my.question"));
	}
}
