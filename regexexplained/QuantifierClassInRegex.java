package com.regexexplained;

import java.util.regex.Pattern;

//X?	---X occurs once or not at all
//X+	---X occurs once or more times
//X*	---X occurs zero or more times
//X{n}	---X occurs n times only
//X{n,}	---X occurs n or more times
//X{y,z}	---X occurs at least y times but less than z time
public class QuantifierClassInRegex {
	public static void main(String[] args) {
		////X?	---X occurs once or not at all
		System.out.println(Pattern.matches("[amn]?", "a")); // true
		System.out.println(Pattern.matches("[amn]?", "z")); // false
		System.out.println(Pattern.matches("[amn]?", "am")); // true
		System.out.println(Pattern.matches("[amn]?", "")); // true
		
		//X+	---X occurs once or more times
		System.out.println(Pattern.matches("[amn]+", "aaaa")); // true
		System.out.println(Pattern.matches("[amn]+", "aaaammm")); // true
		System.out.println(Pattern.matches("[amn]+", "aaaammmooo")); // false
		
		//X*	---X occurs zero or more times
		System.out.println(Pattern.matches("[amn]*", "z")); // true
		System.out.println(Pattern.matches("[amn]*", "aaaammm"));

	}
}
