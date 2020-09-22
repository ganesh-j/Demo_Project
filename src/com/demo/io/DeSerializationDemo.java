package com.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("/Users/ganesh/Learn/emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();	
			
			Employee emp = (Employee)obj;
			System.out.println( " Id " +emp.getId());
			System.out.println( " Name " +emp.getName());
			System.out.println( " salary" +emp.getSalary());
			System.out.println( " SSN " +emp.getSsn());
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
