package com.hawk.c01.custom.io;

import java.io.IOException;
import java.util.Properties;

public class UseProperties {
	public static void main(String[] args) {
		Properties configProperty = new Properties();
		
		try {
			configProperty.load(UseProperties.class.getClassLoader().getResourceAsStream("com/hawk/c01/custom/io/config.properties"));
			String name = (String) configProperty.get("name");
			Object age = configProperty.get("age");
			System.out.println(name);
			System.out.println(Integer.valueOf(age.toString()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
