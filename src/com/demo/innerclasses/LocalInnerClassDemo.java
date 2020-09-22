package com.demo.innerclasses;

public class LocalInnerClassDemo {
	
	private int var =876;
	void  m() {
		class Local{
			
			void msg() {
				System.out.println("Local inner class accessing outer class var :"+ var) ;
			}
		
		}
		
		Local l = new  Local();
		l.msg();
		
	}
	
	public static void main(String[] args) {
		
 LocalInnerClassDemo ld = new LocalInnerClassDemo();
 ld.m();

	}

}
