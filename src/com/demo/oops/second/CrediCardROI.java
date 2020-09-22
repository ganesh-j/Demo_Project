package com.demo.oops.second;

public class CrediCardROI extends RateOfInterest {
	
	float interestRate = 35.0f;
	
	public float getDefaultInterestRate() {
		return interestRate;
	}
	
	
	public void printCardDetails() {
		System.out.println(" credit card issued");
	}

}
