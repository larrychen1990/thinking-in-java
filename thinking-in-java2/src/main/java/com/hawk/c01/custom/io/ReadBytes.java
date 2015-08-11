package com.hawk.c01.custom.io;

import java.io.File;
import java.io.FileInputStream;

public class ReadBytes {
	public static void main(String[] args) {
		byte[] data = new byte[1024]; // allocates memory for 1024 bytes
		// be careful about how to declare an array in Java
		int readBytes;
		try {
			File file = new File("src/main/java/com/hawk/c01/custom/io/testfile");
			if(!file.exists() ){
				file.createNewFile();
			}
			
			FileInputStream in = new FileInputStream(file);

			while ((readBytes = in.read(data)) != -1) {
				// read(byte[] b)
				// Reads some number of bytes from the input stream and stores
				// them into the buffer array b.
				System.out.println("read " + readBytes + " bytes, and placed them into temp array named data");
				System.out.println("data :" + data[123]);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
