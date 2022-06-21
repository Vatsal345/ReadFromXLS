package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add log4j.jar
		//add log4j. properties to src folder
		//create the object
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello");
		print.debug("We are waiting in to a log file");
		print.debug("Starting the test case xyz test");
		print.debug("starting the test case xyz test");
		

	}

}
