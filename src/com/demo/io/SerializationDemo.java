package com.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		Employee e = new Employee(1, "abc", 1000, "96986");
		
		FileOutputStream fos = new FileOutputStream("/Users/ganesh/Learn/emp.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		oos.close();
		
		fos.close();
		
		
		

	}

}
