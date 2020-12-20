package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		//add log4j.jar to the project
		// copy log4j.properties directly inside the src folder
		// create the object in the code
		
		Logger app_log = Logger.getLogger("krunal");  // all the datas are stored in log4j properties file so we can modify it
		app_log.debug("hello");
		app_log.debug("we are writing into the log file");
		app_log.debug("starting the test case xyx test");
		app_log.debug("starting the test case xyz test1");
		
		
		
		

	}

}
