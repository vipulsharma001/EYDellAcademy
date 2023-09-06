package com.practice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		ReverseString trimWhiteSpaces = new ReverseString();
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();

		String trimmedMessage = trimWhiteSpaces.trimWhiteSpaces(message);
		System.out.println(trimmedMessage);

	}

	public String trimWhiteSpaces(String message) {
		// Write Code Herez
		message=message.replaceAll("\\s+"," ").trim();
		return message;
	}

}
