package com.hawk.c01.custom.log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class ProgrammaticallyConfigureLog4j {
	/*
	 * get a static logger instance with name TestLog
	 */
	static Logger logger = Logger.getLogger(ProgrammaticallyConfigureLog4j.class.getName());
	Appender myAppender;
	SimpleLayout myLayout;

	public ProgrammaticallyConfigureLog4j() {
		/*
		 * Set logger priority level programmatically. Though this is better
		 * done externally
		 */
		logger.setLevel(Level.ALL);
		/*
		 * Instantiate a layout and an appender, assign layout to appender
		 * programmatically
		 */
		myLayout = new SimpleLayout();
		myAppender = new ConsoleAppender(myLayout); // Appender is Interface

		/* Assign appender to the logger programmatically */
		logger.addAppender(myAppender);

	}

	public void doSomething(int a, int b) {
		/*
		 * This log request enabled and log statement logged, since INFO = INFO
		 */
		logger.info("The values of parameters passed to method  do_something are: "+ a + ", " + b);
 
		/* this log request is not enabled, since DEBUG &lt; INFO */
		logger.debug("Operation performed successfully");
		Object x = null;
		if (x == null) {
			/*
			 *  * this log request is enabled and log statement logged, since
			 * ERROR * &gt; INFO
			 */
			logger.error("Value of X is null");

		}
	}

	public static void main(String[] args) {
		new ProgrammaticallyConfigureLog4j().doSomething(1, 3);
	}
}
