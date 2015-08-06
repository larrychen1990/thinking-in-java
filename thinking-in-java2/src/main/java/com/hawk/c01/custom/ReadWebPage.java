package com.hawk.c01.custom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadWebPage {
	public static void main(String[] args) {
		// ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
		try {
//			URL google = new URL("http://www.google.com/");
			URL google = new URL("www.google.com/");
			BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
			
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}

}
