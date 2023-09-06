package com.regexexplained;

import java.util.regex.Pattern;

public class PhoneNoVaidate {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("[0-9]{10}", "abcqfqcqr"));
		System.out.println(Pattern.matches("(\\w+)@(\\w+)\\.(\\w+)", "username@geekforgeeks.org"));
		

	}
}
