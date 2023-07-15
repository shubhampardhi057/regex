package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile("hello",Pattern.CASE_INSENSITIVE);// Pattern
		
		Matcher matcher = pattern.matcher("hi hello how are you !!!");//Input
		
		boolean res = matcher.find();
		
		if(res)
			System.out.println("Match Found");
		else
			System.out.println("Match Not Found");
		
		
	}

}
