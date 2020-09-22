package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(4, "XUS", 2000);
		
		Employee e2 = new Employee(2, "JHJ", 1000);
		
		Employee e3 = new Employee(3, "ABC", 5000);
		
		Employee e4 = new Employee(6, "JHJ", 1000);
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(e1);
		
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		//System.out.println(empList);
		
		//Collections.sort(empList);
		
		
		Comparator<Employee> nameComparator = (c,d)->d.getName().compareTo(c.getName());
		
		Comparator<Employee> salaryComparator = (c,d) ->{
			if(c.getSalary() == d.getSalary()) {
				return 0;
			}else if (c.getSalary() >d.getSalary()) {
				return 876;
			}else {
				return -1;
			}
		};
		
		IdComparator idcomparator = new IdComparator();
		
		Collections.sort(empList,nameComparator.thenComparing(salaryComparator).thenComparing(idcomparator));
		for(Employee e : empList ) {
			System.out.println(e.toString());
		}
		
		
		

	}

}
