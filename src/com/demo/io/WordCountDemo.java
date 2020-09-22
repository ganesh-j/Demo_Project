package com.demo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCountDemo {


		public static void main(String[] args) throws IOException {
			
			FileReader fr = new FileReader("/Users/ganesh/Learn/abc.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println("File opened and starting execution");
			String line;
			int wordCount =0;
			//Map<>
			while ((line = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(line);

				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					wordCount++;
				}

			}
			
			System.out.println("No of words in file :" + wordCount);
			
		}

}


