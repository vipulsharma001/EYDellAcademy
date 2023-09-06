package com.streams;

import java.util.ArrayList;
import java.util.Collections;

public class UseOfStream {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();
		countries.add("india");
		countries.add("USA");
		countries.add("England");
		
		Collections.sort(countries);
		for(String country : countries)
		{
			country = country.toUpperCase();
			if(!country.startsWith("E"))
			{
				System.out.println("Country name not starting with C -->"+country);
			}
		}
		countries.stream().map(s-> s.toUpperCase()).filter(s->!s.startsWith("c")).sorted().forEach(s-> System.out.println(s));
		
	}
}
