package com.demo.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args) {
		FileWriter fw = null;
		
      try {
		 fw = new FileWriter("abc.txt");
		
		int ch =75;
		fw.write(ch);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
      
	}

}
