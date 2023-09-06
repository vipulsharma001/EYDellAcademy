package com.regexexplained;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ALetterWithinWord {

	private static final String REGEX = "\\bA\\b";
	private static final String INPUT_STRING = "A A A AB A";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		
		int c= 0;
		while(m.find())
		{
			c++;
			System.out.println("Match Number :"+c);
			System.out.println("Starting Index :"+m.start());
			
			System.out.println("Ending Index :"+m.end());
		}

	}
}
