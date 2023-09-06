package com.dataStructures;



public class FinalKeyword {
	 static String PAN_CARD_NUMBER;
//	FinalKeyword() {
//		PAN_CARD_NUMBER= "BXJPY1131Q";
//	}
	static
	{
		PAN_CARD_NUMBER="IDIJDIJI123";
	}
	void display()
	{
		System.out.println("Final Method");
	}
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		System.out.println("PAN card no. is:"+obj.PAN_CARD_NUMBER);
	}
}
