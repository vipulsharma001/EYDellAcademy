package com.genricsexplained;

import java.util.HashMap;

public class PrintNextVowelInAString {
	public static void main(String[] args) {
		String str="Vipul Sharma";
		System.out.println("Next vowel String is:"+ printNextVowel(str.toCharArray()));
	}
	
	public static String printNextVowel(char[] str)
	{
		HashMap<Character , Integer> hMap = new HashMap<>();
		hMap.put('a',0);
		hMap.put('e',1);
		hMap.put('i',2);
		hMap.put('o',3);
		hMap.put('u',4);
		
		
		char[] arr = {'a','e','i','o','u'};
		int lengthOfString = str.length;
		System.out.println(lengthOfString);
		
		for(int i =0;i<lengthOfString;i++) {
			char c=str[i];
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
			{
				int index = hMap.get(c)+1;
				int newindex = index%5;
				
				str[i] = arr[newindex];
			}
		}
		return String.valueOf(str);
	}
}
