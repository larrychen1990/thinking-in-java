package com.hawk.c01.custom.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransferFile {
	public static void main(String[] args) throws IOException {
		File dir = new File("src/main/java/com/hawk/c01/custom/io");
		String source = dir.getCanonicalPath() + File.separator + "Code.txt";
		String dest = dir.getCanonicalPath() + File.separator + "Dest.txt";
		
		File fin = new File(source);
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		
		FileWriter fw = new FileWriter(dest, true);
		
		BufferedWriter out = new BufferedWriter(fw);
		String line = null;
		while ((line = in.readLine()) != null) {
			out.write(line);
			out.newLine();
		}
		
		in.close();
		out.close();
		
		
	}
}
