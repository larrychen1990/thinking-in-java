package com.hawk.c01.custom.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
public static void main(String[] args) {
	String str = "programcreek";
	
	// .*program(?=creek).*  look ahead
	// .*(?<=program)creek.* look behind
	Pattern p = Pattern.compile(".*program(?=creek).*");
	Matcher m = p.matcher(str);
	 
	if(m.matches()){
		System.out.println("Match!");
	}else{
		System.out.println("No");
	}
}
}
