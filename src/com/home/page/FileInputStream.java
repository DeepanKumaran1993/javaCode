package com.home.page;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// FileInputStream fin=new
			// FileInputStream("C:\\Users\\SSLTP11355\\Music\\home.txt");
			// BufferedReader br=new
			// BufferedReader("C:\\Users\\SSLTP11355\\Music\\home.txt");
			int i;
			FileReader fr = new FileReader("C:\\Users\\SSLTP11355\\Music\\home.txt");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\SSLTP11355\\Music\\example.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((i = br.read()) != -1) {

				fout.write((char) i);
			}

			fout.write(92);
			String output = "sting in the flying buddha ";
			fout.write(output.getBytes());
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
