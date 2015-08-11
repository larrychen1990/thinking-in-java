package com.hawk.c01.custom.log4j;

import org.apache.log4j.Logger;

public class ConfigureLog4jExternally {
	static Logger myLogger = Logger.getLogger(ConfigureLog4jExternally.class.getName());

	public static void main(String[] args) {
		myLogger.info("testing");
		myLogger.warn("warning testing");
		myLogger.error("this is an error");
	}
}
