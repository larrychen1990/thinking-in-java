package com.hawk.c01.custom.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static List<Character> getDigitsInString(String string) {

		// 'null' as input is not allowed!
		if (string == null)
			throw new IllegalArgumentException("Input cannot be null.");

		List<Character> result = new ArrayList<Character>();

		for (char ch : string.toCharArray()) {
			if (Character.isDigit(ch)) {
				result.add(ch);
			}
		}

		// return result;

		if (result.isEmpty()) {
			// return Collections.<Character>emptyList();
			return null;
		} else {
			// return Collections.unmodifiableList(result);
			return result;
		}
	}

	public static void main(String[] i_arguments) {
		// String s = "asd123";
		String s = "asd";
		List<Character> digits = getDigitsInString(s);
		// System.out.println("Number of digits found in '" + s + "': " +
		// digits.size());
		
		int num_digits = digits != null ? digits.size() : 0;
		System.out.println ( "Number of digits found in '" + s + "': " + num_digits );

	}
}
