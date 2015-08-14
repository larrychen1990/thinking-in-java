package com.hawk.c01.custom.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class WriteLineFile {

	// FileOutputStream
	@Test
	@Ignore
	public void writeFile1() throws IOException {
		File file = new File("src/main/java/com/hawk/c01/custom/io/out.txt");
		FileOutputStream fos = new FileOutputStream(file);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		for (int i = 0; i < 10; i++) {
			bw.write("something");
			bw.newLine();
		}
		bw.close();
	}

	// FileWriter
	@Test
	@Ignore
	public void writeFile2() throws IOException {
		FileWriter fw = new FileWriter("src/main/java/com/hawk/c01/custom/io/out2.txt");
		for (int i = 0; i < 10; i++) {
			fw.write("something2\n");
		}
		fw.close();
	}

	// PrintWriter  provide additional methods than FileWriter
//	automatically invokes flush after every byte of data is written
	@Test
	public void writeFile3() throws IOException {
		PrintWriter pw = new PrintWriter("src/main/java/com/hawk/c01/custom/io/out3.txt");
		for (int i = 0; i < 10; i++) {
//			pw.write("somethin3\n");
			pw.println("somethin3");
		}
		pw.close();
	}
	
	// OutputStreamWriter
	@Test
	@Ignore
	public void writeFile4() throws IOException {
		File file = new File("src/main/java/com/hawk/c01/custom/io/out4.txt");
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		for (int i = 0; i < 10; i++) {
			osw.write("something4\n");
		}
		osw.close();
	}
}
