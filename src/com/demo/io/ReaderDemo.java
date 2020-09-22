package com.demo.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) {
		
     FileReader fr = null;
     
      try {
		fr = new FileReader("abc.txt");
		
		int ch;
		
		while((ch= fr.read()) != -1) {
			System.out.print((char)ch);
		}
		 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
     

	}

}
