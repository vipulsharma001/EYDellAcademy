package com.interfaceExplained;

public class NeedOfOptionalClass {
	public static void main(String[] args) {
		String[] words = new String[10];String w ="";
		if(null != words[5]) {w= words[5].toLowerCase();}
		else{System.out.println("Null at 5");}System.out.println(w);
	}
}
