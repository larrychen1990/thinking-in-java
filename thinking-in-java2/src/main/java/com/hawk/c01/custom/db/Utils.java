package com.hawk.c01.custom.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class Utils {
	public static String loadString(String name) {
		Properties p = new Properties();

		// Utils.class.getClassLoader().getResourceAsStream(name);

		try {
			p.loadFromXML(new FileInputStream(name));

		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p.getProperty("key");
	}

	public static void main(String[] args) {
		String loadString = loadString("src/main/java/com/hawk/c01/custom/db/sql.xml");
		System.out.println(loadString);
	}
}
