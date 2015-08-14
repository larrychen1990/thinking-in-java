package com.hawk.c01.custom.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceVSAppend_Add {
	public static void main(String[] args) throws IOException {
		File dir = new File("src/main/java/com/hawk/c01/custom/io");
		String loc = dir.getCanonicalPath() + File.separator + "Code.txt";

		FileWriter fw = new FileWriter(loc, true);
		BufferedWriter out = new BufferedWriter(fw);

		out.write("something");
		out.newLine();

		out.close();
	}
}
