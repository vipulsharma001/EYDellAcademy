package com.genricsexplained;

@FunctionalInterface
interface Sample {
	String print(String name);

}

public class InlineImplementationConcept {
	public static void main(String[] args) {
		Sample obj = (name) -> { return "welcome"+name ;};
		System.out.println(obj.print("to Lambda Expression Programming"));
		}
}
