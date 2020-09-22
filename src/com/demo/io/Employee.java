package com.demo.io;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int salary;
	 transient String ssn;
	
	public Employee(int id, String name, int salary, String ssn) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getSsn() {
		return ssn;
	}
	
	
	
	

}
