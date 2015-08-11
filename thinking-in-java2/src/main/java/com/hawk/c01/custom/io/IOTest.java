package com.hawk.c01.custom.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class IOTest {

	@Test
	public void testReadFileToCharArray() throws IOException{
		char[] readFileToCharArray = readFileToCharArray("pom.xml");
		System.out.println(readFileToCharArray);
	}
	
	
	public char[] readFileToCharArray(String filePath) throws IOException {
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
 
		char[] buf = new char[10];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			System.out.println(numRead);
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
 
		reader.close();
 
		return  fileData.toString().toCharArray();	
	}
}
