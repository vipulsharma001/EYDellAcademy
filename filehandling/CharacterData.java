package com.filehandling;

import java.io.*;

public class CharacterData {
	public static void main(String[] args) {
		try {
			File f = new File("C:/Files/ABC.txt");
			System.out.println(f.exists());
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);

			BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("C:/Files/ABC.txt")));
			bw.write("ABCD");
			bw.newLine();
			bw.write("We are Writing Character data using BufferedWriter");
			bw.newLine();
			bw.write(97);
			bw.flush();
			bw.close();

			BufferedReader br = new BufferedReader(new FileReader(new File("C:/Files/ABC.txt")));
			String str="COOL BIPUL";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
