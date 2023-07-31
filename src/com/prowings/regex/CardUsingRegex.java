package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//
public class CardUsingRegex {
	
	public static void main(String[] args) {
		
		boolean res = isValidCard("4123456789101122");
		
		if(res)
			System.out.println("Valid Card");
		else
			System.out.println("Invalid Card");
		
	}

	
	
	private static boolean isValidCard(String inputCard) {
		
         Pattern pattern = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
		
		Matcher matcher = pattern.matcher(inputCard);
		
		boolean res = matcher.find();
		
		
		
		return res;
	}

}
