package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberUsingRegex {
	
	public static void main(String[] args) {
		
		boolean res = isValidMobileNumber("9876543210");
		
		if(res)
			System.out.println("Valid Mobile Number");
		else
			System.out.println("Invalid Mobile Number");
	}

	private static boolean isValidMobileNumber(String inputMobileNumber) {
		
		Pattern pattern = Pattern.compile("\\d{10}");
		
		
		Matcher matcher = pattern.matcher(inputMobileNumber);
		
		boolean res = matcher.find();
		
		
		return res;
	}
	
	

}
