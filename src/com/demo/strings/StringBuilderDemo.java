package com.demo.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int empId= 7;
    //  StringBuilder sb = new StringBuilder(); 
		
		StringBuffer sb = new StringBuffer();
      
      sb.append("select  * from emp");
      sb.append("where empId = ");
      sb.append(empId);
      
      System.out.println(sb.toString());
      
      

	}

}
