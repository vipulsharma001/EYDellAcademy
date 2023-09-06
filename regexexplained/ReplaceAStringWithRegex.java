package com.regexexplained;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAStringWithRegex {
	private static final String REGEX = "Java";
	private static String INPUT_STRING = "Core Java Programming Language";
	private static final String REPLACED_STRING = " Java Regex Concept";
	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		INPUT_STRING = m.replaceAll(REPLACED_STRING);
		System.out.println("Replaced String is : "+INPUT_STRING);
	}
}
