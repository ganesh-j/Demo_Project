package com.demo.collections;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateImple implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		if(t%2 ==0) {
			return true;
		}
		return false;
	}
	
}
