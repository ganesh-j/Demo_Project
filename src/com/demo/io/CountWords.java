package com.demo.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountWords {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("/Users/ganesh/Learn/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println("File opened and starting execution");
		String line;
		int wordCount =0;
		while ((line = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line);

			while (st.hasMoreTokens()) {
				wordCount++;
			}

		}
		
		System.out.println("No of words in file :" + wordCount);
		
	}

}
