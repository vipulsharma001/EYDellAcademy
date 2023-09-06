package com.exceptionH;

import java.io.*;

import com.practice.IOExeption;

//Exception Handling 
public class ExceptionHandling {
	public static void main(String[] args) {
		BufferedReader br = null ;
		Reader r= new InputStreamReader(System.in);
		br=new BufferedReader(r);
		String str;
		try {
			do {
				System.out.println("Please enter sth, i will read it for you");
				str=br.readLine();
				System.out.println("You have entered"+str);
			}while(!str.equalsIgnoreCase("exit"));
		}catch(IOExeption e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null)
			{
				try{
					br.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
