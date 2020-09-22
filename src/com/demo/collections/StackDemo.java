package com.demo.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push(20);
        
        stack.push(10);
        stack.push(16);
        stack.push(15);
        stack.push(30);
        stack.push(25);
        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        stack.pop();
        System.out.println(stack);
        
        System.out.println(stack.size());
        
       
        
        
        
        
        

	}

}
