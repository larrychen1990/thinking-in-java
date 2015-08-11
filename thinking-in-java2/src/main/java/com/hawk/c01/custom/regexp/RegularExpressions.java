package com.hawk.c01.custom.regexp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class RegularExpressions {

	@Test
	@Ignore
	public void lookAround() {
		String str = "programcreek";

		// .*program(?=creek).* look ahead
		// .*(?<=program)creek.* look behind
		Pattern p = Pattern.compile(".*program(?=creek).*");
		Matcher m = p.matcher(str);

		if (m.matches()) {
			System.out.println("Match!");
		} else {
			System.out.println("No");
		}
	}

	@Test
	@Ignore
	public void findingReapeatPattern() {
		String str = "123123";
		Pattern p = Pattern.compile("(\\d\\d\\d)\\1");
		Matcher m = p.matcher(str);
		System.out.println(m.groupCount());

		while (m.find()) {
			String word = m.group();
			System.out.println(word + " " + m.start() + " " + m.end());
		}
	}

	@Test
	@Ignore
	public void findingDuplicateWordsPattern() {
		String pattern = "\\b(\\w+)\\b[\\w\\W]*\\b\\1\\b";
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		String phrase = "unique is not duplicate but unique, Duplicate is duplicate.";

		Matcher m = p.matcher(phrase);
		System.out.println(m.groupCount());
		while (m.find()) {
			String val = m.group();
			System.out.println("Matching subsequence is \"" + val + "\"");
			System.out.println("Duplicate word: " + m.group(1) + "\n");
		}
	}

	@Test
	@Ignore
	public void getkeywords() {
		String keyString = "abstract assert boolean break byte case catch "
						+ "char class const continue default do double else enum"
						+ " extends false final finally float for goto if implements "
						+ "import instanceof int interface long native new null "
						+ "package private protected public return short static "
						+ "strictfp super switch synchronized this throw throws true "
						+ "transient try void volatile while";
		String[] keys = keyString.split(" ");
		String keyStr = StringUtils.join(keys, "|");

		String regexp = "\\b(" + keyStr + ")\\b";
		String target = "static public staticpublic void main()";

		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(target);

		while (m.find()) {
			System.out.println("|" + m.group() + "|");
			System.out.println(m.start());
			System.out.println(m.end());
		}
	}

	@Test
	@Ignore
	public void stringToNewLine() {
		String string = "Hello Kitty!\\rHow are you? Lee";
		String[] newLines = string.split("\\r?\\n");
		System.out.println(newLines);
	}

	@Test
	@Ignore
	public void testPrime() {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
	}
	
	@Test
	@Ignore
	public void splitComma(){
		 String line = "aaa,bbb,\"c,c\",dd;dd,\"e,e";
		  List<String> toks = splitComma(line);
		  for (String t : toks) {
		    System.out.println("> " + t);
		  }
	}
	
	@Test
	public void splitCamelCaseString(){
		LinkedList<String> splitCamelCaseString = splitCamelCaseString("aCamelString");
		System.out.println(splitCamelCaseString);
		
	}
	
	

	private boolean isPrime(int n) {
		return !new String(new char[n]).matches(".?|(..+?)\\1+");
	}

	private List<String> splitComma(String str) {
		int start = 0;
		List<String> toks = new ArrayList<String>();
		boolean withinQuote = false;
		for (int end = 0; end < str.length(); end++) {
			char c = str.charAt(end);
			switch (c) {
			case ',':
				if (!withinQuote) {
					toks.add(str.substring(start, end));
					start = end + 1;
				}
				break;
			case '\"':
				withinQuote = !withinQuote;
				break;
			}
		}
		if (start < str.length()) {
			toks.add(str.substring(start));
		}
		return toks;
	}
	
	//accept a string, like aCamelString
	//return a list containing strings, in this case, [a, Camel, String]
	public LinkedList<String> splitCamelCaseString(String s){
	    LinkedList<String> result = new LinkedList<String>();	
	    for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
	    	result.add(w);
	    }    
	    return result;
	}
}
