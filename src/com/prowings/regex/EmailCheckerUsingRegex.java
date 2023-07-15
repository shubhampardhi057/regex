package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheckerUsingRegex {
	
	public static void main(String[] args) {
		
		boolean res = isValidEmail("bob-smith@foo.com");
		
		if(res)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		
		
	}

	private static boolean isValidEmail(String inputEmail) {

		Pattern pattern = Pattern.compile("^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{2,3}$");
		
		Matcher matcher = pattern.matcher(inputEmail);
		
		boolean res = matcher.find();
		
		return res;
	}

}
