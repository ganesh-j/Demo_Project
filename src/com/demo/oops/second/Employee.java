package com.demo.oops.second;

public class Employee {
	
	
	private int id;
	private String name;
	private String orgName = "Digix";
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public  int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOrgName() {
		return orgName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", orgName=" + orgName + "]";
	}

	
	
	
	
	
	
	
	
	

}
