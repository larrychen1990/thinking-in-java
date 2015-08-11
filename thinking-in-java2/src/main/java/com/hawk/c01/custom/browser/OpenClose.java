package com.hawk.c01.custom.browser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OpenClose {
	public static void main(String[] args) {
		System.out.println("plase input a full valid web address, such as http://www.google.com");
		while (true) {
			Scanner in = new Scanner(System.in);

			String url = in.next();
			System.out.println("You input: " + url);

			// regular expression goes here

			Pattern pattern = Pattern.compile("http://.*");
			// In case you would like to ignore case sensitivity you could use
			// this
			// statement
			// Pattern pattern = Pattern.compile("\\s+",
			// Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(url);
			// Check all occurance
			if (matcher.find()) {
				// System.out.print("Start index: " + matcher.start());
				// System.out.print(" End index: " + matcher.end() + " ");
				// System.out.println(matcher.group());

				while (true) {
					try {
						Process p = Runtime.getRuntime().exec(
										"C:\\Program Files\\Internet Explorer\\iexplore.exe \"" + url + "\"");
						Thread.sleep(1000*10);
						p.destroy();
						System.out.println("executed! " + p.waitFor());
					} catch (Exception e) {
					}
				}
			} else {
				System.out.println("please input a valid address!");
			}
		}
	}
}
