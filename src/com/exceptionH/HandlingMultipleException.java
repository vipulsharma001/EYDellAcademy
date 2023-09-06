package com.exceptionH;

public class HandlingMultipleException {
	public static void main(String[] args) {
		String n ="Zinda hai";
		try {
			HandlingMultipleException obj = new HandlingMultipleException();
		} catch (NullPointerException | ArithmeticException |IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}
