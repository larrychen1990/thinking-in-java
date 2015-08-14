package com.hawk.c01.custom.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.common.io.Files;

@FixMethodOrder(MethodSorters.JVM)
public class ReadLineFile {
	File dir;
	File file;
	
	@Before
	public void Before() throws IOException{
		dir = new File("src/main/java/com/hawk/c01/custom/io");
		file = new File(dir.getCanonicalPath() + File.separator + "out.txt");
	}

	// BufferedReader InputStreamReader
	@Test
	@Ignore
	public void readFile1() throws IOException{
		FileInputStream fis = new FileInputStream(file);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
	
	// BufferedReader FileReader
	@Test
	@Ignore
	public void readFile2() throws IOException{
		BufferedReader bw = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = bw.readLine()) != null) {
			System.out.println(line);
		}
		bw.close();
	}
	
	// BufferedReader Files.newReader JDK1.7
	@Test
	public void readFile3() throws IOException{
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newReader(file, charset)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			 System.err.format("IOException: %s%n", e);
		}
		
	}
}
