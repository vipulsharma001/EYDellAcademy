package com.regexexplained;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ReplaceWIthQuantifier {

	// * zero or more than once
	private static final String REGEX = "a*b";
	private static String INPUT_STRING = "aabPRRaabMNOabXYZab";
	private static final String REPLACED = "-";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		StringBuffer sb = new StringBuffer();
		while(m.find())
		{
			m.appendReplacement(sb, REPLACED);
		}
		System.out.println(sb.toString());
	}
}
