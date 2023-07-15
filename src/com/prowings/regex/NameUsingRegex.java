package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameUsingRegex {
	
	public static void main(String[] args) {
		
		boolean res = isValidName("Shubham");
		
		if(res)
			System.out.println("Valid Name");
		else
			System.out.println("Invalid Name");
		
	}

	private static boolean isValidName(String inputName) {
		
		Pattern pattern = Pattern.compile("\\p{Upper}(\\p{Lower}+\\s?)");
		
		Matcher matcher = pattern.matcher(inputName);
		
		boolean res = matcher.find();
		
		return res;
	}

}
