package com.demo.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(40);
		
		List<Integer> marksImmutable = Arrays.asList(79,98,90);
		
		Student s1 = new Student(1,"abc",marksImmutable);
		
		System.out.println(s1);
		//marksImmutable.add(878);		
		
		//final class
		//constructor using fields
		//only getters
		//Arrays.asList
		
		
		

	}

}
