package com.exceptionH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceConcept {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\QA135TL\\OneDrive - EY\\Desktop\\giga\\hulu.txt"));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		
		
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\QA135TL\\OneDrive - EY\\Desktop\\giga\\hulu.txt")))
			{
				String str;
				while((str=br.readLine())!=null)
				{
					System.out.println(str);
				}
				br.close();
			} 
		catch (IOException e) 
		{
			// TODO: handle exception
				System.out.println(e.getMessage());
		}
	}
}
