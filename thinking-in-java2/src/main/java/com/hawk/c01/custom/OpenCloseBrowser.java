package com.hawk.c01.custom;

public class OpenCloseBrowser {
	public static void main(String[] args) {
		while (true) {
			try {
//				Process p = Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe \"http://www.google.com\"");
				Process process = Runtime.getRuntime().exec("google-chrome www.google.com");
				Thread.sleep(5000);
				process.destroy();
				System.out.println("Return value is : " + process.waitFor());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
