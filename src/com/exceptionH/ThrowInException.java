package com.exceptionH;

public class ThrowInException {
	public static void main(String[] args) throws IOException{
		
		try {
			Cool();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	static void Cool throws IOException()
	{
		throw new IOException("Device Error");
	}
}
