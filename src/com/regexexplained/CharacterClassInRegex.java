package com.regexexplained;

import java.util.regex.Pattern;

public class CharacterClassInRegex {
	public static void main(String[] args) {
		//String in the square brackets is called Character Class in regex
		System.out.println(Pattern.matches("[amn]","a"));//true
		System.out.println(Pattern.matches("[amn]","aa"));//false
		System.out.println(Pattern.matches("[amn]","m"));//true
		System.out.println(Pattern.matches("[amn]","mn"));//false
		//^ or not 
		System.out.println(Pattern.matches("[^amn]","z"));//true
		//to find single character in a range capital or small letters
		System.out.println(Pattern.matches("[a-zA-z]","C"));//true
		//Double Ranged A-D , M-P
		System.out.println(Pattern.matches("[a-d[m-p]]","z"));//false
		
	}
}
