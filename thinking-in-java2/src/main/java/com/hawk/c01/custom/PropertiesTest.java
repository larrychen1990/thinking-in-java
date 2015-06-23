package com.hawk.c01.custom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest extends Properties {
	private static OutputStream os;
	private static InputStream is;

	/**
	 * 
	 */
	private static final long serialVersionUID = -4305953692034738745L;


	public static void main(String[] args) {
		PropertiesTest pt = new PropertiesTest();
		try {
			os = new FileOutputStream("src/com/eagle/c01/configProps.xml");
			pt.setProperty("name", "Larry");
			pt.setProperty("age", "23");
			pt.storeToXML(os, "My first xml","gb2312");
			
			
			is=new FileInputStream("src/com/eagle/c01/configProps.xml");
			pt.loadFromXML(is);
			String name = (String) pt.get("name");
			System.out.println(name);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
