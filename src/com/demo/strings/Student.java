package com.demo.strings;

import java.util.List;

public final class Student {
	
	 int id ;
	 String name;
	 List<Integer> marks ;
	 
	public Student(int id, String name, List<Integer> marks2) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks2;
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

	
	
	

}
