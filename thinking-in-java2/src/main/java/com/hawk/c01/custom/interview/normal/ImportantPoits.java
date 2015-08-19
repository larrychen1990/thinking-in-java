package com.hawk.c01.custom.interview.normal;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ImportantPoits {
	// int(type) followed ... (three dot's) is syntax of a variable argument.
	public static int sum(int... numbers) {
		// inside the method a variable argument is similar to an array.
		// number can be treated as if it is declared as int[] numbers;
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	// Assert
	private static int computerSimpleInterest(int principal, float interest,
			int years) {
		assert (principal > 0);
		return 100;
	}

	private static void tokenize(String string, String regex) {
		String[] tokens = string.split(regex);
		System.out.println(Arrays.toString(tokens));
	}

	private static void tokenizeUsingScanner(String string, String regex) {
		Scanner scanner = new Scanner(string);
		scanner.useDelimiter(regex);
		List<String> matches = new ArrayList<String>();
		while (scanner.hasNext()) {
			matches.add(scanner.next());
		}
		System.out.println(matches);
	}

	public static void main(String[] args) {
		// 3 Arguments
		System.out.println(sum(1, 4, 5));// 10
		// 4 Arguments
		System.out.println(sum(1, 4, 5, 20));// 30
		// 0 Arguments
		System.out.println(sum());// 0

		// assertion
		computerSimpleInterest(2, 3f, 2015);

		// RegExp
		tokenize("ac;bd;def;e", ";");// [ac, bd, def, e]
		tokenizeUsingScanner("ac;bd;def;e", ";");// [ac, bd, def, e]

		// Date
		// Increase 6 hrs
		Date date = new Date();
		date.setTime(date.getTime() + 6 * 60 * 60 * 1000);
		System.out.println(date);
		// Decrease 6 hrs
		date = new Date();
		date.setTime(date.getTime() - 6 * 60 * 60 * 1000);
		System.out.println(date);
		// format date
		System.out.println(DateFormat.getInstance().format(date));
		// it
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL,
				new Locale("it", "IT")).format(date));
		// China
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL,
				Locale.CHINA).format(date));
		// default US
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(
				date));
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(
				date));
		System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM)
				.format(date));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(
				date));

		// Calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		calendar.set(Calendar.DATE, 24);
		calendar.set(Calendar.MONTH, 8);
		calendar.set(Calendar.YEAR, 2010);
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.getFirstDayOfWeek());

		// Number format
		System.out.println(NumberFormat.getInstance().format(321.24f));
		System.out.println(NumberFormat.getInstance(new Locale("nl")).format(
				321.24f));
		System.out.println(NumberFormat.getInstance(Locale.GERMANY).format(
				321.24f));
		System.out
				.println(NumberFormat.getCurrencyInstance().format(40324.31f));
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("nl"))
				.format(40324.31f));

	}
}
