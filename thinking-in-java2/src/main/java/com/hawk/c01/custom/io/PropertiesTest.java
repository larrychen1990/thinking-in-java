package com.hawk.c01.custom.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;

public class PropertiesTest extends Properties {
	private static final long serialVersionUID = 1L;
	private static OutputStream os;
	private static InputStream is;

	@Test
	@Ignore
	public void loadProperties() {
		Properties configProperty = new Properties();

		try {
			configProperty.load(PropertiesTest.class.getClassLoader().getResourceAsStream(
							"com/hawk/c01/custom/io/config.properties"));
			String name = (String) configProperty.get("name");
			Object age = configProperty.get("age");
			System.out.println(name);
			System.out.println(Integer.valueOf(age.toString()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void loadXML() throws IOException {
		PropertiesTest pt = new PropertiesTest();
		os = new FileOutputStream("src/main/java/com/hawk/c01/custom/io/configProps.xml");
		pt.setProperty("name", "Larry");
		pt.setProperty("age", "23");
		pt.storeToXML(os, "My first xml", "gb2312");

		is = new FileInputStream("src/main/java/com/hawk/c01/custom/io/configProps.xml");
		pt.loadFromXML(is);
		String name = (String) pt.get("name");
		System.out.println(name);

	}
}
