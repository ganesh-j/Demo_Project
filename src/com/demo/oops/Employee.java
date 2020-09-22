package com.demo.oops;

public class Employee {
	
	 int eid; //varibale name always starts with small letter .. employeeId
	  String name; //employeeName
	  Address add;
	  
	long salary;
	
	Employee(){
		System.out.println("This is default constructor");
	}
	
	
	Employee(int eid, String name){
		this.eid = eid;
		this.name = name;
		System.out.println("Id :" + eid + "name :" +name);
	}
	
	Employee(int eid, String name, long salary){
		this(eid,name);
		this.salary = salary;
		System.out.println(" salary :" + salary);
	}
	

	public static void main(String[] args) {
		
		Employee ganesh = new Employee();
		Employee intern = new Employee(1,"intern");
		Employee xyz = new Employee(2,"xyz", 5000);
		
		
	}

}
