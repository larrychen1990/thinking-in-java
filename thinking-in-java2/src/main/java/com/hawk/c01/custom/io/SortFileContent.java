package com.hawk.c01.custom.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortFileContent {
	public static void main(String[] args) {
		try {
			sortObserve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void sortObserve() throws IOException {
		File fin = new File("src/main/java/com/hawk/c01/custom/io/input.txt");
		File fout = new File("src/main/java/com/hawk/c01/custom/io/sorted.txt");

		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

		String aLine;
		ArrayList<String> al = new ArrayList<String>();

		int i = 0;
		while ((aLine = in.readLine()) != null) {
			// get the lines you want, here I don't want something starting with
			// - or empty
			if (!aLine.trim().startsWith("-") && aLine.trim().length() > 0) {
				al.add(aLine);
				i++;
			}
		}

		Collections.sort(al);
		// output sorted content to a file
		for (String s : al) {
			System.out.println(s);
			out.write(s);
			out.newLine();
			out.write("-----------------------------------------");
			out.newLine();
		}

		in.close();
		out.close();
	}
}
